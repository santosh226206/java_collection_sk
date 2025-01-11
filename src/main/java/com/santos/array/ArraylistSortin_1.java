package com.santos.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ArraylistSortin_1 {
    public static void main(String args[]){
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 30));
//        people.add(new Person("Bob", 25));
//        people.add(new Person("Charlie", 30));
//        people.add(new Person("David", 25));
//
//        Comparator<Person> byAge = Comparator.comparingInt(p -> p.getAge());
//        Comparator<Person> byName = Comparator.comparing(p -> p.getName());
//
//        people.sort(byAge.thenComparing(byName));  // Combine multiple comparators
//
//        people.forEach(System.out::println);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 32));
        people.add(new Person("David", 25));

        Comparator<Person> byAge = Comparator.comparingInt(p -> p.getAge());
        Comparator<Person> byName = Comparator.comparing(p -> p.getName());

        people.sort(byAge.thenComparing(byName));  // Combine multiple comparators

        people.forEach(System.out::println);
    }
}
