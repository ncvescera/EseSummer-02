package esesummer.pkg02;

public class EseSummer02 {
    public static void main(String[] args) {
        Garage prova = new Garage();
        Veicolo uno = new Veicolo("moto","andrea","aaaaaaa","20/07/2015","20/08/2015");
        
        int ris = prova.addVeicolo(3, uno);
        System.out.println(ris);
        prova.stampa();
        
        ris = prova.addVeicolo(2, uno);
        System.out.println(ris);
        prova.stampa();
        
    }

}
