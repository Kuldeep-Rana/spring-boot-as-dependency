# spring-boot-as-dependency 


Spring Boot application is not intended to be used as a dependency. If your application contains classes that you want to share with other projects, the recommended approach is to move that code into a separate module. The separate module can then be depended upon by your application and other projects.

https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.build.use-a-spring-boot-application-as-dependency

If you still want to use it as dependency do the following:

# 1. Remove the Spring boot parent config from your pom.xml

# 2. Declear Spring boot version in properties in pom.xml and use for your spring boot dependency

# 3. Update the build plugin version to spring boot version and add following configuration inside plugin

<configuration>
	<attach>false</attach>
	<mainClass>com.transaction.demo.interceptor.TransactionApplication</mainClass>
</configuration>
<executions>
	<execution>
		<goals>
			<goal>repackage</goal>
		</goals>
	</execution>
</executions>

# I have create following sample projects
1. interceptor
2. Service1 
3. Service2

# Both service1 and Service2 use interceptor as dependency
