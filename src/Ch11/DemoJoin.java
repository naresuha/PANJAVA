//Program with isAlive & Join to manage main thread to last till end.
/**
 * name Naresh P
 * since 2018
 * version 2.0
 */
package Ch11;

class NewThread implements Runnable{
	String Name;
	Thread t;
	
	NewThread(String threadname){
		Name = threadname;
		t = new Thread(this,Name);
		System.out.println("New Thread: " + t);
		t.start();
	}
	
	public void run(){
			try {
				for (int i=5;i>=0;i--){
					System.out.println(Name + ":" + i);
					Thread.sleep(1500);
				} 
			}	catch (InterruptedException e) {
				System.out.println(Name + "Interrupted.");
				}
				System.out.println(Name + "Existing.");
		}
	}
class DemoJoin {

	public static void main(String[] args) {
	
		NewThread ob1 = new NewThread ("One");
		NewThread ob2 = new NewThread ("Two");
		NewThread ob3 = new NewThread ("Three");
	
		System.out.println("Is Thread One Alive: "+ ob1.t.isAlive());
		System.out.println("Is Thread Two Alive: "+ ob2.t.isAlive());
		System.out.println("Is Thread Three Alive: "+ob3.t.isAlive());
		
		try{
			System.out.println("Waiting for Threads to finish!");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch (InterruptedException e){
			System.out.println("Main Thread intruppted!");
		}
		System.out.println("Is Thread One Alive: "+ ob1.t.isAlive());
		System.out.println("Is Thread Two Alive: "+ ob2.t.isAlive());
		System.out.println("Is Thread Three Alive: "+ob3.t.isAlive());
	}
}
