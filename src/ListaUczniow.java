import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 Klasa Listauczniow zawiera liste uczniow i mozliwosci takie jak dodanie ucznia lub wyswietlenie listy a nawet usuniecie go i wylosowanie do odpowiedzi
 uczniowie : List<Uczen> przedstawia liste uczniow
 wylosowany : int , Randomowa liczba potrzebna do zrobienia losowania
 @author: Filip Aleksandrowicz
 **/

public class ListaUczniow {
    private List<Uczen> uczniowie = new ArrayList<>();

    void dodaj(String imie,String nazwisko){
        Uczen uczen = new Uczen(imie,nazwisko);
        uczniowie.add(uczen);
        System.out.println("Uczen dodany");
    }
    void wyswietl(){
        System.out.println(uczniowie);
    }
    void usun(String imie, String nazwisko){
        for (Uczen uczen : uczniowie){
            if (imie.equals(uczen.getImie()) && nazwisko.equals(uczen.getNazwisko())){
                uczniowie.remove(uczen);
            }
        }
    }
    void losuj(int n){
        Random rand = new Random();
        for (int i =0; i < n; i++) {
            int wylosowany = rand.nextInt(uczniowie.size());
            System.out.println(uczniowie.get(wylosowany) + " Bedzie zapytany");
        }
    }
}
