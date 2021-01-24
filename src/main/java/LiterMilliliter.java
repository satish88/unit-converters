import java.io.Serializable;

public class LiterMilliliter {


    public int convertLiterToMilliliter(float liter) {
        if (liter > 0) {
            int milliliter = (int) (liter * 1000);
            return milliliter;
        }
        else {
            System.out.println("Invalid Input , Put value more than zero");
            return (0);
        }

    }


    public float convertMilliliterToLiter ( float milliliter){
        if (milliliter > 1) {
           float liter = (milliliter / 1000.0f);
            return (liter);
        }
        else {
            System.out.println("Invalid Input , Put value more than one");
            return (0);
        }
    }
}