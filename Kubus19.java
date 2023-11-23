import java.util.Scanner;

public class Kubus19 {

//fungsi hitung volume
    static int hitungvolume (int s) {
        int volume=s*s*s;
        return volume;
    }
    //fungsi hitung luas permukaan
    static int hitungLuas (int s) {
        int lPermukaan = s*s*6;
        return lPermukaan;
    }
    //fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, L, vol;
        System.out.println("Masukkan sisi");
        s=input.nextInt();


        vol=hitungvolume(s);
        System.out.println("Volume kubus adalah "+vol);
        L=hitungLuas(s);
        System.out.println("Luas permukaan kubus adalah "+L);
    }
}