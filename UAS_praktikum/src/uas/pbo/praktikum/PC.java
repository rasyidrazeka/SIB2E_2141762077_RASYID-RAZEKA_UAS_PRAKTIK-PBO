package uas.pbo.praktikum;
public class PC extends Komputer{
    public void hidupkan_os(){
        System.out.println("PC telah dinyalakan");
    }
    public void matikan_os(){
        System.out.println("PC telah dimatikan");
    }
    public void klik_kanan(){
        System.out.println("Klik kanan 1x menggunakan mouse pada PC");
    }
    public void klik_kiri(){
        System.out.println("Klik kiri 1x menggunakan mouse pada PC");
    }
    public void tekan_enter(){
        System.out.println("Tekan enter 1x menggunakan keyboard pada PC");
    }
    public void cetak_data(){
        System.out.println("================================");
        System.out.println("          CETAK DATA PC         ");
        System.out.println("================================");
    }
}