package kaffemaschine.Zutaten;

import kaffemaschine.Zutaten.Getraenk;

public class Sahne extends Getraenk{
    
    private Getraenk getraenk;
    
    public Sahne(Getraenk getraenk){
        this.getraenk = getraenk;
    }

    @Override
    public double getPreis() {
        return 0.5 + getraenk.getPreis();
    }
    
}
