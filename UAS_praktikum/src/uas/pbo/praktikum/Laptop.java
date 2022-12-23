package uas.pbo.praktikum;
public class Laptop extends Komputer{
    public void hidupkan_os(){
        System.out.println("Laptop telah dinyalakan");
    }
    public void matikan_os(){
        System.out.println("Laptop telah dimatikan");
    }
    public void klik_kanan(){
        System.out.println("Klik kanan 1x menggunakan mouse pada Laptop");
    }
    public void klik_kiri(){
        System.out.println("Klik kiri 1x menggunakan mouse pada Laptop");
    }
    public void tekan_enter(){
        System.out.println("Tekan enter 1x menggunakan keyboard pada Laptop");
    }
    public void cetak_data(){
        System.out.println("================================");
        System.out.println("        CETAK DATA LAPTOP       ");
        System.out.println("================================");
    }
}