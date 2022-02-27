import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> subscribedPeople;
    String notification;

    public SeattlePoliceDepartment(){
        subscribedPeople = new ArrayList<>();
    };

    public void setNotification(String notification){
        this.notification = notification;
    }

    public void notifyCitizens(){
        for(Person p:subscribedPeople){
            p.getNotification(this);
        }
    }


}
