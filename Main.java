package praktikum7;

public class Main {
    public static void main(String[] args) {
        DataMerchant.merc = DataMerchant.tambahDagang(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahDagang(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc= DataMerchant.tambahDagang(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.merc = DataMerchant.tambahDagang(new Merchant(DataMerchant.in.nextLine(),DataMerchant.in.nextLine(),DataMerchant.in.nextDouble()));
        DataMerchant.tampilData();
    }
}
