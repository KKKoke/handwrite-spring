## 核心设计

本步骤要解决的是如何给代理对象中的属性填充对应的值，因为在之前把 AOP 动态代理，融入到 Bean 的生命周期时，创建代理对象是在整个创建 Bean 对象之前，也就是说这个代理对象并不是在 Bean 生命周期中。

所以在这一步中，我们要把代理对象的创建融入到 Bean 的生命周期中，也就是需要把创建代理对象的逻辑迁移到 Bean 对象执行初始化方法之后，再执行代理对象的创建。

按照创建代理对象的操作 DefaultAdvisorAutoProxyCreator 实现的 InstantiationAwareBeanPostProcessor 接口，那么原本在 Before 中的操作，则需要放到 After 中处理。

在创建 Bean 对象 createBean 的生命周期中，有一个阶段是在 Bean 对象属性填充完成以后，执行 Bean 的初始化方法和 BeanPostProcessor 的前置和后置处理，例如：感知 Aware 对象、处理 init-method 方法等。那么在这个阶段的 BeanPostProcessor After 就可以用于创建代理对象操作。

在 DefaultAdvisorAutoProxyCreator 用于创建代理对象的操作中，需要把创建操作从 postProcessBeforeInstantiation 方法中迁到 postProcessAfterInitialization，这样才能满足 Bean 属性填充后的创建操作。