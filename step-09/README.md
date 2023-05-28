## 核心设计
step-09 这一部分主要是完善了 Bean 的定义信息，可以指定 Bean 是原型类型还是单例类型。同时还引入了 FactoryBean。使得 Bean 的功能又得到了
扩展，FactoryBean 本身也是 Bean 的一种，但是可以通过自身 getObject() 方法构建出具体调用对象的 Bean。

那么本次新功能的实现需要先完善 BeanDefinition，在原来的基础上新增了 scope、singleton、prototype 属性，同时也需要修改 XmlBeanDefinitionReader
类，添加新的 xml 标签属性解析功能 scope。

之后便是引入 FactoryBean 接口，定义了三个必要的抽象方法 getObject()，isSingleton()，getObjectType()。

然后再引入 FactoryBean 功能的支持类，FactoryBeanRegistrySupport，这个类采用 ConcurrentHashMap 缓存了 FactoryBean，同时提供了调用
FactoryBean#getObject() 的方法 doGetObjectFromFactoryBean()。

在 AbstractAutowireCapableBeanFactory#createBean() 中，createBean 执行对象创建、属性填充、依赖加载、前置后置处理、初始化等操作后，
就要开始做执行判断整个对象是否是一个 FactoryBean 对象，如果是这样的对象，就需要再继续执行获取 FactoryBean 具体对象中的 getObject 对象了。
整个 getBean 过程中都会新增一个单例类型的判断 factory.isSingleton()，用于决定是否使用内存存放对象信息。

关于提供一个能让使用者定义复杂的 Bean 对象，功能点非常不错，意义也非 常大，因为这样做了之后 Spring 的生态种子孵化箱就此提供了，谁家的框架
都可以在此标准上完成自己服务的接入。但这样的功能逻辑设计上并不复杂，因为整个 Spring 框架在开发的过程中就已经提供了各项扩展能力的接茬，你只需
要在合适的位置提供一个接茬的处理接口调用和相应的功能逻辑实现即可，像这里的目标实现就是对外提供一个可以二次从 FactoryBean 的 getObject 方法
中获取对象的功能即可，这样所有实现此接口的对象类，就可以扩充自己的对象功能了。MyBatis 就是实现了一个 MapperFactoryBean 类，在 getObject 
方法中提供 SqlSession 对执行 CRUD 方法的操作。