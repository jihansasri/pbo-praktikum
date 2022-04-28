package studiKasus;
import java.util.Scanner;

public class Taster {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);


        System.out.println("========================================================");
        System.out.println("|  a    |  100000  |");
        System.out.println("|  b    |  125000  |");
        System.out.println("|  c    |  175000  |");

        String jenis = input.nextLine();
        int jumlah = input.nextInt();

        Baju baju = new Baju(jenis, jumlah);
        baju.display();
    }
}
