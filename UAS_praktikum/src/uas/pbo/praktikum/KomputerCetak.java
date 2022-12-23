package uas.pbo.praktikum;
public final class KomputerCetak {
    public final static void cetak(Komputer[] obj){
        for(Komputer kmptr : obj){
            if(kmptr instanceof PC){
                kmptr.cetak_data();
                kmptr.hidupkan_os();
                kmptr.klik_kanan();
                kmptr.klik_kiri();
                kmptr.tekan_enter();
                kmptr.matikan_os();
                System.out.println("================================");
                System.out.println();
            }else if(kmptr instanceof Laptop){
                kmptr.cetak_data();
                kmptr.hidupkan_os();
                kmptr.klik_kanan();
                kmptr.klik_kiri();
                kmptr.tekan_enter();
                kmptr.matikan_os();
                System.out.println("================================");
                System.out.println();
            }else if(kmptr instanceof Netbook){
                kmptr.cetak_data();
                kmptr.hidupkan_os();
                kmptr.klik_kanan();
                kmptr.klik_kiri();
                kmptr.tekan_enter();
                kmptr.matikan_os();
                System.out.println("================================");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        PC pc = new PC();
        Laptop lp = new Laptop();
        Netbook nb = new Netbook();

        Komputer[] komputer = {pc,lp,nb};
        cetak(komputer);
    }
}