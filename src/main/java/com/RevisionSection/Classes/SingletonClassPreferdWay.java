package com.RevisionSection.Classes;
//most used way and it also, take care of threads, thread save singleton class

class Employee {
    private static Employee employee;

    private Employee() {
    }

    public static Employee getInstance() {
        //two step verification using synchronized block
        if (employee == null) {
            //t1,t2,t3->thread

            synchronized (Employee.class) {
                if (employee == null) {
                    employee = new Employee();
                }
            }
        }
        return employee;
    }

}

public class SingletonClassPreferdWay {
    public static void main(String[] args) {
        Employee e1=Employee.getInstance();
        System.out.println(e1.hashCode());
        Employee e2=Employee.getInstance();
        System.out.println(e1.hashCode());//same obj is used
        System.out.println(e1.getClass());
        System.out.println(Employee.class);

    }
}
