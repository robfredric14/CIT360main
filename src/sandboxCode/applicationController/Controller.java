package sandboxCode.applicationController;

/**
 * Created by robfredric on 5/20/2017.
 */
public class Controller {

    private HandOff handoff;

    public Controller(){
        handoff = new HandOff();
    }

    private boolean userIsAllowed() {
        System.out.println("User is allowed entry");
        return true;
    }
    //trackRequest
    private void followRequest ( String request) {
        System.out.println("URL requested " + request);
    }

    public void handOffRequest ( String request ) {

        //log request
        followRequest(request);

        //authenticate user
        if (userIsAllowed()) {
            handoff.handoff(request);
        }
    }
}
