package Question3;

public class Sad extends Moody {

    public Sad(){
        super();
    }

    //returns string indicating sad
    @Override
    public String getMood(){
        return "I feel sad Today";
    }

    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    @Override
    public void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    //returns message about self : “Subject cries a lot”
    public String toString(){
        return "Subject cries a lot";
    }

}
