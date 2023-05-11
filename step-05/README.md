## 核心设计
step-05 主要是新增了资源加载模块。顶层接口为 Resource。有了资源加载模块就可以使用配置文件来完成 Bean 的配置了。

Resource 下的实现类分别有 ClassPathResource，FileSystemResource，UrlResource，分别对应的是资源的不同来源。
Resource 再通过 ResourceLoader 进行加载，之后再由 XmlBeanDefinitionReader 加载便可成为 BeanDefinition，Bean 的构建模版。