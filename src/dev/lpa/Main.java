package dev.lpa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running");
        // interesting this can be called from main thread
        try {
            System.out.println("Main thread paused for one second");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread continues here");


        Thread thread = new Thread(() ->{
            String tName = Thread.currentThread().getName();
            Thread.
           System.out.println(tName + "should take 10 dots to run");
        });
    }
}