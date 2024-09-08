package com.RevisionSection.SerializationDeSerialization;

class CustomNameThreadUsingSetNameMethod {
    public static void customNameOfThread1() {
        //(custom name)Setting the Thread Name Using setName() Method
        //You can use the setName() method on an instance of a Thread object to change its name.
        Thread t1 = new Thread(() -> {
            System.out.println("Running Thread:" + Thread.currentThread().getName());
        });
        t1.setName("MainThreadCustomName");
        t1.start();
    }

    public static void customNameOfThread2() {
        Thread mainThread = Thread.currentThread();
        mainThread.setName("MAIN_THREAD_NAME");
        System.out.println("main thread custom name: " + Thread.currentThread().getName());
    }

}

class CustomNameThreadUsingViaConstructor {
    public static void customName() {
        Thread t1 = new Thread(() -> {
            System.out.println("Running thread:" + Thread.currentThread().getName());
        }, "MainCustomThreadName");//set the name of thread(custom name)
        t1.start();

        // Print the main thread's name (default or custom)
        System.out.println("Main thread name: " + Thread.currentThread().getName());
    }


}


public class GetTheMain_ThreadName {
    public static void main(String[] args) {
        // Get the current thread (which is the main thread)
        /*Thread mainThread = Thread.currentThread();

        // Get and print the name of the main thread
        String mainThreadName = mainThread.getName();
        System.out.println("The name of the main thread is: " + mainThreadName);
         */

//        CustomNameThreadUsingSetNameMethod.customNameOfThread1();
//        CustomNameThreadUsingSetNameMethod.customNameOfThread2();
//        System.out.println(Thread.currentThread().getName());

        CustomNameThreadUsingViaConstructor.customName();


    }
}
