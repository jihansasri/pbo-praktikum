package praktikum10;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manusia mns1 = new Manusia("aj", "3913756680", true, true);
        Manusia mns2 = new Manusia("ami", "3900115677", false, false);
        Manusia mns3 = new Manusia("ali", "3921515060", true, false);
        ArrayList<Manusia> output = new ArrayList<Manusia>();
        output.add(mns1);
        output.add(mns2);
        output.add(mns3);

        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).toString());
        }
        System.out.println("____________________________________________________");

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Jihan", "350410608910", false, false, "215150600111013", 3.6);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Latfa", "350410222082", false, true, "215150300111011", 3.0);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Mika", "350410600001", false, false, "215150400111070", 3.8);
        ArrayList<MahasiswaFilkom> output1 = new ArrayList<MahasiswaFilkom>();
        output1.add(mhs1);
        output1.add(mhs2);
        output1.add(mhs3);


        for(int i=0;i<output1.size();i++){
            System.out.println(output1.get(i).toString());
        }
        System.out.println("____________________________________________________");

        Pekerja pkj1 = new Pekerja("Niki", "350410600302", true, true, 5, 15, "201309157097");
        Pekerja pkj2 = new Pekerja("Sri", "350410698730", false, false, 9, 28, "123458800124");
        Pekerja pkj3 = new Pekerja("Mega", "350410600302", false, true, 10, 29, "335008678992");
        ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
        output2.add(pkj1);
        output2.add(pkj2);
        output2.add(pkj3);


        for(int i=0;i<output2.size();i++){
            System.out.println(output2.get(i).toString());
        }
        System.out.println("____________________________________________________");

        Manajer mnj1 = new Manajer("Mia", "35041060030", false, true,9, 19,"202122230045", 1900);
        Manajer mnj2 = new Manajer("Juna", "350410600302", true, false,8, 20,"191212324005", 2800);
        Manajer mnj3 = new Manajer("Kiki", "350410600302", true, true,6, 25,"609124759980", 3000);
        ArrayList<Manajer> output3 = new ArrayList<Manajer>();
        output3.add(mnj1);
        output3.add(mnj2);
        output3.add(mnj3);


        for(int i=0;i<output3.size();i++){
            System.out.println(output3.get(i).toString());
        }
        System.out.println("____________________________________________________");

    }
}
