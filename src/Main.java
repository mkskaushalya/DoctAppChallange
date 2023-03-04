import com.sahan.DoctApp.Heart;
import com.sahan.DoctApp.Pations;

public class Main {
    public static void main(String[] args) {
        Pations pations = new Pations("Sahan", 23);
        pations.setLeftEye("Left Eye", "Short sighted", "Blue");
        pations.setRightEye("Right Eye", "Normal", "Blue");
        pations.setHeart("Heart", "Normal", 65);
        pations.setStomach("Stomach", "PUD", true);
        pations.setSkin("Skin", "Burned");
        pations.startApp();
    }
}