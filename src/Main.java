import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int line;

        System.out.print("Basamak sayısını giriniz: ");
        line=inp.nextInt();

        for (int i=line; i>0; i--) //basamak döngüsü
        {
            for (int j=line-i; j>0; j--)// yıldızdan önceki boşluğun döngüsü
            {
                System.out.print(" ");//ilk kez döndüğünde bu for dönmeyecek çünkü ilk satırda boşluk koymamak için
            }
            for (int n=(2*i-1); n>0; n--)// yıldızın döngüsü
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}