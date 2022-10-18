package com.reanima.multithreading;


class Task1 extends Thread {
    public void run() {//signature
        //task1
        System.out.println("\nTask1 start.");
        for (int i = 101; i <= 199; i++)
            System.out.println(i + " ");
        System.out.println("\nTask1 done.");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {//signature
        //task2
        System.out.println("\nTask2 start.");
        for (int i = 201; i <= 299; i++)
            System.out.println(i + " ");
        System.out.println("\nTask2 done.");

    }
}
public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        //task1
        Task1 task1 = new Task1();
        task1.setPriority(10);
        task1.start();//instead of task1.run() to go as a thread

        //task2
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(7);
        task2Thread.start();
        //wait for task1 completed
        task1.join();
        task2Thread.join();
        //task3
        for (int i = 301; i <= 399; i++)
            System.out.println(i + " ");
        System.out.println("\nTask3 done.");

        System.out.println("\nMain done.");
    }
}
