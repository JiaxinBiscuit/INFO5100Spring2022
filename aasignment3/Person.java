public class Person {
    String name;
    int age;
    boolean isSubscribed;

    public Person(String n, int age){
        this.name = n;
        this.age = age;
        isSubscribed = false;
    }

    public void subscribe(SeattlePoliceDepartment spd){
        spd.subscribedPeople.add(this);
        this.isSubscribed = true;
    }

    public void unsubscribe(SeattlePoliceDepartment spd){
        spd.subscribedPeople.remove(this);
        this.isSubscribed = false;
    }

    public void getNotification(SeattlePoliceDepartment spd){
        System.out.println(this.name + " got the notification: " + spd.notification);
    }



}
