package stuff;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class SchatztruheTest {

    @Test
    public void testeBezeichnungen() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {

            String bezeichnung = schmuck.getBezeichnung();
            Assert.assertNotNull("Die Bezeichnung von " + schmuck.getClass().getName() + " ist null", bezeichnung);
            Assert.assertTrue("Die Bezeichnung von " + schmuck.getClass().getName() + " ist zu klein", bezeichnung.length() > 3);
        }
    }

    @Test
    public void testeMaterial() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {

            Material material = schmuck.getMaterial();
            Assert.assertNotNull("Das Material von " + schmuck.getClass().getName() + " ist null", material);
        }
    }

    @Test
    public void testeKatalognummer() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {

            int katalognummer = schmuck.getKatalognummer();

            Assert.assertTrue("Die Katalognummer von" + schmuck.getClass().getName() + " ist negativ", katalognummer > 0);
            Assert.assertTrue("Die Katalognummer von" + schmuck.getClass().getName() + " ist eine ganze Zahl", katalognummer == (int) katalognummer);
        }
    }

    @Test
    public void testeDoppelteKatalognummer() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();
        ArrayList<Integer> katalognummerliste = new ArrayList<>();
        for (Schmuck schmuck : schatz) {

            int katalognummer = schmuck.getKatalognummer();
            String doppelteNummerName = getDoppelteNummerName(schmuck);
            Assert.assertNull(schmuck.getClass().getName() + " und " + doppelteNummerName + " haben die gleiche Nummer", doppelteNummerName);
            katalognummerliste.add (katalognummer);
        }
        ArrayList<Integer> katalognummerliste2 = new ArrayList<>();
    }

    private String getDoppelteNummerName(Schmuck s){
        for (Schmuck schmuck : Schatztruhe.getSchatz()) {

            if (s.getClass().equals(schmuck.getClass())){
                continue;
            }
            if (schmuck.getKatalognummer() == s.getKatalognummer()){
                return schmuck.getClass().getName();
            }

        }
        return null;
    }

    @Test
    public void testeMaterialGewicht() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {
            Assert.assertTrue("Das Gewicht von dem Material von " + schmuck.getClass().getName() + " ist kein Integer", schmuck.getMaterialGewicht() == (int)schmuck.getMaterialGewicht());
            int materialGewicht = schmuck.getMaterialGewicht();
            Assert.assertTrue("Das Gewicht von dem Material von " + schmuck.getClass().getName() + " ist negativ", materialGewicht > 0);
        }
    }
    @Test
    public void testeVerbauteEdelesetine() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {

            Collection<Edelstein> steinSammlung = schmuck.getVerbauteEdelsteine();
            Assert.assertNotNull("Die Edelstein Collection von " + schmuck.getClass().getName() + " ist null", steinSammlung);
        }
    }
    @Test
    public void testeGesamtwertInEuro(){

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {


            int gesamtwert = schmuck.getGesamtwertInEuro();
            System.out.println(gesamtwert + schmuck.getClass().getName());
            Assert.assertTrue("Der Preis von " + schmuck.getClass().getName() + "ist zu gering" ,gesamtwert > 1000);
            Assert.assertTrue("Der Preis von " + schmuck.getClass().getName() + "ist zu hoch" ,gesamtwert < 10000000);


        }
    }
}