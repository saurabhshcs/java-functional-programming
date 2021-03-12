# java-functional-programming

> Represents a predicate (boolean-valued function) of one argument.
This is a functional interface whose functional method is test(Object).

### 1.0 Predicate\<T> 
> Represents a predicate (boolean-valued function) of one argument. [See Example](https://github.com/saurabhshcs/java-functional-programming/blob/main/src/main/java/com/techsharezone/javafunctionalprogramming/functionalinterface/FunctionalInterfaceExample.java)

```
Predicate<Integer> predicateLambda = x -> x%2==0;

Predicate<Integer> predicate = new Predicate<Integer>() {

  @Override
  public boolean test(Integer x) {
      return x%2==0;
  }
};

//Using PredicateLambda
numbers.stream()
        .filter(predicateLambda)
        .forEach(System.out::println);

//Using PredicateLambda
numbers.stream()
        .filter(predicate)
        .forEach(System.out::println);

//Using pure lambda expression
numbers.stream()
        .filter(x -> x%2 ==0)
        .forEach(System.out::println);
        

```

### 1.2 Function<T, R>
> Represents a function that accepts one argument and produces a result.
This is a functional interface whose functional method is apply(Object). [See Example](https://github.com/saurabhshcs/java-functional-programming/blob/main/src/main/java/com/techsharezone/javafunctionalprogramming/functionalinterface/FunctionalInterfaceExample.java)

```
        Function<Integer, Integer> functionLambda = x-> x *x;

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        //Using functionLambda
        numbers.stream()
                .map(functionLambda)
                .forEach(consumerLambda);

        //Using function
        numbers.stream()
                .map(function)
                .forEach(consumer);

        //Using pure lambda expression
        numbers.stream()
                .map(x -> x *x)
                .forEach(System.out::println);
                
```


### 1.3 Consumer \<T>
> Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces, Consumer is expected to operate via side-effects. [See Example](https://github.com/saurabhshcs/java-functional-programming/blob/main/src/main/java/com/techsharezone/javafunctionalprogramming/functionalinterface/FunctionalInterfaceExample.java)

```
        Consumer<Integer> consumerLambda = System.out::println;

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        };

        //Using Consumer Lambda
        numbers.stream()
                .forEach(consumerLambda);

        //Using Consumer
        numbers.stream()
                .forEach(consumer);

        //Using pure lambda expression
        numbers.stream()
                .forEach(System.out::println);
                
```

## Run all the test 

`
./gradlew test
`

## Run application
`
./gradlew bootRun
`
