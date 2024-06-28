package org.example;

import java.util.Arrays;
import java.util.List;

/*
1. filter()
2. map()
3. reduce()
4. sorted()
5. forEach()
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("pravin jadhav....");
        List<Integer> list = Arrays.asList(5,4,3,2,1,6,7);

//        create a sorted list
        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);

//        create a list which contain only even numbers and each number multiplied by 2
        List<Integer> newList = list.stream()
                .filter(num -> num%2 == 0)
                .map( num -> num*2 )
                .toList();
        newList.forEach(System.out::println);

//    create a list which contain only even numbers and each number multiplied by 2 and its sum
        int sum = list.stream()
                .filter( n -> n%2==0 )
                .map( n -> n*2 )
                .reduce(0,(c,e) -> c+e );
        System.out.println("sum : "+sum);

        int sum1 = list.stream().filter( n -> n%2==0 ).map( n -> n*2 ).reduce(0, Integer::sum);







//        list.forEach( n-> System.out.println(n) );
        /*
        1.lambda can be replace with method reference
        list.forEach(System.out::println);
         */


        /*
         Internal working of forEach() method

        Consumer<Integer>  consumer= new Consumer<>(){
            public void accept(Integer num) {
                System.out.println(num);
            }
        };
        list.forEach(consumer);

        #Consumer is functional interface so it can be convert into lambda exp.
        Consumer<Integer>  consumer=  num -> System.out.println(num);
        list.forEach(consumer);

        #we can replace consumer variable with expression
        list.forEach( n-> System.out.println(n) );

         */



    }
}