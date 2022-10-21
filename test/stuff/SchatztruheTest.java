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

}