## 核心设计

这一步是在前面的基础上添加一些自动化的功能，包括：包的扫描注册、注解配置的使用，占位符属性的填充等。

首先我们要考虑，为了简化 Bean 对象的配置，让整个 Bean 对象的注册都是自动扫描的，那么基本需要的元素包括：扫描路径入口、XML 解析扫描信息、给需要扫描的 Bean 对象做注解标记、扫描 Class 对象摘取 Bean 注册的基本信息、组装注册信息、注册成 Bean 对象。

除此之外再顺带解决一个配置中占位符属性的知识点，可以通过 ${token} 给 Bean 对象注入进去属性信息，那么这个操作需要用到 BeanFactoryPostProcessor，因为它可以处理 **在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制**，而实现这部分内容是为了后续把此类内容结合到自动化配置处理中。

结合 bean 的生命周期，包扫描只不过是扫描特定注解的类，提取类的相关信息组装成 BeanDefinition 注册到容器中。

在 XmlBeanDefinitionReader 中解析 <context:component-scan /> 标签，扫描类组装 BeanDefinition 然后注册到容器中的操作在ClassPathBeanDefinitionScanner#doScan() 中实现。 

自动扫描注册主要是扫描添加了自定义注解的类，在 xml 加载过程中提取类的信息，组装 BeanDefinition 注册到 Spring 容器中。

所以我们会用到 <context:component-scan /> 配置包路径并在 XmlBeanDefinitionReader 解析并做相应的处理。*这里的处理会包括对类的扫描、获取注解信息等*。 

最后还包括了一部分关于 BeanFactoryPostProcessor 的使用，因为我们需要完成对占位符配置信息的加载，所以需要使用到 BeanFactoryPostProcessor 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，修改 BeanDefinition 的属性信息。*这一部分的实现也为后续处理关于占位符配置到注解上做准备。*