## 核心设计

step-11 旨在实现 AOP 的功能，而 AOP 的核心技术实现主要是动态代理。比如你可以给一个接口的实现类，使用代理的方式替换掉这个实现类，使用代理类来处理你需要的逻辑。有了代理类的思路后，就需要考虑给方法做代理了，而不是代理类。如果可以代理所有类的方法，就可以做一个方法拦截器，给所有被代理的方法添加上一些自定义处理，比如打印日志、记录耗时、监控异常等。

将需要代理的方法匹配出来，就需要用到切点表达式。切点表达式包括 Pointcut、ClassFilter、MethodMatcher。其中 Pointcut 切入点接口，定义用
于获取 ClassFilter、MethodMatcher，这两个类都是切点表达式提供的内容。ClassFilter 定义类匹配器，用于切点找到给定的接口和目标类。

具体实现切点表达式类为 AspectJExpressionPointcut，这个类实现了 Pointcut、ClassFilter、MethodMatcher。这个类主要是对 aspectj 包提供的表达式校验方法使用。

为了方便在 Proxy 实现类进行使用，会采用 AdvisedSupport 将代理、拦截、匹配的各项属性包装到一个类中。

之后便是代理抽象实现了，AopProxy，用于获取代理类。之后的具体实现为 Cglib2AopProxy，JdkDynamicAopProxy。