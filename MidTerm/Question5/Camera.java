package Question5;

public class Camera {

    private Camera(){};

    private static Camera instance;
    private static Object ob = new Object();
    private String cameraName ="";

    public static Camera getInstance(){
        if(instance == null){
            synchronized (ob){
                if(instance == null){
                    instance = new Camera();
                }
            }
        }
        return instance;
    }



}
