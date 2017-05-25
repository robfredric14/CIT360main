package sandboxCode.threadsExecutorsRunnables;


public class Simplify {
    public static void main(String[] args) {

        //creating thread from Tester class with name paramters

        Thread t1 = new Thread(new Tester("first thread instance"));
        Thread t2 = new Thread(new Tester("second thread instance"));
        Thread t3 = new Thread(new Tester("third thread instance"));
        Thread t4 = new Thread(new Tester("fourth thread instance"));

        t1.run();
        t2.run();
        t3.run();
        t4.run();
    }
}
