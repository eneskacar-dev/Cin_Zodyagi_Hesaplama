import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();


        // Çin Zodyağı Hesaplama

        String [] cinZodyagi = {
                "Maymun" , "Köpek" , "Domuz" , "Fare" , "Öküz" ,
                "Kaplan" , "Tavşan" , "Ejderha" , "Yılan" , "At" , "Koyun"
        } ;

        int kalan = dogumYili % 12 ;
        String burc = cinZodyagi[kalan];

        System.out.println("Çin Zodyağı Burcunuz : " + burc);

    }
}
