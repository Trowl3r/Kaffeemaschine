package kaffemaschine.Zutaten;

import kaffemaschine.Zutaten.Getraenk;

public class Soja extends Getraenk{
    
    private Getraenk getraenk;
    
    public Soja(Getraenk getraenk){
        this.getraenk = getraenk;
    }

    @Override
    public double getPreis() {
        return 0.3 + getraenk.getPreis();
    }
    
}

