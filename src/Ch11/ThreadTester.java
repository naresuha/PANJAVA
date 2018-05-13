//Testing runnable which is implemented in Multi2. java file or program.
/**
 * name Naresh p
 * version 2.0
 * since 2018
 */
package Ch11;

public class ThreadTester {

		public static void main(String agrs[]){
		Multi2 MultiObject1 = new Multi2();
		Multi2 MultiObject2 = new Multi2();
		
		Thread T1 = new Thread(MultiObject1);
		Thread T2 = new Thread(MultiObject2);
	
		T1.start();
		T2.start();
	}
}

