## 核心设计
step-10 在在面的基础上加上了 Event 事件功能，它可以提供事件的定义、发布以及监听事件来完成一些自定义的动作。该功能的实现需要在面向用户的应用上下文
AbstractApplicationContext 中添加相关事件内容，包括：初始化事件发布者、注册事件监听器、发布容器刷新完成事件。采用的就是观察者模式。

首先需要定义应用事件 ApplicationEvent，这个抽象类继承自 EventObject。再通过这个抽象类衍生出其他重要的事件，如：ApplicationContextEvent、
ContextClosedEvent、ContextRefreshedEvent。

另一个重要的组件便是事件监听器 ApplicationListener，负责监听到感兴趣的事件后做出相应的反应。

之后需要定义事件广播器 AbstractApplicationEventMulticaster，该抽象类中包含了监听器的注册操作。同时 SimpleApplicationEventMulticaster
继承自该类，它重写了 multicastEvent() 方法，完成具体事件监听器的调用。

事件广播器完成之后便是事件发布者 ApplicationEventPublisher 负责发布对应的事件。

基础的几个组件完成之后，便需要对之前的 AbstractApplicationContext 类做出相应的调整，这个类在原有的基础上多继承了 ApplicationEventPublisher，
同时新增了属性 applicationEventMulticaster。这使得容器上下文具备了事件的发布与广播功能。

然后对核心的 refresh() 方法做出相应的调整，加入了新的步骤，如：初始化事件发布者 initApplicationEventMulticaster()，注册事件监听器
registerListeners()，以及最后的发布容器刷新完成事件 finishRefresh()。