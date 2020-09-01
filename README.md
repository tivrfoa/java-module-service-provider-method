# Java Modules Test 1


## Commands used from the great tutorial below

[Java 9 Modules - Creating Services and Service Providers](https://www.logicbig.com/tutorials/core-java-tutorial/modules/services.html)

[Java 9 Modules - Service provider module with public static provider() method](https://www.logicbig.com/tutorials/core-java-tutorial/modules/service-provider-method.html)


### Interface

service>javac -d out src/module-info.java src/msg/service/MsgService.java

service>jar --create --file msg-service.jar -C out .


### First Provider

provider>copy ..\service\msg-service.jar lib\

provider>javac -d out --module-path lib src/module-info.java src/msg/provider/swing/MsgServiceImpl.java

provider>jar --create --file msg-service-swing.jar -C out .


### Second Provider - public static provider() method

static-method-provider>copy ..\service\msg-service.jar lib\

static-method-provider>javac -d out --module-path lib src/module-info.java src/msg/provider/swingtwo/MsgServiceProvider.java

static-method-provider>jar --create --file msg-service-swing-two.jar -C out .


### Test App

my-app>copy ..\service\msg-service.jar lib\msg-service.jar

my-app>copy ..\provider\msg-service-swing.jar lib\

my-app>copy ..\static-method-provider\msg-service-swing-two.jar lib\

my-app>javac -d out --module-path lib src/module-info.java src/com/logicbig/AppMain.java

my-app>java --module-path out;lib --module my.app/com.logicbig.AppMain


### Test SPI for concrete class

static-method-provider-class>javac -d out src/module-info.java src\msg\provider\swingclass\*

static-method-provider-class>jar --create --file msg-service-swing-class.jar -C out .

my-app-class-test>javac -d out --module-path lib src/module-info.java src/com/logicbig/AppMain.java

my-app-class-test>java --module-path out;lib --module my.app/com.logicbig.AppMain