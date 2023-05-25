## 核心设计
step-08 的核心内容在于添加了 Aware 感知容器对象。通过 Aware 接口就可以使得 Bean 具有获取 Spring 框架所提供的 BeanFactory、ApplicationContext、
BeanClassLoader 的能力。

实现的原理就是利用 Aware 接口来进行标记。然后配合 instanceof 一起使用，来判断被标记的类。Aware 的子类具体有 BeanFactoryAware，BeanNameAware，
ClassLoaderAware，ApplicationContextAware，在 AbstractAutowireCapableBeanFactory#initializeBean()
时会处理 Aware 接口。调用对应的 setXXXX() 方法，为实现了 Aware 接口的类进行赋值操作。