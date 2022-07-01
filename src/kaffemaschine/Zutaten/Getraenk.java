package kaffemaschine.Zutaten;

public abstract class Getraenk {
    
    String beschreibung = "Unbekanntes Getränk";
    
    public String getBeschreibung(){
        
        //Das ist die Ausgabe vom String "Beschreibung"        
        return beschreibung;
    }
    
    public abstract double getPreis();
}
