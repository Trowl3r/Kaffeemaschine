package kaffemaschine.Zutaten;

import kaffemaschine.Zutaten.Getraenk;

public class Schoko extends Getraenk{
    
    private Getraenk getraenk;
    
    public Schoko(Getraenk getraenk){
        this.getraenk = getraenk;
    }

    @Override
    public double getPreis() {
        return 0.2 + getraenk.getPreis();
    }
    
}
