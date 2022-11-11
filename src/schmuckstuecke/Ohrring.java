package schmuckstuecke;
import stuff.*;

import java.util.Collection;

@Fake
public class Ohrring implements Schmuck {


    public Ohrring() {

    }

    @Override
    public String getBezeichnung() {
        return "Silberner Ohrring mit einem Eldelstein in Rot";
    }

    @Override
    public Material getMaterial() {
        return Material.SILBER;
    }

    @Override
    public int getMaterialGewicht() {
        return 6;
    }

    @Override
    public int getKatalognummer() {
        return 420;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        return null;
    }

    @Override
    public int getGesamtwertInEuro() {


        return Material.SILBER.getPreisProGramm() * 6;
    }
}
