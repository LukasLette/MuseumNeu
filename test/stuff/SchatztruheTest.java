package stuff;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class SchatztruheTest {

    @Test
    public void testeBezeichnungen() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {

            String bezeichnung = schmuck.getBezeichnung();
            Assert.assertNotNull("Die Bezeichnung von " + schmuck.getClass().getName() + " ist null", bezeichnung);
            Assert.assertTrue("Die Bezeichnung von " + schmuck.getClass().getName() + " ist zu klein",bezeichnung.length() > 3);
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