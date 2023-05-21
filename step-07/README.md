## 核心设计
step-07 本步骤主要完成了关于初始和销毁在使用接口定义 implements InitializingBea，DisposableBean 和在 Spring.xml 中配置 init-method=
"initDataMethod" destroy-method="destroyDataMethod" 的两种具体在 AbstractAutoWireCapableBeanFactory 完成初始化方法和 AbstractApplicationContext
处理销毁动作的具体实现过程。

通过这些实现内容，可以看到目前这个 Spring 框架对 Bean 的操作越来越完善了，可以拓展性也不断地增强。既可以在 Bean 注册完成实例化前进行 BeanFactoryPostProcessor 
操作，也可以在 Bean 实例化过程中执行前置和后置操作，现在又可以执行 Bean 的初始化方法和销毁方法。现在 Bean 的功能已经不断在丰富和完善。