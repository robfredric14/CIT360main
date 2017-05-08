
import java.util.*;

//runnable allows us to use threads
//runnable specifies the code to be executed by each thread
public class Threads implements Runnable{
	
	//create thread name, time and random time
	String identifier;
	int time;
	Random r = new Random();
	
	//allowed use to create the thread names to pass through
	//gives them a random time//time will be in milliseconds
	public Threads(String x){
		identifier = x;
		time = r.nextInt(999);
	}
	//when thread is run give a sleep time and done status based on 
//    the thread and which order they run
	public void run(){
		
		//when thread is started in testthread.java it will run the thread and associate the commands below along with it 
		try{
			System.out.printf("%s will awake in %d\n", identifier, time);
			Thread.sleep(time);
			System.out.printf("%s has awoken and completed it's task \n", identifier);
	
		//Exception handlers can do more than just print error messages or halt the program 
		//They can do error recovery, prompt the user to make a decision, or propagate the error up to a higher-level handler using chained exceptions
		}catch(Exception Z) {}
	}
}
