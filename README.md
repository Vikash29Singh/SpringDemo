# Spring Boot Demo
In this project I will work with 
- @component 
- @Autowired concept.

First we will create a [Alien class](src/main/java/com/example/springtest/demo/Alien.java) with variables,getter and setter method and show().<br>

When we create a project in our main class <b>run method</b> is created. This run method will return the object of ConfigurableApplicationContext.

So I will modify the code
```
ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class,args);
```
Now we need to craete the object of the class. In normal case we create the object of the class as 
```
classname obj=new classname();
```
Here, run methods return the object as <b>context</b>
```
//In my case i have Alien class
Alien a = context.getBean(Alien.class); // getBean //creates object of Aliean class
```
To check this way of object creation will work we will create a method in alien class and call the method.
Let say

```
a.show();
```
