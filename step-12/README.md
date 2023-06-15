## 核心设计

这一步是将 AOP 扩展到了 Bean 的生命周期，核心思路是利用 BeanPostProcessor 把动态代理融入到 Bean 的生命周期中。

为了可以让对象创建过程中，能把 xml 中配置的代理对象也就是切面的一些对象实例化，就需要用到 BeanPostProcessor 提供的方法，因为这个类中的方法可以分别作用于 Bean 对象执行初始化前后修改 Bean 的对象的扩展信息。但这里需要集合于 BeanPostProcessor 实现新的接口和实现类，这样才能定向获取对应的类信息。

但因为创建的是代理对象不是之前流程里的普通对象，所以需要前置于其他对象的创建，所以在实际开发的过程中，需要在 AbstractAutowireCapableBeanFactory#createBean 优先完成 Bean 对象的判断，是否需要代理，有则直接返回代理对象。在 Spring 的源码中会有 createBean 和 *doCreateBean 的方法拆分*。这里还包括要解决方法拦截器的具体功能，提供一些 BeforeAdvice、AfterAdvice 的实现，让用户可以更简化的使用切面功能。除此之外还包括需要包装切面表达式以及拦截方法的整合，以及提供不同类型的代理方式的代理工厂，来包装切面服务。

首先定义了 BeforeAdvice 接口，继承自 Advice，用来实现标记前置通知。再定义 MethodBeforeAdvice 继承自 BeforeAdvice，其中定义了一个抽象方法 before()，用来实现具体的前置通知逻辑。

同时定义了 Advisor 访问者，其中有一个抽象方法 getAdvice()，其子类 PointcutAdvisor，拥有方法 getPointcut()，可以获得 Pointcut 切入点。也就是说 Advisor 承担了 Pointcut 和 Advice 的组合，Pointcut 用于获取 JoinPoint，而 Advice 决定于 JoinPoint 执行什么操作。

PointcutAdvisor 的实现类 AspectJExpressionPointcutAdvisor，拥有属性 AspectJExpressionPointcut，Advice，expression。AspectJExpressionPointcutAdvisor 实现了 PointcutAdvisor 接口，把切入点 pointcut、拦截方法 advice 和具体的拦截表达式包装在一起。这样就可以在 xml 

的配置中定义一个 pointcutAdvisor 切面拦截器了。

接下来便是定义 MethodBeforeAdviceInterceptor 方法拦截器，该类实现了 MethodInterceptor 接口。在 invke() 方法中调用 advice 中的 before 方法，传入对应的参数信息。

为了创建代理对象就需要 ProxyFactory 代理工厂。他有两个具体的实现类 Cglib2AopProxy 和 JdkDynamicAopProxy，分别对应两种动态代理的方式。

之后便是融入 Bean 生命周期的自动代理创建者。

DefaultAdvisorAutoProxyCreator 类的主要核心实现在于 postProcessBeforeInstantiation() 方法中，从通过 beanFactory.getBeansOfType() 获取 AspectJExpressionPointcutAdvisor 开始。获取了 advisors 以后就可以遍历相应的 AspectJExpressionPointcutAdvisor 填充对应的属性信息，包括：目标对象、拦截方法、匹配器，之后返回代理对象即可。那么现在调用方获取到的这个 Bean 对象就是一个已经被切面注入的对象了，当调用方法的时候，则会被按需拦截，处理用户需要的信息。

