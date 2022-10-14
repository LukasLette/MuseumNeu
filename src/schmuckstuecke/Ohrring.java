package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
