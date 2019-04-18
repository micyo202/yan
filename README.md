# Yan 项目简介（Instruction）

### [English](https://github.com/micyo202/yan/blob/master/README_EN.md) [中文文档](https://github.com/micyo202/yan/blob/master/README.md)

<p align="center" >
  <img src="https://github.com/micyo202/yan/raw/master/yan-web/src/main/webapp/resources/images/logo.png" alt="Yan" title="Yan">
</p>

[![Beta](https://img.shields.io/badge/beta-1.0.1-brightgreen.svg)](https://github.com/micyo202/yan)
[![Downloads](https://img.shields.io/badge/downloads-3.9MB-yellow.svg)](https://github.com/micyo202/yan/archive/master.zip)
[![Since](https://img.shields.io/badge/since-2017-blue.svg)](https://github.com/micyo202/yan)
[![License MIT](https://img.shields.io/badge/license-MIT-lightgrey.svg)](https://github.com/micyo202/yan/blob/master/LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/micyo202/yan.svg?style=social&label=Stars)](https://github.com/micyo202/yan)
[![GitHub forks](https://img.shields.io/github/forks/micyo202/yan.svg?style=social&label=Fork)](https://github.com/micyo202/yan)

### 注：全新微服务项目**lion**已经逐步开发，基于SpringCloud的一整套方案，详情查看[https://github.com/micyo202/lion](https://github.com/micyo202/lion)

本项目是一整套整合 **Dubbo+Zookeeper+SpringMVC+Spring+MyBatis** 支持**分布式**的高效率便捷开发**RPC**框架，使开发人员更专注于业务，达到面向业务开发。<br>
项目使用 **Maven** 构建，便于项目管理，可支持 **Oracle、MySql** 等主流数据库。<br>
项目模块化分层明确，代码规范，便于后期维护等工作。<br>
前端展示界面采用基于 **Boostrap** 实现的响应式布局，并集成了一系列的动画效果插件，整体界面简洁、美观大方并可优雅的与后台完成交互操作。<br>
项目目标是为中小型企业打造全方位的J2EE企业级开发解决方案，提高工作效率。<br>
该项目是[yan-demo](https://github.com/micyo202/yan-demo)单节点项目的**升级版**，支持**分布式**

## 近期更新内容
* **beta 1.0.1：添加spring-session+redis技术，用于解决负载均衡下session共享问题**
* beta 1.0.0：项目整体改造，升级为RPC架构。（注：若想查看非RPC版请移步至[https://gitee.com/micyo202/yan](https://gitee.com/micyo202/yan)）
* beta 0.1.0：模块优化，删除不必要的模块，优化代码（模块详情参考：三、项目结构）
* beta 0.0.5：前端添加ECharts，便于图形化展示
* beta 0.0.4：添加JMS（ActiveMQ）消息服务（目前仅测试方法，暂无业务流转，后期逐渐完善细化）
* beta 0.0.3：添加Solr搜索引擎服务（基本的全文检索功能，可根据实际需求情况进行二次开发，后期本人再逐渐完善）
* beta 0.0.2：优化整体代码、添加更多注释，结构更清晰、代码更易懂
* beta 0.0.1：将原有[yan-demo](https://github.com/micyo202/yan-demo)项目重构，保留原有功能，模块拆分、优化项目结构

## 项目所需工具及版本 *
* zookeeper-3.4.11 [http://mirror.bit.edu.cn/apache/zookeeper/zookeeper-3.4.11](http://mirror.bit.edu.cn/apache/zookeeper/zookeeper-3.4.11)
* apache-activemq-5.15.2 [http://activemq.apache.org/activemq-5152-release.html](http://activemq.apache.org/activemq-5152-release.html)
* solr-7.1.0 [https://mirrors.tuna.tsinghua.edu.cn/apache/lucene/solr/7.1.0](https://mirrors.tuna.tsinghua.edu.cn/apache/lucene/solr/7.1.0)

## 一、项目开发环境&工具（Environment&Tools）
* MacOS Sierra / Windows 7
* MySql 5.7
* Redis 4.0.8
* JDK 1.8
* CentOS 7
* IntelliJ IDEA 2017.2.5 / Eclipse 4.6.1
* Navicat Premium 11.1.12
* Maven 3.3.9
* Jetty 9.4.6.v20170531 / Tomcat 9.0.1

## 二、技术选型（Technology）
#### 1.服务端技术（Server）
名称 | 版本号 | 网址
--- | --- | ---
Spring Framework | 4.3.13.RELEASE  | [http://projects.spring.io/spring-framework/](http://projects.spring.io/spring-framework/)
Shiro | 1.4.0 | [http://shiro.apache.org](http://shiro.apache.org)
AspectJ | 1.8.13 | [http://www.eclipse.org/aspectj/](http://www.eclipse.org/aspectj/)
MyBatis | 3.4.5 | [http://www.mybatis.org/mybatis-3/zh/index.html](http://www.mybatis.org/mybatis-3/zh/index.html)
MyBatis Generator | 1.3.5 | [http://www.mybatis.org/generator/index.html](http://www.mybatis.org/generator/index.html)
PageHelper | 5.1.2 | [http://git.oschina.net/free/Mybatis_PageHelper](http://git.oschina.net/free/Mybatis_PageHelper)
Dubbo | 2.6.0 | [http://dubbo.io](http://dubbo.io)
Solr | 7.1.0 | [https://lucene.apache.org/solr/](https://lucene.apache.org/solr/)
ActiveMQ | 5.15.2 | [http://activemq.apache.org](http://activemq.apache.org)
Druid | 1.1.5 | [https://github.com/alibaba/druid](https://github.com/alibaba/druid)
Redis | 4.0.8 | [https://redis.io](https://redis.io)
Jackson | 2.9.2 | [https://github.com/FasterXML/jackson](https://github.com/FasterXML/jackson)
Dom4j | 1.6.1 | [http://www.dom4j.org](http://www.dom4j.org)
Ehcache | 2.6.11| [http://www.ehcache.org/](http://www.ehcache.org/)
Logback | 1.2.3 | [https://logback.qos.ch](https://logback.qos.ch)
Maven | 3.3.9 | [http://maven.apache.org/](http://maven.apache.org/)
Zookeeper | 3.4.11 | [https://www.apache.org/dyn/closer.cgi/zookeeper/](https://www.apache.org/dyn/closer.cgi/zookeeper/)
#### 2.前端技术（Web）
名称 | 版本号 | 网址
--- | --- | ---
angular | - | [https://angularjs.org](https://angularjs.org)
awesome-bootstrap-checkbox | - | [https://github.com/flatlogic/awesome-bootstrap-checkbox](https://github.com/flatlogic/awesome-bootstrap-checkbox)
bootstrap | 3.3.7 | [http://www.bootcss.com](http://www.bootcss.com)
bootstrap-datetimepicker | - | [http://www.bootcss.com/p/bootstrap-datetimepicker/](http://www.bootcss.com/p/bootstrap-datetimepicker/)
bootstrap-select | 1.12.4 | [http://silviomoreto.github.io/bootstrap-select/](http://silviomoreto.github.io/bootstrap-select/)
bootstrap-table | 1.11.1 | [http://bootstrap-table.wenzhixin.net.cn/zh-cn/documentation/](http://bootstrap-table.wenzhixin.net.cn/zh-cn/documentation/)
bootstrapvalidator | 0.5.3 | [https://github.com/nghuuphuoc/bootstrapvalidator/](https://github.com/nghuuphuoc/bootstrapvalidator/)
ECharts | 3.8.4 | [http://echarts.baidu.com](http://echarts.baidu.com)
font-awesome | 4.7.0 | [http://fontawesome.io/icons/](http://fontawesome.io/icons/)
fontIconPicker | 2.0.0 | [https://codeb.it/fonticonpicker/](https://codeb.it/fonticonpicker/)
fullPage | - | [https://alvarotrigo.com/fullPage/](https://alvarotrigo.com/fullPage/)
jquery-confirm | 3.3.0 | [https://github.com/craftpip/jquery-confirm](https://github.com/craftpip/jquery-confirm)
malihu-custom-scrollbar-plugin | - | [https://github.com/videoMonkey/malihu-custom-scrollbar-plugin](https://github.com/videoMonkey/malihu-custom-scrollbar-plugin)
material-design-iconic-font | 2.2.0 | [https://github.com/zavoloklom/material-design-iconic-font](https://github.com/zavoloklom/material-design-iconic-font)
waves | 0.7.5 | [https://github.com/fians/Waves](https://github.com/fians/Waves)
zTree_v3 | 3.5.26 | [http://www.treejs.cn/v3/main.php#_zTreeInfo](http://www.treejs.cn/v3/main.php#_zTreeInfo)
BootstrapMenu | - | [https://mobirise.com/bootstrap-menu](https://mobirise.com/bootstrap-menu)
device | - | [https://github.com/matthewhudson/device.js](https://github.com/matthewhudson/device.js)
jquery | 3.2.1 | [http://jquery.com](http://jquery.com)
jquery-cookie | - | [https://github.com/carhartl/jquery-cookie](https://github.com/carhartl/jquery-cookie)

## 三、项目结构（Construction）
```lua
yan -- 根目录
├── yan-api -- 接口模块（提供核心接口方法）
|    ├── main -- 主模块路径
|    |    ├── java -- java类路径
|    |    |    ├── com.yan.api -- 核心接口包
|    |    |    |    ├── jms -- 消息服务接口
|    |    |    |    ├── persistence -- 持久化接口
├── yan-common -- 公共模块
|    ├── main -- 主模块路径
|    |    ├── java -- java类路径
|    |    |    ├── com.yan.common -- 公共类包
|    |    |    |    ├── annotation -- 注解类
|    |    |    |    ├── aspect -- 切面类
|    |    |    |    ├── constant -- 常量定义类
|    |    |    |    ├── model -- 通用模型
|    |    |    |    ├── service -- 泛型对象服务
|    |    |    |    ├── spring -- spring扩展类
|    |    |    |    ├── support -- 基础支持类
├── yan-core -- 核心模块（提供核心方法）
|    ├── main -- 主模块路径
|    |    ├── java -- java类路径
|    |    |    ├── com.yan.core -- 核心类包
|    |    |    |    ├── annotation -- 注解类
|    |    |    |    ├── aspect -- 切面类
|    |    |    |    ├── controller -- 控制器
|    |    |    |    ├── injector -- 注入类
|    |    |    |    ├── listener -- 消息消费者监听器
|    |    |    |    ├── shiro -- 安全认证类
├── yan-dao -- 数据库访问模块（该模块主要通过 mbg 插件生成相应的模型及接口映射）
|    ├── main -- 主模块路径
|    |    ├── java -- java类路径
|    |    |    ├── com.yan.dao -- dao层包
|    |    |    |    ├── mapper -- 接口映射类
|    |    |    |    ├── model -- 数据库模型类
|    |    ├── resources -- 资源配置路径
|    |    |    ├── database -- 数据库sql文件
|    |    |    ├── mybatis -- sqlMap映射文件
|    |    |    ├── properties -- 配置文件
├── yan-plugins -- 插件模块（自定义插件）
|    ├── main -- 主模块路径
|    |    ├── java -- java类路径
|    |    |    ├── com.yan.plugins -- 插件包
|    |    |    |    ├── mybatis.generator -- mbg插件类（包含注释插件、序列化插件）
├── yan-service -- 服务模块（核心接口方法实现）
|    ├── main -- 主模块路径
|    |    ├── java -- java类路径
|    |    |    ├── com.yan.service -- 服务包
|    |    |    |    ├── jms -- 消息服务接口实现类
|    |    |    |    ├── persistence -- 持久化接口实现类
├── yan-web -- web模块
|    ├── main -- 主模块路径
|    |    ├── java -- java类路径
|    |    |    ├── com.yan.web.controller -- 业务处理控制器包
|    |    ├── resources -- 资源配置路径
|    |    |    ├── properties -- 项目配置文件
|    |    |    ├── spring -- spring的配置文件
|    |    ├── webapp -- web应用根路径
|    |    |    ├── common -- 公共路径
|    |    |    ├── resources -- 静态资源路径
|    |    |    ├── views -- 视图路径
```

## 四、项目入门（Introduction）
> 1. 下载项目，并且导入到IDE开发工具中（建议使用：IntelliJ IDEA）
> 2. 使用 **Maven** 构建项目
> 3. 创建数据库并执行 **yan-dao** 模块中 **resources/database** 路径下的 **yan.sql** 文件，创建整个项目必要的表（如：用户表、资源表、日志记录表等...）
> 4. 分别修改 **yan-dao、yan-service、yan-web** 模块中 **resources/properties** 路径下的 ***.properties** 配置文件（具体修改方法及对应属性解释，详见 - 五、配置说明）
> 5. 完成以上步骤就可以正常部署启动服务了：<br>
>    a). 启动 **zookeeper** 服务，命令：**bin/zkServer.sh start**，端口：**2181**（*必要服务，不启动该服务导致项目无法正常运行）<br>
>    b). 启动 **activemq** 服务，命令：**bin/activemq start**，端口：**8161 / 61616**（非必要服务，若不启动该服务，则项目运行中会有jms监听器异常，但不影响整体能）<br>
>    c). 启动 **solr** 服务，命令：**bin/solr start**，端口：**8983**（非必要服务，若不启动该服务，则搜索引擎无法使用，但不影响整体功能）<br>
> *[以上服务具体配置及启动命令，这里我不多做阐述了，不知道的可自行百度搜索]*
> 6. 启动完以上基础的服务后，就可以运行项目了<br>
>    a). 首先启动 **yan-service**，直接运行该模块中的 **com.yan.service.ServiceApp.main()** 方法来启动<br>
>    b). 其次启动 **yan-web** ，可（使用 **jetty / tomcat** 均可）*[详细部署过程在这里就不多做阐述了]*，启动成功后即可访问web应用界面。接下来进入开发阶段
> 7. 根据实际业务需求，在对应的数据库中创建业务表，表命名规范：“模块名_表名” 如：**SYS_RESOURCE**（系统模块资源表）
> 8. 修改 **yan-dao** 模块中 **resources** 路径下的 **generatorConfig.xml** 中的 *targetPackage* 包名及 *tableName* 表名，使用 **MyBatis generator** 插件生成对应的持久层模块代码（Maven 执行命令：**mvn mybatis-generator:generate**），具体配置请参考[MyBatis GeneratorXML Configuration](http://www.mybatis.org/generator/configreference/xmlconfig.html)
> 9. 在 **yan-api** 模块中 **src/main/java** 路径下创建对应的**接口**
> 10. 在 **yan-service** 模块中 **src/main/java** 路径下创建对应的**接口服务实现类**，并在 **src/main/resources/META-INF/spring** 路径下的 **spring-dubbo-provider.xml** 配置中添加声明暴露对应服务接口
> 11. 在 **yan-web** 模块中 **src/main/java** 路径下创建对应的 **controller** 控制器，该控制器类命名规范以 **Controller** 结尾，继承 **BaseController** 类，编写 **controller** 控制器业务处理代码（具体使用参考 - 七、示例代码），并在 **src/main/resources/spring/config** 路径下的 **spring-dubbo-customer.xml** 配置中添加声明暴露对应服务接口
> 12. 在 **yan-web** 模块中 **src/main/webapp/views** 路径下创建对应的jsp页面，并编写前端页面展示代码

## 五、配置说明（Properties）

> **yan-dao** 模块 **resources/properties** 中配置文件说明

| 名称（Key值）| 描述 |
| --- | :--- |
| **mbg.path** | mybatis generator 插件生成代码的路径（绝对路径） |
| **mbg.db.username** | mybatis generator 插件连接数据库的用户名 |
| **mbg.db.password** | mybatis generator 插件连接数据库的密码 |
| **mbg.db.driverClassName** | mybatis generator 插件连接数据库的驱动 |
| **mbg.db.url** | mybatis generator 插件连接数据库的地址 |

> **yan-service** 模块 **resources/properties** 中配置文件说明

| 名称（Key值）| 描述 |
| --- | :--- |
| **default.datasource.username** | 默认数据库用户名 |
| **default.datasource.password** | 默认数据库密码 |
| **default.datasource.driverClassName** | 默认数据库驱动类 |
| **default.datasource.url** | 默认数据库链接地址 |
| **dextend.datasource.username** | 扩展数据库用户名（用于多数据源切换） |
| **dextend.datasource.password** | 扩展数据库密码（用于多数据源切换） |
| **dextend.datasource.driverClassName** | 扩展数据库驱动类（用于多数据源切换） |
| **dextend.datasource.url** | 扩展数据库链接地址（用于多数据源切换） |
| datasource.initialSize | 初始化时建立物理连接的个数 |
| datasource.minIdle | 最小连接池数量 |
| datasource.maxActive | 最大连接池数量 |
| datasource.maxWait | 获取连接时最大等待时间，单位毫秒 |
| datasource.timeBetweenEvictionRunsMillis | 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒 |
| datasource.minEvictableIdleTimeMillis | 配置一个连接在池中最小生存的时间，单位是毫秒 |
| datasource.validationQuery | 用来检测连接是否有效的sql |
| datasource.testWhileIdle | 建议配置为true，不影响性能，并且保证安全性 |
| datasource.testOnBorrow | 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。 |
| datasource.testOnReturn | 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能 |
| datasource.poolPreparedStatements | 是否缓存preparedStatement，也就是PSCache |
| datasource.maxPoolPreparedStatementPerConnectionSize | 每个连接上PSCache的大小 |
| datasource.filters | 属性类型是字符串，通过别名的方式配置扩展插件，常用的插件有：监控统计用的filter:stat日志用的filter:log4j防御sql注入的filter:wall |
|- |- |
| dubbo.application.name | dubbo 应用服务提供者名称 |
| **dubbo.protocol.port** | dubbo 协议暴露服务的端口 |
| **dubbo.registry.address** | dubbo 使用 zookeeper 注册中心暴露服务的地址 |
|- |- |
| **jms.brokerURL** | activeMQ 服务地址 |
| **jms.userName** | activeMQ 服务管理端用户名 |
| **jms.password** | activeMQ 服务管理端密码 |

> **yan-web** 模块 **resources/properties** 中配置文件说明

| 名称（Key值）| 描述 |
| --- | :--- |
| redis.maxIdle | redis最大空闲数 |
| redis.maxTotal | 连接池的最大数据库连接数 |
| redis.maxWaitMillis | 最大建立连接等待时间 |
| redis.minEvictableIdleTimeMillis | 逐出连接的最小空闲时间 默认1800000毫秒(30分钟) |
| redis.numTestsPerEvictionRun | 每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3 |
| redis.timeBetweenEvictionRunsMillis | 逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1 |
| redis.testOnBorrow | 是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个  |
| redis.testWhileIdle | 空闲时检查有效性, 默认false  |
| **redis.hostName** | redis 的主机名 |
| **redis.port** | 端口号：默认6379 |
| **redis.password** | 连接密码 |
| redis.usePool | 是否使用连接池 |
| redis.maxInactiveIntervalInSeconds | 设置缓存失效时间 |
|- |- |
| **jms.brokerURL** | activeMQ 服务地址 |
| **jms.userName** | activeMQ 服务管理端用户名 |
| **jms.password** | activeMQ 服务管理端密码 |
|- |- |
| logback.name | 日志文件前缀名称（一般使用项目名称，便于区分） |
| **logback.path** | 日志存放路径（绝对路径） |
| logback.maxHistory | 日志最大的历史天数 |
| **logback.db.username** | 日志写入数据库时连接数据库的用户名 |
| **logback.db.password** | 日志写入数据库时连接数据库的密码 |
| **logback.db.driverClassName** | 日志写入数据库时连接数据库的驱动 |
| **logback.db.url** | 日志写入数据库时连接数据库的url |
|- |- |
| **setting.upload** | 文件上传路径（绝对路径） |
|- |- |
| **solr.builder** | Solr搜索引擎服务地址 |

## 六、常用方法（Methods）
##### *方法均在继承于BaseController的controller类中使用this.metodName或直接使用methodName来进行调用（注：methodName代表需要调用的方法名称，方法名称见下表）*

| 方法名 | 参数 | 返回值 | 描述 |
| --- | :--- | :--- | :--- |
| getSession | 无 | HttpSession 服务器会话 | 获取服务器会话 session 对象 |
| setSession | session 服务器会话 | 无 | 设置服务器会话 session 对象 |
| getRequest | 无 | HttpServletRequest 用户请求 | 获取用户请求 request 对象 |
| setRequest | request 用户请求 | 无 | 设置用户请求 request 对象 |
| getResponse | 无 | HttpServletResponse 服务器响应结果 | 获取服务器响应结果 response 对象 |
| setResponse | response 服务器响应结果 | 无 | 设置服务器响应结果 response 对象 |
| **getSessionUser** | 无 | TbSysUser 用户对象 | 获取登录成功后 session 中的存储的用户信息 |
|- |- |- |- |
| **getService** | 无 | DelegateService 通用 Service，查看自定义 sqlMap 的代理 service 对象 | 获取 delegateService 对象 |
| **resultPage** | list 查询到的分页结果，为 Page 对象 | PageModel<T> 自定义的分页模型，T 为查询的对象 | 分页结果集对象 |
| **resultMsg** | status 状态值（可根据需求任意设置，无强制标准）；msg 消息内容；res 返回的对象 | MsgModel 自定义消息模型 | 消息返回对象 |
| **fileUpLoad** | request 上传方法中传递的 request 对象，并非父类中的 request 对象 | List<String> 上传文件成功后的新文件名称，以集合形式返回 | 文件上传方法，支持多个文件上传 |
| **fileDownLoad** | fileName 需要下载的文件名称 | ResponseEntity<byte[]> 下载的文件，在浏览器会进行下载 | 文件下载方法 |
|- |- |- |- |
| **isNull** | obj 需要进行判断的对象 | boolean 为null或空返回 true，否则返回 false | 判断对象是否为null，或空 |
| **obj2Str** | obj 需要转换的对象 | String 对象的值（为null则返回""） | 对象转换为 String，通常用于获取 Map 集合中的对象时使用 |
| **getUUID** | 无 | String 32位主键字符串 | 生成 uuid 主键，长度为32位，且为大写模式 |
| base64Encoder | str 需要进行编码的字符串 | String 进行编码后的结果字符串 | 对字符串进行 base64 编码 |
| base64Decoder | str 已进行 base64 编码的编码字符串 | String 解码后的原字符串 | 对字符串进行 base64 解码 |
| md5 | str 需要进行 md5 加密的字符串 | String 加密后的结果 | 对字符串进行 md5 加密算法 |
| currentDate | pattern 获取系统时间的格式，如：yyyy-MM-dd HH:mm:ss | String 返回格式化后的当前时间 | 获取系统当前时间 |
| timeStamp2Date | timestamp 需要进行转换的时间戳；pattern 转换后的格式 | String 格式化后的日期 | 时间戳转换成日期 |
| date2TimeStamp | dateStr 需要进行转换的日期字符串；pattern 日期的格式 | String 转换后的时间戳 | 日期转换为时间戳 |
| readFromFile | filePath 文件路径（绝对路径） | String 读取的文件内容 | 从指定文件中读取文件内容 |
| writeToFile | content 需要写入文件中的内容 | filePath 文件路径（绝对路径） | 将内容写入到指定文件中（写入会覆盖文件原有内容，建议先读取，再写入，将读取的内容与需要写入的内容并在一起进行写入） |
| generatePath | path 文件夹路径（绝对路径） | 无 | 生成指定路径文件夹，先进行判断文件夹是否存在，若不存在则创建对应目录的文件夹，若存在则不进行任何操作 |
| generateFile | path 文件路径（绝对路径） | 无 | 生成指定路径的文件，先进行判断文件是否存在，若不存在则进行创建文件，若存在则不进行任何操作 |
| propertiesValue | key 资源文件中的 key 值 | String 读取到的 key 对应的 value 值 | 读取 properties 文件中的值，读取 classpath 下 /properties/config.properties 配置文件 |
| propertiesValue | resource 资源文件路径（对应 classpath 中的路径）；key 资源文件中的 key 值 | String 读取到的 key 对应的 value 值 | 读取指定路径 properties 文件中的值，会从 classpath 路径下进行查找资源文件 |

## 七、示例代码（Codes）
##### 创建一个继承与BaseController的控制器
```java
@Controller
public class XxxController extends BaseController {
	...
}
```
##### 获取日志日志记录Logger对象

```java
// 方法一：使用注解获取
@LogInject
private static Logger log;

// 方法二：使用工厂方法获取
private static Logger log = LoggerFactory.getLogger(XxxController.class);
```

##### 获取service对象

```java
// 获取delegateService对象
@Autowired
private DelegateService delegateService;

// 获取泛型Service对象
@Autowired
private XxxService xxxService;
```

##### 分页查询后台代码

```java
// 使用对象 service 分页查询数据
@RequestMapping("/list")
@ResponseBody
public PageModel<Xxx> list(int offset, int limit) {
	XxxExample example = new XxxExample();
   PageModel<Xxx> pageModel = xxxService.selectByExampleForOffsetPage(example, offset, limit);
   return pageModel;
}

// 使用 delegateService 自定义 sqlMap 分页查询数据
@RequestMapping("/list")
@ResponseBody
public PageModel<Xxx> list(int offset, int limit) {
	String statement = "com.yan.dao.mapper.xxx.XxxCustomMapper.getXxx";
	PageModel<Xxx> pageModel = delegateService.selectPagination(statement, offset, limit);
   return pageModel;
}

```

##### 分页查询前台代码

```javascript
<table id="table"><table>

$('#table').bsTable({
		url: '${pageContext.request.contextPath}/xxx/list',
		idField: 'id',
		columns: [
			{field: 'state', checkbox: true},
			{field: 'id', title: 'id', align: 'center'},
			...
			]
	});
```

##### 文件上传

```java
@RequestMapping("/upload")
public String upload(HttpServletRequest request) {
	// 调用父类的上传方法，在jsp中必须指定form为enctype="multipart/form-data"
	List<String> fileNames = this.fileUpLoad(request);
	return "success";
}
```

##### 文件下载（在jsp页面使用通用的下载方法，使用restful风格）

```html
<a href="${pageContext.request.contextPath}/文件名称/download">文件下载</a>
```

##### 自定义文件下载后台方法

```java
@RequestMapping("/download")
public ResponseEntity<byte[]> download(String fileName) {
	// 调用父类文件下载方法
	return this.fileDownLoad(fileName);
}
```

##### 常用 delegateService 方法

```java
// 使用自定义sql模板查询单个对象
Xxx xxx = delegateService.selectOne(statement);
Xxx xxx = delegateService.selectOne(statement, parameter);
		
// 使用自定义sql模板查询对象集合
List<Xxx> list = delegateService.selectList(statement);
List<Xxx> list = delegateService.selectList(statement, parameter);

// 使用自定义sql模板有范围的查询，（每次返回指定的对象条数集合）
List<Xxx> list = delegateService.selectList(statement, parameter, rowBounds);

// 使用自定义sql模板进行分页查询
PageModel<Xxx> pageModel = delegateService.selectPagination(statement, offset, limit);
PageModel<Xxx> pageModel = delegateService.selectPagination(statement, parameter, offset, limit);

// 使用自定义sql模板保存
int res = delegateService.insert(statement);
int res = delegateService.insert(statement, parameter);

// 使用自定义sql模板修改
int res = delegateService.update(statement);
int res = delegateService.update(statement, parameter);

// 使用自定义sql模板删除
int res = delegateService.delete(statement);
int res = delegateService.delete(statement, parameter);
```

##### 常用对象 service 方法

```java
// 使用对象方法根据主键查询
Xxx xxx = xxxService.selectByPrimaryKey(id);

// 使用对象方法根据 criteria 查询
List<Xxx> list = xxxService.selectByExample(example);

// 方法一：使用对象方法根据 criteria 分页查询（推荐）
PageModel<Xxx> pageModel = xxxService.selectByExampleForOffsetPage(example, offset, limit);
// 方法二：使用对象方法根据criteria分页查询
PageModel<Xxx> pageModel = xxxService.selectByExampleForStartPage(example, pageNum, pageSize);

// 使用对象方法添加
int res = xxxService.insert(record);
int res = xxxService.insertSelective(record);

// 使用对象方法根据主键修改
int res = xxxService.updateByPrimaryKey(record);
int res = xxxService.updateByPrimaryKeySelective(record);

// 使用对象方法根据 criteria 修改
int res = xxxService.updateByExample(record, example);
int res = xxxService.updateByExampleSelective(record, example);

// 使用对象方法根据主键删除
int res = xxxService.deleteByPrimaryKey(productCode);

// 使用对象方法删除根据 criteria 删除
int res = xxxService.deleteByExample(example);
```

*更多方法使用请参考项目中的示例代码*

## 八、效果预览（Preview）
<img src="https://github.com/micyo202/yan/raw/master/yan-web/src/main/webapp/resources/images/login_preview.png" alt="login" title="login">
<img src="https://github.com/micyo202/yan/raw/master/yan-web/src/main/webapp/resources/images/web_preview.png" alt="web" title="web">
<img src="https://github.com/micyo202/yan/raw/master/yan-web/src/main/webapp/resources/images/mobile_preview.png" alt="mobile" title="mobile">

## 九、许可证（License）
[MIT License](https://github.com/micyo202/yan/blob/master/LICENSE)
