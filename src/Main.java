import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
/**
 Klasa main jest naszym glownym programem ktory wykonuje polecenia
 user : Scanner, pobiera wartosci od uzytkownika
 uczen1 : Uczen, Jest naszym testowym uczniem do sprawdzenia funkcjonalnosci programu :>
 porownanie: sortowanie uczniow alfabetycznie
 sortujemy : Consumer<Uczen> sprawdza czy dlugosc nazwiska jest parzysta
 @author: Filip Aleksandrowicz
 **/


public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Uczen uczen1 = new Uczen("rysard","jabkoo");
        ListaUczniow listaUczniow = new ListaUczniow();

        System.out.println("zapisz 5 uczniow:");
        for (int i = 1 ;i<=5;i++){
            System.out.println(i + " podaj imie");
            String imie = user.nextLine();
            System.out.println("podaj Nazwisko");
            String nazwisko = user.nextLine();
            listaUczniow.dodaj(imie,nazwisko);
        }
        listaUczniow.dodaj("ryszard","jabko");
        listaUczniow.dodaj("Grzegorz","gruszka");
        listaUczniow.dodaj("pawel","ogorek");





        Comparator<Uczen> porownanie = (o1, o2) -> {
            // nie wiem
            return 0;
        };

        Consumer<Uczen> sortujemy = (uczen) -> {
            if (uczen.getNazwisko().length() %2 ==0) {
                System.out.println(true);
            }
        };
        sortujemy.accept(uczen1);
        listaUczniow.wyswietl();
        listaUczniow.losuj(2);
    }
}