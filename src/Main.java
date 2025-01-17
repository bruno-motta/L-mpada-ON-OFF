import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lamp l1 = new Lamp(false);
        l1.showState();
        l1.turnOn();
        l1.showState();
        System.out.println();
        System.out.println();

        Lamp l2 = new Lamp(true);
        l2.showState();
        l2.turnOff();
        l1.showState();
        scanner.close();

    }
}