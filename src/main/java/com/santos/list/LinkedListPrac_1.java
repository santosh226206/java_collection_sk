package com.santos.list;

import java.util.LinkedList;
import java.util.Objects;

class Employee{
    int id;
    String name;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class LinkedListPrac_1 {
    public static void main(String args[]){
        LinkedList<Employee> employees=new LinkedList<>();
        employees.add(new Employee("Ram",1));
        employees.add(new Employee("Ravish",2));
        employees.add(new Employee("Ravi",3));
        employees.add(new Employee("Raju",4));
        employees.add(new Employee("Rajesh",5));
        employees.add(new Employee("Rani",6));
        employees.add(new Employee("Raj",7));
        System.out.println(employees);
    }
}
