## Higher Order Function in Java

> A higher order function is a function that either takes a function (method) as parameter, or returns a function after its execution. In this higher order tutorial I will show a few examples of higher order functions in Java.

```java
List<String> names=Arrays.asList("Saurabh","James","Galaxie","Ivy","Ibrahim","Izna","Kashish");

        Collections.sort(names,(String a,String b)->{
        return a.compareTo(b);
        });

        System.out.println(names);
```
``
The Collection.sort() takes two parameters. The first parameter is a List and second parameter is a lambda (function). The lambda parameter is what makes Collections.sort() a higher order function.
``

[Go Back to the repository home](https://github.com/saurabhshcs/java-functional-programming) | [Go to saurabhshcs profile](https://github.com/saurabhshcs) | [Go to repository list](https://github.com/saurabhshcs?tab=repositories)

Follow me on - [Medium](https://saurabhshcs.medium.com) | [Linkedin](https://www.linkedin.com/in/saurabhshcs/) | [YouTube](https://www.youtube.com/channel/UCSQqjPw7_tfx1Ie4yYHbcxQ?pbjreload=102) | [StackOverFlow](https://stackoverflow.com/users/10719720/saurabhshcs?tab=profile)

