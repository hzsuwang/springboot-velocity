springboot 集成 velocity

application.properties
VELOCITY TEMPLATES (VelocityAutoConfiguration)

spring.velocity.charset=UTF-8 spring.velocity.properties.input.encoding=UTF-8 spring.velocity.properties.output.encoding=UTF-8 spring.velocity.resourceLoaderPath=classpath:/templates/ spring.velocity.suffix=.html spring.velocity.toolbox-config-location=/WEB-INF/toolbox.xml

pom.xml
4.0.0

<groupId>com.iterror</groupId>
<artifactId>springboot-velocity</artifactId>
<version>1.0.0-SNAPSHOT</version>
<packaging>jar</packaging>

<name>springboot-velocity</name>
<description>Test Project for Spring Boot</description>
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <java.version>1.8</java.version>
</properties>
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.3.5.RELEASE</version>
</parent>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-velocity</artifactId>
    </dependency>
</dependencies>

<build>
    <finalName>springboot-velocity</finalName> <!-- 指定package生成的文件名为my-spring-boot.jar -->

    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
Application.java
package com.iterror.springboot.controller;

import org.springframework.boot.SpringApplication; import org.springframework.boot.autoconfigure.SpringBootApplication; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.stereotype.Controller; import org.springframework.ui.Model;

@SpringBootApplication @Controller public class Application {

@RequestMapping("/home")
public String home(Model model) {
    model.addAttribute("name", "name1");
    return "home";
}

public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
}
}
