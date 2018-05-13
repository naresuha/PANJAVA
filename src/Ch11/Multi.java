//Attempt to use 'Runnable' from Multithreading chapter.
/**
 * name Naresh P
 * since 2018
 * version 2.0
 */
package Ch11;

public class Multi implements Runnable {

    public static void main(String[] args) {
        System.out.println("Thread Current Name: " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = new Multi();

        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread...");
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("New Thread Name is: " + Thread.currentThread().getName());
    }
}