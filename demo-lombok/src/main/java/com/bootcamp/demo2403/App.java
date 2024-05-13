package com.bootcamp.demo2403;  // similar to sub-folder, group ID

import java.util.ArrayList;
import java.util.List;

// java.lang ....

// create Java Project -> JDK (java.lang)
// but you need to explicitly import java.util, etc.
// CAN WRITE A CLASS UPDATE TO MAVEN-> GET A CLASS AS FUNCTION

// Command "mvn compile" -> check dependency in pom.xml -> download dependency
// Java project = JDK + junit + lombok
// target folder -> generated main + test class files (similar to javac)

// Command "mvn clean" -> clear target folder

// Command "mvn clean compile" -> clear target folder, check dependency, compile class folder


public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        StringBuilder sb = new StringBuilder();
        int x = (int) Math.pow(2.0,2.0);

        Cat c = new Cat("Vincent" , 36);
        List<String> s =  new ArrayList<>();
        
    }
}
