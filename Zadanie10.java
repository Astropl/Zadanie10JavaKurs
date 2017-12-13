import java.util.Scanner;

public class Zadanie10
{
    /*Zadanie 10. Napisać program, który wczytuje liczby podawane przez
użytkownika dotąd, do- póki nie podana zostanie liczba 0. Następnie
wyświetlić sumę wszystkich poda- nych liczb.*/

    public static void main(String[] args) {
        System.out.println(" Podawaj liczby, jęsli wybierzesz 0 oblicze sume podanych liczb: ");
        Scanner sc = new Scanner(System.in);
        int liczba,suma=0;
        do{
            liczba= sc.nextInt();
            suma = suma + liczba;
        }
        while ( liczba != 0);
       // for ( int i = 1;i<)
        System.out.println("suma wyniku : " + suma);
    }
}
