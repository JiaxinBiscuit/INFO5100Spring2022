public class test {
    public static void main(String[] args) {

        //create one instance of SeattlePoliceDepartment
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment();

        //create 4 instances of person
        Person miya = new Person("Miya", 22);
        Person alex = new Person("Alex", 23);
        Person rose = new Person("Rose", 24);
        Person lisa = new Person("Lisa", 25);

        //subscribe 3 people to SeattlePoliceDepartment
        miya.subscribe(spd);
        alex.subscribe(spd);
        rose.subscribe(spd);

        //publish a message from SeattlePoliceDepartment
        spd.setNotification("PUT MASK ON!");
        spd.notifyCitizens();
        System.out.println();

        //unsubscribe 1 user from SeattlePoliceDepartment
        miya.unsubscribe(spd);

        //publish the message again
        spd.notifyCitizens();



    }
}
