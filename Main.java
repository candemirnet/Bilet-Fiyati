import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double mesafe, yas, tip;
        Scanner imp = new Scanner(System.in);
        System.out.print("Lütfen Mesafeyi Giriniz: ");
        mesafe = imp.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = imp.nextInt();
        System.out.print("1 => Tek Yön, 2 => Gidiş Dönüş: ");
        tip = imp.nextInt();

        double normalTutar, yasIndirim, IndirimliTutar, gidisDonus;
        normalTutar = mesafe * 0.10;

        if((yas >=0) && (mesafe > 0) && (tip>0 && tip <3)){
            if(yas < 12){
                yasIndirim = normalTutar - (normalTutar* 0.5);
                if(tip == 1){
                    System.out.println("Toplam Tutar: " + yasIndirim + " TL");
                }else{
                    gidisDonus = (yasIndirim - (yasIndirim * 0.2)) * 2;
                    System.out.println("Toplam Tutar: " + gidisDonus + " TL");
                }
            }else if((yas >= 12) && (yas < 24)){
                yasIndirim = normalTutar - (normalTutar * 0.1);
                if(tip == 1){
                    System.out.println("Toplam Tutar: " + yasIndirim + " TL");
                }else{
                    gidisDonus = (yasIndirim - (yasIndirim * 0.2)) *2;
                    System.out.println("Toplam Tutar: " + gidisDonus + " TL");
                }
            }else if ((yas >= 24) && (yas <=65) ) {
                if(tip == 1){
                    System.out.println("Toplam Tutar: " + normalTutar + " TL");
                }else{
                    IndirimliTutar = normalTutar - (normalTutar * 0.2);
                    System.out.println("Toplam Tutar: " + IndirimliTutar + " TL");
                }
            }else{
                yasIndirim = (normalTutar - (normalTutar * 0.3));
                if(tip == 1){
                    System.out.println("Toplam Tutar: " + yasIndirim + " TL");
                }else{
                    gidisDonus = yasIndirim - (yasIndirim * 0.2);
                    System.out.println("Toplam Tutar: " + gidisDonus + " TL");
                }
            }
        }else{
            System.out.println("Hatalı Bir İşlem Yaptınız");
        }



    }

    }
