package Question3;

public class psychiatrist {

    public psychiatrist(){};

    //asks moody object about its mood
    public void examine(Moody moodyObject){
        System.out.println("How are you feeling today?");
    };

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject){
        moodyObject.getMood();
    }


    //returns message about self: “Subject laughs a lot”
    public String toString(Moody moodyObject){
       return "Observation: " + moodyObject.toString();
    }



}
