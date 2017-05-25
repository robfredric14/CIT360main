package sandboxCode.threadsExecutorsRunnables;

import java.util.*;


public class Tester  implements Runnable{
    //constructor

    String name;
    int time;
    Random r = new Random();

    public Tester(String x) {
        name = x;
        time = r.nextInt(999);
    }
    //code that will start when thread is started

    public void run(){
        try{
            System.out.println(name + " is sleeping for " + time);
            Thread.sleep(time);
            System.out.println(name + " has awoken and is done");
        } catch(Exception e){}

    }

}
