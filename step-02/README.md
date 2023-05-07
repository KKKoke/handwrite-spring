## 核心设计
step-02在上一步的基础上丰富了容器的概念，也新增了单例 Bean 对象的注册，同时也对 BeanDefinition 的属性进行了更迭。

顶层接口为 BeanFactory，SingletonBeanRegistry，BeanDefinitionRegistry。
BeanFactory，提供 Bean 的获取抽象方法。
SingletonBeanRegistry，提供单例 Bean 对象的注册。
BeanDefinitionRegistry，提供 BeanDefinition 的注册。

SingletonBeanRegistry 的具体实现为 DefaultSingletonBeanRegistry，该实现类丰富了 SingletonBeanRegistry。新增了单例 Bean 对象的缓存 singletonObjects。
同时新增了添加单例 Bean 的方法 addSingleton(String beanName, Object singletonObject)，使单例 Bean 对象的注册与获取功能完善。

之后由 AbstractBeanDefinition 实现 BeanFactory，同时继承 DefaultSingletonBeanRegistry。该抽象类，在上面两个类的基础上又丰富了 Bean 工厂的功能。
新增了 getBeanDefinition(String beanName) 与 createBean(String beanName, BeanDefinition beanDefinition)。
其中 createBean(String beanName, BeanDefinition beanDefinition)是用于辅助实现 getBean(String name)的。

AbstractBeanDefinition 的实现类为 AbstractAutowireCapableBeanFactory，该类主要功能是具体实现 createBean(String beanName, BeanDefinition beanDefinition)。
使用 class 的 newInstance() 方法来构建 Bean 对象。同时将构建的 Bean 对象存放到单例 Bean 缓存中，也就是 singletonObjects。

之后的集大成者便是 DefaultListableBeanFactory，该类继承于 AbstractAutowireCapableBeanFactory，同时实现了 BeanDefinitionRegistry 接口。
使其具备了 BeanDefinition 的注册功能。