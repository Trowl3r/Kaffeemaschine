package kaffemaschine.Zutaten;

import kaffemaschine.Zutaten.Getraenk;

public class Milchschaum extends Getraenk{
    
    private Getraenk getraenk;
    
    public Milchschaum(Getraenk getraenk){
        this.getraenk = getraenk;
    }

    @Override
    public double getPreis() {
        return 0.1 + getraenk.getPreis();
    }
    
}
