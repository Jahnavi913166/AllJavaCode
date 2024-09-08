package com.training.SingletonClass;

import com.training.AccessModifier.ConcreteClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//3 ways to break singleton class
//1. reflection apl
class Employee {
    private static Employee employee;

    private Employee() {
    }

    public static Employee getInstance() {
        if (employee == null) {
            synchronized (Employee.class) {
                if (employee == null) {
                    employee = new Employee();
                }
            }
        }
        return employee;
    }


}

public class SingletonClassReflectionAPI {
    public static void main(String[] args) {
        Employee e1 = Employee.getInstance();
        System.out.println(e1.hashCode());
        Employee e2 = Employee.getInstance();
        System.out.println(e2.hashCode());

        //1 WAY TO BREAK SINGLETON CLASS VIA REFLECTION API
        // Constructor<T>-> this is api  java.lang.reflect.Constructor;
        try {
            Constructor<Student> constructor = Student.class.getDeclaredConstructor();
            //we need to change constructor accessibility at runtime
            constructor.setAccessible(true);//private -> public
            Student newInstance = constructor.newInstance();
            System.out.println("new instance:" + newInstance.hashCode());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        ;

        /* to stay away from reflection api we have 2 solution
        1.if object is already created -> throw exception from inside constructor
        2.use enum
        */
    }

}
