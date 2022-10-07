package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class Armband implements Schmuck {

    private ArrayList<Edelstein> edelsteine;

    public Armband() {
        EdelsteinImpl diamant = new EdelsteinImpl(5, EdelsteinTyp.DIAMANT);
        edelsteine = new ArrayList();
        edelsteine.add(diamant);

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
        int preis = 100;
        int steinGewicht = 0;

        for (Edelstein edelstein : edelsteine) {
            steinGewicht += edelstein.getGewichtInKarat() * 0.2;
        }
        switch (getMaterial()){
            case GOLD:
                preis += getMaterialGewicht() - steinGewicht * 66;
                break;
            case SILBER:
                preis += getMaterialGewicht() - steinGewicht * .6;
                break;
            case KATZENGOLD:
                preis += getMaterialGewicht() - steinGewicht * 2;
                break;
            case PLATIN:
                preis += getMaterialGewicht() - steinGewicht * 30;
                break;
            case BLECH:
                preis += getMaterialGewicht() - steinGewicht * .1;
                break;
        }
        for (Edelstein edelstein : edelsteine) {
            preis += edelstein.getWert();
        }
        return preis;
    }
}
