## 核心设计思路
BeanDefinition 还是作为 Bean 生成的模版，模版内的信息比较简单，直接采用 Object 进行简化。
BeanFactory 具备 BeanDefinition 的注册及 Bean 的获取。
Spring Container 就是简化为一个存储 BeaBeanDefinition 的 ConcurrentHashMap。