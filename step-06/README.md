## 核心设计
step-06 新引入了上下文内容，也是 ApplicationContext，同时还引入了两个很重要的容器拓展功能的接口，也就是 BeanFactoryPostProcessor 
和 BeanPostProcessor。

ApplicationContext 接口的定义是继承 BeanFactory 外新增功能的接口，它可以满足于自动识别、资源加载、容器事件、监听器等功能，
BeanFactoryPostProcessor 则是用于在 Bean 对象实例化前对 BeanDefinition 进行修改，BeanPostProcessor 则是对 Bean 对象初始化前后进行修改。