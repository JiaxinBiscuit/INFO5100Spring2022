public class Q6 {
    public float calculateBill(int callsAmount){
        int option = 1;
        int minimum = 200;
        if (callsAmount > 100 && callsAmount <= 150) {
            option = 2;
        } else if (callsAmount > 150 && callsAmount <= 200) {
            option = 3;
        } else {
            option = 4;
        }
        float sum = 0;

        switch (option){
            case 1 :
                sum = (float) (minimum);
                break;
            case 2:
                sum = (float) (minimum + (callsAmount - 100) * 0.6);
                break;
            case 3:
                sum = (float) (minimum + 50 * 0.6 + (callsAmount - 150) * 0.5);
                break;
            case 4:
                sum = (float) (minimum + 50 * 0.6 + 50 * 0.5 + (callsAmount - 200) * 0.4);
        }

        return sum;
    }


}
