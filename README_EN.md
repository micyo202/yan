# Yan Instruction

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

### Note：The new micro services **lion** has developed step by step，complete solution based on SpringCloud, please look details with [https://github.com/micyo202/lion](https://github.com/micyo202/lion)

This project is a complete integration of **Dubbo+Zookeeper+Spring +Spring+MyBatis** to support **distributed** efficient and convenient development of **RPC** framework, so that developers can focus on business and achieve business development.<br>
The project is built with **Maven**, which is convenient for project management, and can support mainstream databases such as **Oracle** and **MySql**.<br>
The project is modular and stratified, and code specification is convenient for later maintenance.<br>
Front-end display interface based on **Boostrap** responsive layout, and integration of a series of animation effects plug-ins, the interface simple, beautiful and elegant finish interactions with the background.<br>
The goal of the project is to build a comprehensive J2EE enterprise development solution for small and medium-sized enterprises, and improve work efficiency.<br>
This project is an upgraded version of [yan-demo](https://github.com/micyo202/yan-demo) single node project, which supports distributed and continuous updating. Please look forward to...

## Recent Updates
* **beta 1.0.1：add spring-session+redis technology to solve the problem of session sharing under load balancing**
* beta 1.0.0：The overall project transformation is upgraded to RPC architecture. (Note: If you want to see the non-rpc version, please go to [https://gitee.com/micyo202/yan](https://gitee.com/micyo202/yan))
* beta 0.1.0：Module optimization, removing unnecessary modules and optimizing code (Reference: **Construction**)
* beta 0.0.5：The front end adds ECharts for graphical display
* beta 0.0.4：Add the JMS (ActiveMQ) message service (currently only test methods, no business flow at the moment, and refinement after the later period)
* beta 0.0.3：Add Solr search engine service (basic full-text search function, which can be redeveloped according to actual requirements, and then gradually improve myself)
* beta 0.0.2：Optimize the overall code, add more comments, and make the structure clearer and the code easier to understand
* beta 0.0.1：Refactor the original [yan-demo](https://github.com/micyo202/yan-demo) project, retain the original function, split the module and optimize the project structure

## Tools & Versions Required For The Project
* zookeeper-3.4.11 [http://mirror.bit.edu.cn/apache/zookeeper/zookeeper-3.4.11](http://mirror.bit.edu.cn/apache/zookeeper/zookeeper-3.4.11)
* apache-activemq-5.15.2 [http://activemq.apache.org/activemq-5152-release.html](http://activemq.apache.org/activemq-5152-release.html)
* solr-7.1.0 [https://mirrors.tuna.tsinghua.edu.cn/apache/lucene/solr/7.1.0](https://mirrors.tuna.tsinghua.edu.cn/apache/lucene/solr/7.1.0)

## Environment & DevTools
* MacOS Sierra / Windows 7
* MySql 5.7
* JDK 1.8
* CentOS 7
* IntelliJ IDEA 2017.2.5 / Eclipse 4.6.1
* Navicat Premium 11.1.12
* Maven 3.3.9
* Jetty 9.4.6.v20170531 / Tomcat 9.0.1

## Technology
#### 1.Server Tech
Name | Version | URL
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
Jackson | 2.9.2 | [https://github.com/FasterXML/jackson](https://github.com/FasterXML/jackson)
Dom4j | 1.6.1 | [http://www.dom4j.org](http://www.dom4j.org)
Ehcache | 2.6.11| [http://www.ehcache.org/](http://www.ehcache.org/)
Logback | 1.2.3 | [https://logback.qos.ch](https://logback.qos.ch)
Maven | 3.3.9 | [http://maven.apache.org/](http://maven.apache.org/)
Zookeeper | 3.4.11 | [https://www.apache.org/dyn/closer.cgi/zookeeper/](https://www.apache.org/dyn/closer.cgi/zookeeper/)
#### 2.Web Tech
Name | Version | URL
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

## Construction
```lua
yan -- Root directory
├── yan-api -- Interface module (providing core interface method)
|    ├── main -- Main module path
|    |    ├── java -- The Java class path
|    |    |    ├── com.yan.api -- Core interface package
|    |    |    |    ├── jms -- Message service interface
|    |    |    |    ├── persistence -- Persistent interface
├── yan-common -- Common modules
|    ├── main -- Main module path
|    |    ├── java -- The Java class path
|    |    |    ├── com.yan.common -- Common package
|    |    |    |    ├── annotation -- Annotation class
|    |    |    |    ├── aspect -- Aspect class
|    |    |    |    ├── constant -- Constant definition class
|    |    |    |    ├── model -- Universal model
|    |    |    |    ├── service -- Generic object services
|    |    |    |    ├── spring -- Spring extension class
|    |    |    |    ├── support -- Base support class
├── yan-core -- Core modules (providing core methods)
|    ├── main -- Main module path
|    |    ├── java -- The Java class path
|    |    |    ├── com.yan.core -- Core class package
|    |    |    |    ├── annotation -- Annotation class
|    |    |    |    ├── aspect -- Aspect class
|    |    |    |    ├── controller -- The controller
|    |    |    |    ├── injector -- Injector class
|    |    |    |    ├── listener -- Message consumer listener
|    |    |    |    ├── shiro -- Security authentication class
├── yan-dao -- Database access module (this module generates the corresponding model and interface map mainly through the MBG plug-in)
|    ├── main -- Main module path
|    |    ├── java -- The Java class path
|    |    |    ├── com.yan.dao -- The dao layer package
|    |    |    |    ├── mapper -- Interface map class
|    |    |    |    ├── model -- Database model class
|    |    ├── resources -- Resource allocation path
|    |    |    ├── database -- Database SQL file
|    |    |    ├── mybatis -- SqlMap mapping file.
|    |    |    ├── properties -- The configuration file
├── yan-plugins -- Plug-in module (custom plug-in)
|    ├── main -- Main module path
|    |    ├── java -- The Java class path
|    |    |    ├── com.yan.plugins -- The plug-in package
|    |    |    |    ├── mybatis.generator -- MBG plug-in class (including comment plug-in, serialization plug-in)
├── yan-service -- Service module (core interface method implementation)
|    ├── main -- Main module path
|    |    ├── java -- The Java class path
|    |    |    ├── com.yan.service -- Service pack
|    |    |    |    ├── jms -- Message service interface implementation class
|    |    |    |    ├── persistence -- Persistent interface implementation class
├── yan-web -- The web module
|    ├── main -- Main module path
|    |    ├── java -- The Java class path
|    |    |    ├── com.yan.web.controller -- Business process controller package
|    |    ├── resources -- Resource allocation path
|    |    |    ├── properties -- Project profile
|    |    |    ├── spring -- Spring configuration files.
|    |    ├── webapp -- Web application root path.
|    |    |    ├── common -- common path
|    |    |    ├── resources -- Static resource path
|    |    |    ├── views -- View the path
```

## Introduction
> 1. Download the project and import it into the IDE development tool (suggested use: IntelliJ IDEA)
> 2. Build the project using the **Maven**
> 3. Create the database and execute the **yan.sql** file under the **resources/database** path in the **yan-dao** module, and create the necessary tables for the entire project (such as user table, resource table, log book, etc..)
> 4. Modify the ***.properties** configuration file under **resources/properties** path in **yan-dao**, **yan-service** and **yan-web** modules respectively (specific modification method and corresponding attribute interpretation, Reference - Properties)
> 5. Complete the above steps to deploy the startup service:<br>
>    a). Start the **zookeeper** service, command: **bin/zkServer.sh start**, port: **2181** (necessary service, not starting the service causes the project to not run properly)<br>
>    b). Start the **activemq** service, command: **bin/activemq start**, port: **8161 / 61616** (non-essential services, if the service is not started, there will be JMS listener exceptions in the project run, but not the overall energy)<br>
>    c). Start the **solr** service, command: **bin/solr start**, port: **8983** (non-essential services, if the service is not started, the search engine cannot be used, but does not affect the overall functionality)<br>
> *[the above service specific configuration and start command, here I do not elaborate, do not know the self-baidu search]*
> 6. After starting the above basic services, you can run the project<br>
>    a). Start by launching **yan-service** and running the **com.yan.service.ServiceApp.main()** method in the module directly<br>
>    b). Next, start **yan-web**, but (use **jetty/tomcat** all) *[detailed deployment process is not much discussed here]*, you can access the web application interface after startup. Next comes the development phase
> 7. Create a business table in the corresponding database based on the actual business requirements, and the table naming specification:“ModuleName_TableName” Such as：**SYS_RESOURCE**（System module resource table）
> 8. Modify the *targetPackage* package name and *tableName* table name in **generatorConfig.xml** under **resources** path in **yan-dao** module, and generate the corresponding persistence layer module code using **MyBatis generator** plug-in (**mvn mybatis-generator:generate**). Please refer to [MyBatis GeneratorXML Configuration](http://www.mybatis.org/generator/configreference/xmlconfig.html) for specific configuration
> 9. The corresponding **interface API** is created under **src/main/java** path in the **yan-api** module
> 10. Create the corresponding **interface service implementation class** in the  **src/main/java** path in the **yan-service** module, and expose the corresponding service interface in the **spring-dubbo-provider.xml** configuration under the **src/main/resources/META-INF/spring** path
> 11. **src/main/java** in **yan-web** module path created under the corresponding **controller** controller, the controller class naming conventions ends in **Controller** , inherit the **BaseController** class, **controller** controller business processing code (specific uses reference - Codes), and under the **src/main/resources/spring/config** path add a statement in the configuration of **spring-dubbo-customer.xml** exposure corresponding to the service interface
> 12. Create the corresponding JSP page under the **src/main/webapp/views** path in the **yan-web** module and write the front page display code

## Properties

> Description of configuration file in **yan-dao** module **resources/properties**

| Name（Key value）| Describe |
| --- | :--- |
| **mbg.path** | The path to generate code for the mybatis generator plug-in (absolute path) |
| **mbg.db.username** | Mybatis generator plug-in connects to the user name of the database. |
| **mbg.db.password** | Mybatis generator plug-in connects to the database password. |
| **mbg.db.driverClassName** | Mmybatis generator plug-in connects to the database driver. |
| **mbg.db.url** | Mybatis generator plug-in connects to the address of the database. |

> Description of configuration file in **yan-service** module **resources/properties**

| Name（Key value）| Describe |
| --- | :--- |
| **default.datasource.username** | Default database user name |
| **default.datasource.password** | Default database password |
| **default.datasource.driverClassName** | The default database driver class |
| **default.datasource.url** | The default database link address |
| **dextend.datasource.username** | Extending the database user name (for multiple data source switching) |
| **dextend.datasource.password** | Extended database password (for multiple data source switching) |
| **dextend.datasource.driverClassName** | Extended database driven classes (for multiple data source switching) |
| **dextend.datasource.url** | Extended database link address (for multiple data source switching) |
| datasource.initialSize | The number of physical connections is established when initializing |
| datasource.minIdle | Number of minimum connection pools |
| datasource.maxActive | Maximum number of connections |
| datasource.maxWait | The maximum wait time for the connection, in milliseconds |
| datasource.timeBetweenEvictionRunsMillis | The configuration interval is only one test, and the test needs to be closed for free connections, in milliseconds |
| datasource.minEvictableIdleTimeMillis | Configure a time to connect the smallest living in the pool, in milliseconds |
| datasource.validationQuery | SQL to detect if the connection is valid |
| datasource.testWhileIdle | The recommended configuration is true, which does not affect performance and ensures security |
| datasource.testOnBorrow | When you apply for a connection to perform validationQuery to detect whether the connection is valid, this configuration reduces performance. |
| datasource.testOnReturn | When you return the connection, perform validationQuery to detect whether the connection is valid, and this configuration reduces performance |
| datasource.poolPreparedStatements | Do you cache the preparedStatement, which is PSCache |
| datasource.maxPoolPreparedStatementPerConnectionSize | The size of PSCache on each connection |
| datasource.filters | The attribute type is a string, and the extension plug-in is configured by an alias, and the commonly used plug-ins are: monitor the statistics used filter:stat log's filter:log4j defenses SQL injection filter:wall |
|- |- |
| dubbo.application.name | Dubbo application service provider name |
| **dubbo.protocol.port** | The dubbo protocol exposes the service port |
| **dubbo.registry.address** | Dubbo USES the location of the zookeeper registry to expose the service |
|- |- |
| **jms.brokerURL** | ActiveMQ service address |
| **jms.userName** | ActiveMQ service management end user name |
| **jms.password** | The activeMQ service management terminal password |

> Description of configuration file in **yan-web** module **resources/properties**

| Name（Key value）| Describe |
| --- | :--- |
| **redis.maxIdle** | redis maximum number of free. |
| **redis.maxTotal** | maximum number of database connections to the connection pool |
| **redis.maxWaitMillis** | maximum connection waiting time |
| **redis.minEvictableIdleTimeMillis** | minimum free time to drive out the connection by default of 1800000 milliseconds (30 minutes) |
| **redis.numTestsPerEvictionRun** | maximum number of evictions from each check is negative: 1/abs(n), default 3 |
| **redis.timeBetweenEvictionRunsMillis** | the time interval (milliseconds) from the scan (milliseconds) if it is negative, does not run out of the thread, default -1 |
| **redis.testWhileIdle** | check if the connection is removed from the pool, and if the test fails, remove the connection from the pool and try to remove the other |
| **redis.testOnBorrow** | check validity in free time, false by default |
| **redis.hostName** | redis server host name |
| **redis.port** | the connection port number is 6379 by default |
| **redis.password** | connect the password |
| **redis.usePool** | use connection pooling |
| **redis.maxInactiveIntervalInSeconds** | set the cache expiration time |
|- |- |
| **jms.brokerURL** | ActiveMQ service address |
| **jms.userName** | ActiveMQ service management end user name |
| **jms.password** | The activeMQ service management terminal password |
|- |- |
| logback.name | Prefix names for log files (general use of project names, easy to distinguish) |
| **logback.path** | Log storage path (absolute path) |
| logback.maxHistory | The maximum number of days logged. |
| **logback.db.username** | The user name that connects to the database when the log writes to the database |
| **logback.db.password** | The password to connect to the database when the log writes to the database |
| **logback.db.driverClassName** | The driver of the connection database when the log writes to the database |
| **logback.db.url** | The url of the connection database when the log writes to the database |
|- |- |
| **setting.upload** | File upload path (absolute path) |
|- |- |
| **solr.builder** | Solr search engine service address |

## Methods
##### *Methods are all invoked using this.metodname or directly using methodName in the controller class of BaseController (note: methodName represents the methodName that needs to be called, and the methodName is shown in the table below)*

| Method Name | Parameter | Return value | Describe |
| --- | :--- | :--- | :--- |
| getSession | null | HttpSession Server session | Gets the server session session object |
| setSession | session Server session | null | Set up the server session session object |
| getRequest | null | HttpServletRequest User request | Gets the user request request object |
| setRequest | request User request | null | Set the user request request object |
| getResponse | null | HttpServletResponse Server response results | Gets the response object of the server response |
| setResponse | response Server response results | null | Set the server response result response object |
| **getSessionUser** | null | TbSysUser User Object | Gets the user information stored in the session 
|- |- |- |- |
| **getService** | null | DelegateService universal Service to view the proxy Service object that defines the sqlMap | Get the delegateService object |
| **resultPage** | list The paging result of the query is the Page object | PageModel<T> custom paging model, T is the object of the query | Paging result set object |
| **resultMsg** | status State value (optional setting according to requirements, no mandatory standard); MSG message content; The object returned by the res | MsgModel Customize the message model | Message returned object |
| **fileUpLoad** | request The request object passed in the upload method is not a request object in the parent class | List<String> The new file name after the upload file has been successfully uploaded to the collection form | File upload method, support multiple file uploads |
| **fileDownLoad** | fileName The file name that needs to be downloaded is | ResponseEntity<byte [], which is downloaded from the browser | File download method |
|- |- |- |- |
| **isNull** | obj You need to make a judgment call | boolean Returns true for null，Otherwise return false | Determines whether the object is null |
| **obj2Str** | obj Objects that need to be converted | String The value of the object (return "" for null) | The object is converted to String and is usually used to get objects in the Map collection |
| **getUUID** | null | String 32-bit primary key string | Generate uuid primary key, 32-bit length, and uppercase mode |
| base64Encoder | str Strings that need to be encoded | String The result string is encoded | Base64 encoding of strings |
| base64Decoder | str Base64 encoded string of encoding | String The original string after decoding | Base64 decoding of strings |
| md5 | str Md5 encrypted string is required | String Encrypted results | Md5 encryption algorithm for strings |
| currentDate | pattern Get the format of the system time, such as yyyy-mm-dd HH: MM: ss | String Returns the current time after formatting | Gets the current time of the system |
| timeStamp2Date | timestamp Time stamps that need to be converted; pattern after pattern transformation | String The date after formatting | Time stamps are converted into dates |
| date2TimeStamp | dateStr A date string that needs to be converted; The format of the pattern date | String The time stamp after the transformation | The date is converted into a timestamp |
| readFromFile | filePath File path (absolute path) | String Read the contents of the file | Reads the file contents from the specified file |
| writeToFile | content You need to write the contents of the file | filePath File path (absolute path) | Write the contents to the specified file (the write will override the original contents of the file, which is recommended to read first, then write, and write to the content that needs to be written) |
| generatePath | path filePath File path (absolute path) | null | Generate the specified path folder, first to determine whether the folder exists, and if there is no, create a folder corresponding to the directory, if there is no operation |
| generateFile | path filePath File path (absolute path) | null | Generate a file that specifies the path, first to determine whether the file exists, and if it does not exist, create a file, and if it exists, do nothing |
| propertiesValue | key Key values in resource files | String The value of the key corresponding to the key | Read the values in the properties file, read the classpath/properties/config. Under the properties configuration file |
| propertiesValue | resource Resource file path (the path in the corresponding classpath); Key in the key resource file | String The value of the key corresponding to the key | Read the values in the specified path properties file and find the resource file from the classpath path |

## Codes
##### Create a controller that inherits from BaseController
```java
@Controller
public class XxxController extends BaseController {
	...
}
```
##### Get the logging Logger object.

```java
// Method 1: use annotation to obtain
@LogInject
private static Logger log;

// Method 2: use factory method to obtain
private static Logger log = LoggerFactory.getLogger(XxxController.class);
```

##### Get the service object

```java
// Get the delegateService object
@Autowired
private DelegateService delegateService;

// Get the generic Service object
@Autowired
private XxxService xxxService;
```

##### Paging query background code

```java
// Use the object service paging query data
@RequestMapping("/list")
@ResponseBody
public PageModel<Xxx> list(int offset, int limit) {
	XxxExample example = new XxxExample();
   PageModel<Xxx> pageModel = xxxService.selectByExampleForOffsetPage(example, offset, limit);
   return pageModel;
}

// Use delegateService to customize the sqlMap paging query data
@RequestMapping("/list")
@ResponseBody
public PageModel<Xxx> list(int offset, int limit) {
	String statement = "com.yan.dao.mapper.xxx.XxxCustomMapper.getXxx";
	PageModel<Xxx> pageModel = delegateService.selectPagination(statement, offset, limit);
   return pageModel;
}

```

##### Paging query the foreground code

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

##### File upload

```java
@RequestMapping("/upload")
public String upload(HttpServletRequest request) {
	// To call the parent class upload method, you must specify the form as enctype="multipart/form-data" in the JSP
	List<String> fileNames = this.fileUpLoad(request);
	return "success";
}
```

##### File download (using a common download method in JSP pages, using restful style)

```html
<a href="${pageContext.request.contextPath}/fileName/download">FileDownload</a>
```

##### Custom file download background method.

```java
@RequestMapping("/download")
public ResponseEntity<byte[]> download(String fileName) {
	// Call the parent file download method.
	return this.fileDownLoad(fileName);
}
```

##### The delegateService method is commonly used

```java
// Query a single object using a custom SQL template
Xxx xxx = delegateService.selectOne(statement);
Xxx xxx = delegateService.selectOne(statement, parameter);
		
// Use a custom SQL template to query the collection of objects
List<Xxx> list = delegateService.selectList(statement);
List<Xxx> list = delegateService.selectList(statement, parameter);

// Use a custom SQL template to have a range of queries (each time you return the specified number of objects)
List<Xxx> list = delegateService.selectList(statement, parameter, rowBounds);

// Use custom SQL templates for paging queries
PageModel<Xxx> pageModel = delegateService.selectPagination(statement, offset, limit);
PageModel<Xxx> pageModel = delegateService.selectPagination(statement, parameter, offset, limit);

// Use the custom SQL template to save
int res = delegateService.insert(statement);
int res = delegateService.insert(statement, parameter);

// Use custom SQL template modification
int res = delegateService.update(statement);
int res = delegateService.update(statement, parameter);

// Use the custom SQL template to delete
int res = delegateService.delete(statement);
int res = delegateService.delete(statement, parameter);
```

##### Common object service methods

```java
// Use the object method to query the primary key
Xxx xxx = xxxService.selectByPrimaryKey(id);

// Use the object method to query against the criteria
List<Xxx> list = xxxService.selectByExample(example);

// Method 1: using an object method to query for criteria (recommended)
PageModel<Xxx> pageModel = xxxService.selectByExampleForOffsetPage(example, offset, limit);
// Method 2: use the object method to query against the criteria page
PageModel<Xxx> pageModel = xxxService.selectByExampleForStartPage(example, pageNum, pageSize);

// Use the object method to add
int res = xxxService.insert(record);
int res = xxxService.insertSelective(record);

// Use the object method to modify the primary key
int res = xxxService.updateByPrimaryKey(record);
int res = xxxService.updateByPrimaryKeySelective(record);

// Use the object method to modify the criteria
int res = xxxService.updateByExample(record, example);
int res = xxxService.updateByExampleSelective(record, example);

// Use object method to delete by primary key
int res = xxxService.deleteByPrimaryKey(productCode);

// Use object method to delete according to criteria
int res = xxxService.deleteByExample(example);
```

*See the sample code in the project for more methods*

## Preview
<img src="https://github.com/micyo202/yan/raw/master/yan-web/src/main/webapp/resources/images/login_preview.png" alt="login" title="login">
<img src="https://github.com/micyo202/yan/raw/master/yan-web/src/main/webapp/resources/images/web_preview.png" alt="web" title="web">
<img src="https://github.com/micyo202/yan/raw/master/yan-web/src/main/webapp/resources/images/mobile_preview.png" alt="mobile" title="mobile">

## License
[MIT License](https://github.com/micyo202/yan/blob/master/LICENSE)
