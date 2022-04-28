package praktikum8;
import java.util.ArrayList;



public class RentArchive {
    public static ArrayList<CarRent> rentData= new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){
        rentData.add(new CarRent(rider, car, rentDur));
    }
    public void info(){
        System.out.println("-------------------------------");
        System.out.println("    INFORMASI PELANGGAN");
        System.out.println("-------------------------------");
        for (CarRent wkwk : RentArchive.rentData) {
            System.out.println("NAMA PEMINJAM   : " + wkwk.getRider().getName());
            System.out.println("TIPE MOBIL      : " + wkwk.getCar().getCarType());
            System.out.println("NO. POLISI      : " + wkwk.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + wkwk.getRentDur());
            System.out.println("-------------------------------");
        }
    }
}
