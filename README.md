dropwizard
==========

## 简介

> * Dropwizard是一个开源Java框架，用于开发高性能、RESTful Web服务。Dropwizard采用了成熟、稳定的库，简化了RESTful Web服务的开发。
> * Dropwizard开箱即用，支持复杂的配置、日志等等。
> * 1. Dropwizard采用Jetty项目的HTTP库处理HTTP请求；
> * 2. Dropwizard采用Jersey处理REST服务；
> * 3. Dropwizard采用Jackson库处理JSON数据。
> * 除了以上三个库，Dropwizard还采用了：
> * 1. Guava库，处理高度优化的不可变数据结构；
> * 2. Logback和SFL4J处理日志；
> * 3. Hibernate Validator验证用户输入，输出国际化的错误消息；
> * 4. Apache HttpClient和Jersey Client库，分别处理高级和低级的Web服务交互；
> * 5. JDBI库与关系数据库交互；
> * 6. FreeMarker库是一个简单的模板系统，处理面向用户的服务。

## 开发流程(参考官方网站)

  可以下载demo运行了解运行原理,注意:本工程是基于idea+maven开发.

## 关键部分

> * 请求参数如何接收.

  @QueryParam   客户端上传的参数为URL参数
  @PathParam    客户端上传的参数为url路径参数
  @HeadParam    客户端上传的参数为头部参数
  @FormParam    客户端上传的参数为表单参数
  byte[]        客户端上传的文件等以流形式传送

> * 静态资源文件如何访问

  只需要注册下资源文件的路径,在Service类initialize方法中
  
    bootstrap.addBundle(new AssetsBundle("/css"));
    
> * 接口资源的注册

  只需要在Service类run方法中
  
  environment.addResource(new PictureResource());
  
> * 前台页面的使用

  只需要注册模板文件解释器,在Service类initialize方法中
  bootstrap.addBundle(new ViewBundle());
  在接口返回View时候,指定页面路径
  
  
  
## 关于作者

> * 有什么疑问,请联系我,254608684@qq.com
