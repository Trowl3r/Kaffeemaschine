package kaffemaschine.Zutaten;

public class Hell extends Getraenk{
    
    private Getraenk getraenk;
    
    public Hell(Getraenk getraenk){
        this.getraenk = getraenk;
    }

    @Override
    public double getPreis() {
        return 0.95 + getraenk.getPreis();
    }
    
}
