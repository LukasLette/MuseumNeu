package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class Halskette implements Schmuck {

    private ArrayList<Edelstein> edelsteine;

    public Halskette() {
        EdelsteinImpl amethyst = new EdelsteinImpl(25, EdelsteinTyp.AMETHYST);
        edelsteine = new ArrayList();
        edelsteine.add(amethyst);

    }

    @Override
    public String getBezeichnung() {
        return "Glänzende Kette. Mit schönem Edelstein in Magenta Farben";
    }

    @Override
    public Material getMaterial() {
        return Material.SILBER;
    }

    @Override
    public int getMaterialGewicht() {
        return 25;
    }

    @Override
    public int getKatalognummer() {
        return 110;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {

        return this.edelsteine;
    }

    @Override
    public int getGesamtwertInEuro() {
        int preis = 0;
        switch (getMaterial()){
            case GOLD:
                preis = 200;
                break;
            case SILBER:
                preis = 100;
                break;
            case KATZENGOLD:
                preis = 2;
                break;
            case PLATIN:
                preis = 300;
                break;
            case BLECH:
                preis = 10;
                break;
        }
        for (Edelstein edelstein : edelsteine) {
            preis += edelstein.getWert();
        }
        return preis;
    }
}
