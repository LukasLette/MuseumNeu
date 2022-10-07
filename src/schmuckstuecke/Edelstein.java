package schmuckstuecke;


import stuff.EdelsteinTyp;

public class Edelstein implements stuff.Edelstein {

    private final int karat;
    private final EdelsteinTyp edelsteinTyp;

    public Edelstein(int karat, EdelsteinTyp edelsteinTyp) {
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
                return 5000 * karat;
            case SMARAGD:
                return 4000 * karat;
            case AMETHYST:
                return 3000 * karat;
            case RUBIN:
                return 2000 * karat;
        }
        return 0;
    }
}
