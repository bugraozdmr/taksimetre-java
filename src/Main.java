import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.print("isminiz :");
        String b=scanner.nextLine();


        System.out.print("Gideceğin yer :");
        String a=scanner.nextLine();

        taksi taksi1=new taksi();


        //isim belirliyoruz
        taksi1.setMusteri(b);
        //yolu belirleyip hesaplaya yollar bu
        taksi1.sec(a);
    }
}