import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Random Num = new Random();
        Scanner tangentbord = new Scanner(System.in);
        int Ran1 = Num.nextInt(1000);
        int vinst = 0;
        System.out.println("Gissa talet");
        double Gissa = tangentbord.nextInt();
        while (vinst<10) {

        if (Ran1==Gissa) {
            System.out.println("Du hade rätt");
            vinst = 10;
        }
        else if (Ran1>Gissa) {
            System.out.println("Talet är högre");
            System.out.println("Gissa talet");
        Gissa = tangentbord.nextInt();
        }
        else if (Ran1<Gissa) {
            System.out.println("Talet är mindre");
            System.out.println("Gissa talet");
        Gissa = tangentbord.nextInt();
        }
    }
}
}
