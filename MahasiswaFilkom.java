package praktikum10;
import java.text.DecimalFormat;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;
    static int jumlah1 = 0;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super (nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM(){
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK(){
        return IPK;
    }
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String angkatan="" , prodi="";
        angkatan = "20" + NIM.substring(0,2);
        if ("2".equals(NIM.substring(6, 7))) {
            prodi = "Teknik Meniup Gelembung";
        } else if ("3".equals(NIM.substring(6, 7))) {
            prodi = "Teknik Berburu Ubur-Ubur";
        } else if ("4".equals(NIM.substring(6, 7))) {
            prodi = "Sistem Perhamburgeran";
        } else if ("6".equals(NIM.substring(6, 7))) {
            prodi = "Pendidikan Chum Bucket";
        } else if ("7".equals(NIM.substring(6, 7))) {
            prodi = "Teknologi Telepon Kerang";
        }
        return prodi+", "+ angkatan;
    }

    public double getBeasiswa(){
        if (IPK >= 3.0 && IPK < 3.5){
            return 50 + getTunjangan();
        } else if (IPK >= 3.5 && IPK <= 4.0){
            return 75 + getTunjangan();
        } else {
            return getTunjangan();
        }
    }
    public void totalMahasiswa(){
        System.out.println(jumlah1);
    }

    public String toString(){
        jumlah1++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
                "\nNama          : " + getNama()+
                        "\nNIK           : "+ getNIK()+
                        "\nJenis Kelamin : "+ (getJenisKelamin()?"Laki-laki" : "Perempuan") +
                        "\nNIM           : "+ getNIM() +
                        "\nIPK           : "+ getIPK() +
                        "\nStatus        : "+ getStatus() +
                        "\nPendapatan    : "+ getBeasiswa()  + "$" +"\n"
                ;
    }
}