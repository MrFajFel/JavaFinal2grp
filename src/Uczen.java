import java.util.Objects;

// Dla każdej klasy utwórz nagłówek według wzoru (uzupełnij opisy klas, wypisz wszystkie pola)
/**
 Klasa uczen zawiera bardzo istotne informacje na temat ucznia
 id : Int, Pole przedstawia ktorym jest dodanym uczniem
 imie : String, Pole przedstawia imie ucznia
 Nazwisko : String, Pole przedstawia nazwisko ucznia
 @author: Filip Aleksandrowicz
 **/

public class Uczen {
    private int id = 0;
    private final String imie;
    private final String  nazwisko;


    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id= id +1;
    }

    public Uczen(Uczen uczen) {
        this.imie = uczen.imie;
        this.nazwisko = uczen.nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return id == uczen.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Imie: %s, Nazwisko: %s",id,imie, nazwisko);
    }
}
