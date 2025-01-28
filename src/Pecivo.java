public class Pecivo {

    String nazev;
    int cena;

public Pecivo(String nazev, int cena){
    this.nazev = nazev;
    this.cena = cena;

}

public void vypis(){
 if(cena > 10){
     System.out.println(nazev);
 }

}


}
