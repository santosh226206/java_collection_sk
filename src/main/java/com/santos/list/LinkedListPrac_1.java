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
        employees.push(new Employee("Ram",1));
        employees.push(new Employee("Ravish",2));
        employees.push(new Employee("Ravi",3));
        employees.push(new Employee("Raju",4));
        employees.push(new Employee("Rajesh",5));
        employees.push(new Employee("Rani",6));
        employees.push(new Employee("Raj",7));
        System.out.println(employees);
    }
}
