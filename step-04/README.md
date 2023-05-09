## 核心设计
step-04新增了对象属性的填充，前面只是对 Bean 对象进行了实例化，并未对 Bean 对象进行属性的填充。
所以这部分新增了几个核心的内容，PropertyValues，BeanReference。

属性填充需要在类实例化创建之后，也就是需要在 AbstractAutowireCapableBeanFactory 的 createBean 方法中添加 applyPropertyValues 操作。
所以在 Bean 对象初始化的时候，需要 PropertyValues，那么就需要在 BeanDefinition 中添加新的属性 PropertyValues。

另一个重要的类就是 BeanReference，这个类中存放的就是 beanName，这个是为了在具体实例化的操作时进行递归创建和填充。
因为在类的属性填充的时候，会遇到 Bean 的属性为 Bean 对象，需要进行递归处理。