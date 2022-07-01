package kaffemaschine.Zutaten;

public class Dunkel extends Getraenk{
    
    private Getraenk getraenk;
    
    public Dunkel(Getraenk getraenk){
        this.getraenk = getraenk;
    }

    @Override
    public double getPreis() {
        return 0.95 + getraenk.getPreis();
    }
    
}
