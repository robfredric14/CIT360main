

public class TestThread {
	public static void main(String[] args) {
		
		//naming thread but passing through from threads class
		Thread test1 = new Thread(new Threads("Firt Thread Object"));
		Thread test2 = new Thread(new Threads("Second Thread Object"));
		Thread test3 = new Thread(new Threads("Third Thread Object"));
		Thread test4 = new Thread(new Threads("Fourth Thread Object"));
		
		//Creating more threads if we needed more for example
		Thread test5 = new Thread(new Threads("Fifth Thread Object"));
		Thread test6 = new Thread(new Threads("Sixth Thread Object"));
		Thread test7 = new Thread(new Threads("Seventh Thread Object"));
		Thread test8 = new Thread(new Threads("Eighth Thread Object"));
		Thread test9 = new Thread(new Threads("Ninth Thread Object"));
		Thread test10 = new Thread(new Threads("Tenth Thread Object"));
		Thread test11 = new Thread(new Threads("Eleventh Thread Object"));
		Thread test12 = new Thread(new Threads("Twelfth Thread Object"));
		
		//starting each thread based on their name
		//calling the run method from threads.java
		test1.start();
		test2.start();
		test3.start();
		test4.start();
		
		
		//Run the other threads as needed
		test5.start();
		test6.start();
		test7.start();
		test8.start();
		test9.start();
		test10.start();
		test11.start();
		test12.start();
		
		//Cannot run a thread more than once it will throw an illegal thread exception state
		//if we need more threads than we will just create them above
		//therefore just running the code below twice will not work
		//test1.start();
		//test2.start();
		//test3.start();
		//test4.start();
		
	}
	
	
}
