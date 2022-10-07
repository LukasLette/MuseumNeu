package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;

public class Rubin implements Edelstein {
    public Rubin() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int getGewichtInKarat() {
        return 0;
    }

    @Override
    public EdelsteinTyp getTyp() {
        return null;
    }

    @Override
    public int getWert() {
        return 0;
    }
}
