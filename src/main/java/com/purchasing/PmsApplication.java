package com.purchasing;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//引导类,项目入口
@SpringBootApplication
public class PmsApplication {
    public static void main (String[] args){
        SpringApplication.run(PmsApplication.class,args);
    }
}