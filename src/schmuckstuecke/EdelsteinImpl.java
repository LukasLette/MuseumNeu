package schmuckstuecke;


import stuff.EdelsteinTyp;

public class EdelsteinImpl implements stuff.Edelstein {

    private final int karat;
    private final EdelsteinTyp edelsteinTyp;

    public EdelsteinImpl(int karat, EdelsteinTyp edelsteinTyp) {
        this.karat = karat;
        this.edelsteinTyp = edelsteinTyp;
    }

    @Override
    public int getGewichtInKarat() {
        return karat;
    }

    @Override
    public EdelsteinTyp getTyp() {
        return edelsteinTyp;
    }

    @Override
    public int getWert() {
        switch (edelsteinTyp){
            case DIAMANT:
               return 6000 * karat;
            case SAPHIR:
                return 250 * karat;
            case SMARAGD:
                return 700 * karat;
            case AMETHYST:
                return 20 * karat;
            case RUBIN:
                return 1000  * karat;
        }
        return 0;
    }
}
