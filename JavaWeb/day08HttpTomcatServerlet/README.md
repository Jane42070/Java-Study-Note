# JavaWeb 技术栈

- B/S 架构：Browser/Server，浏览器/服务器 架构模式
- 特点是：客户端只需要浏览器，应用程序的逻辑和数据都存储在服务器端，浏览器只需要请求服务器发送Web资源
- 好处：易于维护升级，服务器升级后，客户端无需任何部署，就可以使用到新的版本
- 静态资源：HTML，CSS，JavaScript，图片等，负责页面展现
- 动态资源：Servlet，JSP等，负责处理逻辑
- 数据库：负责存储数据
- HTTP 协议：定义通信规则
- Web 服务器：负责解析 HTTP 协议，解析请求数据，并发送响应数据

## HTTP

- 概念：超文本传输协议 HyperText Transfer Protocol
- 规定了浏览器和服务器之间数据传递的规则
- Http 是无状态的协议：对于事务处理没有记忆能力，每次请求-响应都是独立的。
	- 缺点：多次请求间不能共享数据，Java 中使用会话技术（Cookie、Session）来解决这个问题
	- 优点：速度快

### HTTP 请求数据格式

- 请求数据分为 3 部分
	- 请求行：请求数据的第一行，其中 GET 表示请求方式，/ 表示请求资源路径，HTTP/1.1 表示协议版本
	- 请求头：第二行开始，格式为 key：value 形式
	- 请求体：POST 请求的最后一部分，存放请求参数

### HTTP 响应数据格式

- 相应数据分为 3 部分
	- 响应行：响应数据的第一行，其中 HTTP/1.1 表示协议版本，200 表示响应状态码，OK 表示状态码描述
	- 响应头：第二行开始，格式为 key：value 形式
	- 响应体：最后一部分，存放响应数据

## Web 服务器

- 是一个应用程序，对 HTTP 协议的操作进行封装，使得程序员不必对协议进行操作，让 Web 开发更加便捷
- 主要功能是"提供网上信息浏览服务"

### Tomcat

- 概念
	- Tomcat是Apache软件基金会一个核心项目，是一个开源免费的轻量级Web服务器
	- 支持Servlet/JSP少量JavaEE规范
- JavaEE
	- Java Enterprise Edition，Java 企业版，指企业级开发的技术规范总和
	- 包含十三项技术规范：JDBC、JNDI、EJB、RMI、JSP、Servlet、XML、JMS、Java IDL、JTS、JTA、JavaMail、JAF
- Tomcat 也被称为 Web 容器、Servlet 容器。Servlet 需要依赖 Tomcat 才能运行

## Servlet

- 是 Java 提供的一门动态 web 资源开发技术
- 执行流程
	- Servlet 由谁创建？Servlet 方法由谁调用？
	- 由 Tomcat web 服务器创建， Tomcat web 服务器调用
	- 服务器怎么知道 Servlet 中一定有 service 方法

### Servlet 生命周期

- 对象的生命周期指一个对象从被创建到被销毁的整个过程
- Servlet 运行在 Servlet 容器（web 服务器中），其生命周期由容器来管理，分为4个阶段
	- 加载和实例化：默认情况下，当 Servlet 第一次被访问时，由容器创建 Servlet 对象
	- 初始化：在 Servlet 实例化后，容器将调用 Servlet 的 init() 方法初始化这个对象，完成一些如加载配置文件、创建连接的那个初始化的工作，该方法指调用一次
	- 请求处理：每次请求 Servlet 的时候，Servlet 容器都会调用 Servlet 的 service() 方法对请求进行处理
	- 服务终止：当需要释放内存或者容器关闭时，容器就会调用 Servlet 实例的 destroy() 方法完成资源释放
		- 在方法调用后，容器会释放这个 Servlet 实例，该实例随后被 Java 的垃圾回收机制所回收

### Servlet 方法介绍

- 初始化方法，在 Servlet 被创建的时候执行，只执行一次
- `void init(ServletConfig config)`
- 提供服务方法，每次 Servlet 被访问，都会调用该方法
- `void service(ServletRequest request, ServletResponse response)`
- 销毁方法，当 Servlet 被销毁时，调用该方法。在内存释放或服务器关闭时，销毁 Servlet
- `void destroy()`
- 获取 ServletConfig 对象
- `ServletConfig getServletConfig()`
- 获取 Servlet 信息
- `String getServletInfo()`

### Servlet 体系结构

- Servlet 