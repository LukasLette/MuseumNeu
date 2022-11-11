package schmuckstuecke;

import stuff.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Wertvoll
public class Ring implements Schmuck {


    public Ring() {

    }

    @Override
    public String getBezeichnung() {
        return "Goldener Ring.";
    }

    @Override
    public Material getMaterial() {
        return Material.KATZENGOLD;
    }

    @Override
    public int getMaterialGewicht() {
        return 6;
    }

    @Override
    public int getKatalognummer() {
        return 921;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        return new ArrayList<>();
    }

    @Override
    public int getGesamtwertInEuro() {
        return Material.KATZENGOLD.getPreisProGramm() * 6 + 69;
    }
}
