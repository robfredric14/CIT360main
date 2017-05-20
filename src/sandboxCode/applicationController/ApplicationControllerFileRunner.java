package sandboxCode.applicationController;

import java.util.Scanner;
/**
 * Created by robfredric on 5/20/2017.
 */

//The main class where the actions will be run
public class ApplicationControllerFileRunner {

    public static void main(String[] args) {
        //creating new scanner for input named entry
        //system.in is basically saying whatever we type in from the keyboard hold it in entry variable
        Scanner entry = new Scanner(System.in);
        //display message to help user understand the parameters to type for entry scanner
        System.out.println("please type either Cats, Dogs or Turtles for URL links to learn more about them");
        //controller constructer and object
        Controller controller = new Controller();
        //controller and handoff request entry for user input
        controller.handOffRequest(entry.next());

    }


}
