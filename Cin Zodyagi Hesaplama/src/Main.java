import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Doğum yılınızı giriniz: ");
        a = input.nextInt();
        int kalan = a % 12;
        System.out.println(kalan);
        switch (kalan) {
            case 0:
                System.out.println("Çin zodyağınız Maymun ");
                break;
            case 1:
                System.out.println("Çin zodyağınız Horoz ");
                break;
            case 2:
                System.out.println("Çin zodyağınız Köpek ");
                break;
            case 3:
                System.out.println("Çin zodyağınız Domuz ");
                break;
            case 4:
                System.out.println("Çin zodyağınız Fare ");
                break;
            case 5:
                System.out.println("Çin zodyağınız Öküz ");
                break;
            case 6:
                System.out.println("Çin zodyağınız Kaplan ");
                break;
            case 7:
                System.out.println("Çin zodyağınız Tavşan ");
                break;
            case 8:
                System.out.println("Çin zodyağınız Ejderha ");
                break;
            case 9:
                System.out.println("Çin zodyağınız Yılan ");
                break;
            case 10:
                System.out.println("Çin zodyağınız At ");
                break;
            case 11:
                System.out.println("Çin zodyağınız Koyun ");
                break;
        }
    }
}