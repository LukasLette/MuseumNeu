package schmuckstuecke;

import stuff.*;

import java.util.ArrayList;
import java.util.Collection;
@Wertvoll
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
        int steinPreis = 0;
        for (Edelstein edelstein : edelsteine) {
            steinPreis +=  edelstein.getWert();
        }
        preis += getMaterialGewicht() * getMaterial().getPreisProGramm() + steinPreis;

        return preis;
    }
}
