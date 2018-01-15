# Yan Project Instruction

### [English](https://github.com/micyo202/yan/blob/master/README_EN.md) [中文文档](https://github.com/micyo202/yan/blob/master/README.md)

<p align="center" >
  <img src="https://github.com/micyo202/yan/raw/master/yan-web/src/main/webapp/resources/images/logo.png" alt="Yan" title="Yan">
</p>

[![Beta](https://img.shields.io/badge/beta-0.0.5-brightgreen.svg)](https://github.com/micyo202/yan)
[![Downloads](https://img.shields.io/badge/downloads-3.5MB-yellow.svg)](https://github.com/micyo202/yan/archive/master.zip)
[![Since](https://img.shields.io/badge/since-2017-blue.svg)](https://github.com/micyo202/yan)
[![License MIT](https://img.shields.io/badge/license-MIT-lightgrey.svg)](https://github.com/micyo202/yan/blob/master/LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/micyo202/yan.svg?style=social&label=Stars)](https://github.com/micyo202/yan)
[![GitHub forks](https://img.shields.io/github/forks/micyo202/yan.svg?style=social&label=Fork)](https://github.com/micyo202/yan)

This project is a **distributed** efficient and convenient development framework based on **SpringMVC+Spring+MyBatis(SSM)** support, which enables developers to focus on business and achieve business development.<br>
The project is built used **Maven** and facilitates project management, which can support mainstream databases such as **Oracle** and **MySql**.<br>
The modular layer of the project is clear, which is convenient for later maintenance.<br>
The front-end display interface based on **Boostrap** responsive layout, and integration of a series of animation effects plug-ins, the interface simple, beautiful and elegant finish interactions with the background..<br>
The goal of the project is to build a comprehensive J2EE enterprise development solution for small and medium-sized enterprises, and improve work efficiency.<br>
The project is [yan-demo](https://github.com/micyo202/yan-demo) Single node project **upgrade**，support **distributed**, continuous update, please look forward to...。

## Recent Updates
* **beta 0.0.5：The front end adds ECharts for graphical display**
* beta 0.0.4：Add the JMS (ActiveMQ) message service (currently only test methods, no business flow at the moment, and refinement after the later period)
* beta 0.0.3：Add Solr search engine service (basic full-text search function, which can be redeveloped according to actual requirements, and then gradually improve myself)
* beta 0.0.2：Optimize the overall code, add more comments, and make the structure clearer and the code easier to understand
* beta 0.0.1：Refactor the original [yan-demo](https://github.com/micyo202/yan-demo) project, retain the original function, split the module and optimize the project structure

## Environment & Tools
* MacOS Sierra / Windows 7
* MySql 5.7
* JDK 1.8
* CentOS 7
* IntelliJ IDEA 2017.2.5 / Eclipse 4.6.1
* Navicat Premium 11.1.12
* Maven 3.3.9
* Jetty 9.4.6.v20170531 / Tomcat 9.0.1

## Technology Choose
#### 1. Server Tech
Name | Version | URL
--- | --- | ---
Spring Framework | 4.3.13.RELEASE  | [http://projects.spring.io/spring-framework/](http://projects.spring.io/spring-framework/)
Shiro | 1.4.0 | [http://shiro.apache.org](http://shiro.apache.org)
AspectJ | 1.8.13 | [http://www.eclipse.org/aspectj/](http://www.eclipse.org/aspectj/)
MyBatis | 3.4.5 | [http://www.mybatis.org/mybatis-3/zh/index.html](http://www.mybatis.org/mybatis-3/zh/index.html)
MyBatis Generator | 1.3.5 | [http://www.mybatis.org/generator/index.html](http://www.mybatis.org/generator/index.html)
PageHelper | 5.1.2 | [http://git.oschina.net/free/Mybatis_PageHelper](http://git.oschina.net/free/Mybatis_PageHelper)
Solr | 7.1.0 | [https://lucene.apache.org/solr/](https://lucene.apache.org/solr/)
ActiveMQ | 5.15.2 | [http://activemq.apache.org](http://activemq.apache.org)
Druid | 1.1.5 | [https://github.com/alibaba/druid](https://github.com/alibaba/druid)
Jackson | 2.9.2 | [https://github.com/FasterXML/jackson](https://github.com/FasterXML/jackson)
Dom4j | 1.6.1 | [http://www.dom4j.org](http://www.dom4j.org)
Ehcache | 2.6.11| [http://www.ehcache.org/](http://www.ehcache.org/)
Logback | 1.2.3 | [https://logback.qos.ch](https://logback.qos.ch)
Maven | 3.3.9 | [http://maven.apache.org/](http://maven.apache.org/)
#### 2. Web Tech
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
yan -- root directory
├── yan-model -- model module
|    ├── main -- main module path
|    |    ├── java -- java class path
|    |    |    ├── com.yan.model -- model class package
├── yan-common -- common module
|    ├── main -- main module path
|    |    ├── java -- java class path
|    |    |    ├── com.yan.common -- common class package
├── yan-api -- interface module (providing interface services)
|    ├── main -- main module path
|    |    ├── java -- java class path
|    |    |    ├── com.yan.api -- interface class package
|    |    |    |    ├── jms -- message service interface
|    |    |    |    ├── mapper -- interface packages for business classes (interfaces/custom business interfaces generated using MBG)
|    |    |    |    ├── persistence -- persistent interface package
|    |    ├── resources -- resource configuration path
|    |    |    ├── mybatis -- mapper mapping file (SQL mapping generated using MBG)
├── yan-core -- core module
|    ├── main -- main module path
|    |    ├── java -- java class path
|    |    |    ├── com.yan.core -- core class package
|    |    |    |    ├── annotation -- annotation class
|    |    |    |    ├── aspect -- aspect class
|    |    |    |    ├── controller -- controller class
|    |    |    |    ├── injector -- injector class
|    |    |    |    ├── jms -- message service interface implements the class
|    |    |    |    ├── listener -- message consumer listeners
|    |    |    |    ├── persistence -- persistence interface implementation class
|    |    |    |    ├── shiro -- security authentication class
|    |    |    |    ├── spring -- spring extension class
├── yan-web -- web module
|    ├── main -- main module path
|    |    ├── java -- java class path
|    |    |    ├── com.yan.controller -- business processing controller package
|    |    ├── resources -- resource configuration path
|    |    |    ├── database -- database SQL file
|    |    |    ├── properties -- project profile
|    |    |    ├── spring -- spring configuration files
|    |    ├── webapp -- web application root path
|    |    |    ├── common -- public path
|    |    |    ├── resources -- static resource path
|    |    |    ├── views -- view the path
```

## Introduction
> 1. Download the project and import it into the IDE development tool (Recommended: IntelliJ IDEA)
> 2. Use **Maven** Build the project
> 3. Create the database and execute **.sql** file under **resources/database** path in **yan-web**, Create the necessary tables for the entire project (For example: user table, resource table, log book, etc..)
> 4. Modify the **.properties** configuration file under **resources/properties** path in **yan-web** (For specific modification methods, see - Properties)
> 5. Complete the above steps to deploy the startup service（used **jetty** or **tomcat**）*[The detailed deployment process is not much discussed here]*，Next comes the development phase
> 6. Create a business table in the corresponding database based on the actual business requirements, and the table naming specification:“ModuleName_TableName” Such as：**SYS_RESOURCE**（System module resource table）
> 7. Modify *targetPackage* package name and *tableName* table name in **generatorConfig.xml** under **resources** path in **yan-web**, Use **MyBatis generator** plug-in to generate the corresponding persistence layer module code(Maven execution command: **mvn mybatis-generator:generate**). Please refer to [MyBatis GeneratorXML Configuration](http://www.mybatis.org/generator/configreference/xmlconfig.html) for specific configuration. Node：Please generate all business object model **Model** under **yan-model** module, and all **mapper interfaces** and **SQL map XML** generated under **yan-api** modules
> 8. In the **src/main/java** path of module **yan-web**, the corresponding **controller** controller is created, The Controller class name specification ends with **Controller** and extends from **BaseController** class, All business operations are basically done here
> 9. Write the controller business handling code, using the reference - Sample Codes
> 10. Create the corresponding JSP page under the **src/main/webapp/views** path in module **yan-web** and write the front page display code

## Properties
| Name（Key value）| Describe |
| --- | :--- |
| **setting.upload** | File upload path (absolute path) |
|- |- |
| **logback.name** | Log prefix names (general use of project names for easy distinction) |
| **logback.path** | Log storage path (absolute path) |
|- |- |
| **solr.builder** | solr search engine service address |
|- |- |
| **amq.brokerURL** | activeMQ server broker url |
| **amq.userName** | activeMQ administrative user name |
| **amq.password** | activeMQ administrative user password |
|- |- |
| **mbg.jar** | The required jar package for the MGB plug-in link database (absolute path) |
| **mbg.path** | Path to generate code (absolute path) |
|- |- |
| **default.db.username** | Default database user name |
| **default.db.password** | Default database password |
| **default.db.driverClassName** | The default database driver class |
| **default.db.url** | The default database link address |
|- |- |
| **dextend.db.username** | Extending the database user name (for multiple data source switching) |
| **dextend.db.password** | Extended database password (for multiple data source switching) |
| **dextend.db.driverClassName** | Extended database driven classes (for multiple data source switching) |
| **dextend.db.url** | Extended database link address (for multiple data source switching) |
|- |- |
| db.initialSize | The number of physical connections is established when initializing |
| db.minIdle | Number of minimum connection pools |
| db.maxActive | Maximum number of connections |
| db.maxWait | The maximum wait time for the connection, in milliseconds |
| db.timeBetweenEvictionRunsMillis | The configuration interval is only one test, and the test needs to be closed for free connections, in milliseconds |
| db.minEvictableIdleTimeMillis | Configure a time to connect the smallest living in the pool, in milliseconds |
| db.validationQuery | SQL to detect if the connection is valid |
| db.testWhileIdle | The recommended configuration is true, which does not affect performance and ensures security |
| db.testOnBorrow | When you apply for a connection to perform validationQuery to detect whether the connection is valid, this configuration reduces performance. |
| db.testOnReturn | When you return the connection, perform validationQuery to detect whether the connection is valid, and this configuration reduces performance |
| db.poolPreparedStatements | Do you cache the preparedStatement, which is PSCache |
| db.maxPoolPreparedStatementPerConnectionSize | The size of PSCache on each connection |
| db.filters | The attribute type is a string, and the extension plug-in is configured by an alias, and the commonly used plug-ins are: monitor the statistics used filter:stat log's filter:log4j defenses SQL injection filter:wall |

## Methods
##### *Methods are both inherited in the controller class of BaseController using this.metodname or directly using the methodName to make the call (note: methodName represents the method name that needs to be called, and the method name is shown in the table below)*

| Method Name | Parameter | Return value | Describe |
| --- | :--- | :--- | :--- |
| getSession | null | HttpSession Server session | Gets the server session session object |
| setSession | session Server session | null | Set up the server session session object |
| getRequest | null | HttpServletRequest User request | Gets the user request request object |
| setRequest | request User request | null | Set the user request request object |
| getResponse | null | HttpServletResponse Server response results | Gets the response object of the server response |
| setResponse | response Server response results | null | Set the server response result response object |
| **getSessionUser** | null | TbSysUser User Object | Gets the user information stored in the session after login |
| **getMapper** | type Generated Mapper interface object type | T Generics, the type Mapper of the incoming parameter object | Get the mapper object |
| **getMapper** | null | DelegateMapper General mapper, view the agent mapper object that defines sqlMap | Get the delegateMapper object |
| **setDataSource** | dataSource Data source name (must be the name included in the spring configuration) | null | Dynamically switch the data source method to set the data source name |
| **clearDataSource** | null | null | Clear the data source, clean up the data source, and restore the data source to the default data source |
| **offsetPage** | offset Initial quantity; Limit number of limit | null | Paging query scope, parameters are passed in by the bootstrapTable paging plug-in without manual control, just call the method |
| **resultPage** | list The paging result of the query is the Page object | PageModel<T> custom paging model, T is the object of the query | Paging result set object |
| **resultMsg** | status State value (optional setting according to requirements, no mandatory standard); MSG message content; The object returned by the res | MsgModel Customize the message model | Message returned object |
| **fileUpLoad** | request The request object passed in the upload method is not a request object in the parent class | List<String> The new file name after the upload file has been successfully uploaded to the collection form | File upload method, support multiple file uploads |
| **fileDownLoad** | fileName The file name that needs to be downloaded is | ResponseEntity<byte [], which is downloaded from the browser | File download method |
| isNull | obj You need to make a judgment call | boolean Returns true for null，Otherwise return false | Determines whether the object is null |
| obj2Str | obj Objects that need to be converted | String The value of the object (return "" for null) | The object is converted to String and is usually used to get objects in the Map collection |
| getUUID | null | String 32-bit primary key string | Generate uuid primary key, 32-bit length, and uppercase mode |
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

## Sample Codes
##### Create a controller that inherits and BaseController
```java
@Controller
public class XxxController extends BaseController {
	...
}
```
##### Get logging Logger objects

```java
// Use annotation to obtain
@LogInject
private static Logger log;

// Use factory methods to obtain
private static Logger log = LoggerFactory.getLogger(XxxController.class);
```

##### Get the mapper object

```java
// Annotation mode gets the delegateMapper
@MapperInject
private DelegateMapper delegateMapper;
// Annotation means to get the mapper corresponding to the object
@MapperInject(XxxMapper.class)
private XxxMapper mapper;

// Obtain delegateMapper
this.getMapper();
// Gets the mapper for the object
this.getMapper(XxxMapper.class);
```

##### Dynamic switch data source

```java
// Annotate the data source, by default to switch to the extended data source
@DynamicDataSource
public String init(){
	...
}

// Annotate the data source, passing in the data source name of the ENUM type
@DynamicDataSource(DataSourceName.EXTEND)
public String init(){
	...
}

// Switch calls the superclass method performs data sources (parameter names suggest using framework has been defined, DataSourceName. The DEFAULT/EXTEND getName ())
this.setDataSource("extendDataSource");
	...
this.clearDataSource();
```

##### Paging query background code

```java
@RequestMapping("/list")
@ResponseBody
public PageModel<Xxx> list(int offset, int limit) {
	// Invoke the parent class method to pass in the paging parameters
	this.offsetPage(offset, limit);
	List<Xxx> list = mapper.selectByExample(null); // Call query method
	return this.resultPage(list);
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
	// To call the parent class upload method, the form must be specified in the JSP as enctype="multipart/form-data"
	List<String> fileNames = this.fileUpLoad(request);
	return "success";
}
```

##### File download (using a generic download method for JSP pages, using restful style)

```html
<a href="${pageContext.request.contextPath}/File Name/download">File Download</a>
```

##### Download the background method for the custom file

```java
@RequestMapping("/download")
public ResponseEntity<byte[]> download(String fileName) {
	// Call the parent file download method
	return this.fileDownLoad(fileName);
}
```
##### Commonly used DelegateMapper and object Mapper methods

```java
// Query a single object using a custom SQL template
Demo demo = delegateMapper.selectOne(statement);
Demo demo = delegateMapper.selectOne(statement, parameter);
		
// Use a custom SQL template to query the collection of objects
List<Demo> list = delegateMapper.selectList(statement);
List<Demo> list = delegateMapper.selectList(statement, parameter);

// Use a custom SQL template to have a range of queries (every time you return the specified number of objects)
List<Demo> list = delegateMapper.selectList(statement, parameter, rowBounds);

// Use custom SQL templates for paging queries
PageModel<Demo> page = delegateMapper.selectPagination(statement, offset, limit);
PageModel<Demo> page = delegateMapper.selectPagination(statement, parameter, offset, limit);

// Save using a custom SQL template
int res = delegateMapper.insert(statement);
int res = delegateMapper.insert(statement, parameter);

// Modify using custom SQL templates
int res = delegateMapper.update(statement);
int res = delegateMapper.update(statement, parameter);

// Use the custom SQL template to delete
int res = delegateMapper.delete(statement);
int res = delegateMapper.delete(statement, parameter);

// Use the object method to query the primary key
Demo demo = mapper.selectByPrimaryKey(id);

// Use the object method to query by criteria
List<Demo> list = mapper.selectByExample(example);

// Use the object method to query the criteria page
this.offsetPage(offset, limit);
List<Demo> list = mapper.selectByExample(example);
this.resultPage(list); // Returns the result set

// Use object method to add
int res = mapper.insert(record);
int res = mapper.insertSelective(record);

// Use the object method to modify the primary key
int res = mapper.updateByPrimaryKey(record);
int res = mapper.updateByPrimaryKeySelective(record);

// Use the object method to modify the criteria
int res = mapper.updateByExample(record, example);
int res = mapper.updateByExampleSelective(record, example);

// Use the object method to delete the primary key
int res = mapper.deleteByPrimaryKey(productCode);

// Use object method to delete according to criteria
int res = mapper.deleteByExample(example);
```

*For more information, refer to the code under the API documentation or demo module in the project*

## Preview Results
<img src="https://github.com/micyo202/yan-demo/raw/master/src/main/webapp/resources/images/login_preview.png" alt="login" title="login">
<img src="https://github.com/micyo202/yan-demo/raw/master/src/main/webapp/resources/images/web_preview.png" alt="web" title="web">
<img src="https://github.com/micyo202/yan-demo/raw/master/src/main/webapp/resources/images/mobile_preview.png" alt="mobile" title="mobile">

## License
[MIT License](https://github.com/micyo202/yan/blob/master/LICENSE)
