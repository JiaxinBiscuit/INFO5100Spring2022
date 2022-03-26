package Question3;

public class Main {

    public static void main(String[] args) {
        psychiatrist psychiatristObject = new psychiatrist();

        Moody moodyObject1 = new Happy();
        Moody moodyObject2 = new Sad();

        psychiatristObject.examine(moodyObject1);
        psychiatristObject.observe(moodyObject1);
        System.out.println(moodyObject1.getMood());
        moodyObject1.ExpressFeelings();
        System.out.println(psychiatristObject.toString(moodyObject1));

        psychiatristObject.examine(moodyObject2);
        psychiatristObject.observe(moodyObject2);
        System.out.println(moodyObject2.getMood());
        moodyObject2.ExpressFeelings();
        System.out.println(psychiatristObject.toString(moodyObject2));




    }








}
