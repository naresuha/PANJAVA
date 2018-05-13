//Working with initial program in Multithreading
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch11;

public class TrailThreading {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println("Current Thread Name: " + t);
		
		t.setName("Strong Thread");
		System.out.println("New name to a Thread: " + t);

		for(int i= 10;i>=0;i--){
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Tread interrupted by another Thread");
			}
			
		}
	}

}
