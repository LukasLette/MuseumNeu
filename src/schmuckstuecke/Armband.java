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
        return "Platin Armband. Mit einem Diamant besetzt.";
    }

    @Override
    public Material getMaterial() {
        return Material.PLATIN;
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
        int steinPreis = 0;
        for (Edelstein edelstein : edelsteine) {
            steinPreis +=  edelstein.getWert();
        }
        preis += getMaterialGewicht() * getMaterial().getPreisProGramm() + steinPreis;

        return preis;
    }
}
