package sandboxCode.applicationController;

/**
 * Created by robfredric on 5/20/2017.
 */
public class HandOff {

    //creating fields for specified URLS
    private CatUrl Cats;
    private DogUrl Dogs;
    private TurtleUrl Turtles;

    public HandOff() {


        Cats = new CatUrl();
        Dogs = new DogUrl();
        Turtles = new TurtleUrl();
    }

    //simple if statements for it the entry by the user equals the requests given it will initiate different classes for the sites
    public void handoff( String request) {
        if( request.equals("Dogs")) {
            Dogs.sites();
        } else if (request.equals("Cats")) {
            Cats.sites();
        } else if (request.equals("Turtles")) {
            Turtles.sites();
        }  else {
            System.out.println("Incorrect entry, make sure when typing, the entry matches one of the following examples perfectly");
        }

    }

}
