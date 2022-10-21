package stuff;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import schmuckstuecke.EdelsteinImpl;

import java.util.ArrayList;
import java.util.Collection;

public class EdelsteinTest extends TestCase {

    Collection<Schmuck> schatz = Schatztruhe.getSchatz();


    @Test
    public void testGetGewichtInKarat() {

        for (Schmuck schmuck: schatz) {
            Collection<Edelstein> edelsteine = schmuck.getVerbauteEdelsteine();
            Assert.assertNotNull(schmuck.getClass().getName() + " hat als Edelsteinsammlung null", edelsteine);
            for (Edelstein edelstein: edelsteine
                 ) {

                Assert.assertTrue("Edelstein mit " + edelstein.getGewichtInKarat() + " des Schmuckes "+ schmuck.getClass().getName() +" Karat ist zu leicht oder schwer!", edelstein.getGewichtInKarat()>1 && edelstein.getGewichtInKarat() < 3000 );

            }
        }

    }

    @Test
    public void testGetTyp() {

        for (Schmuck schmuck: schatz) {

            Collection<Edelstein> edelsteine = schmuck.getVerbauteEdelsteine();
            for (Edelstein edelstein: edelsteine) {

                Assert.assertTrue("Edelstein "+ edelstein.getClass().getName()+" des Schmuckes "+schmuck.getClass().getName()+" hat keinen gültigen Edelsteintyp", edelstein.getTyp() != null);

            }
        }

    }

    @Test
    public void testGetWert() {
        for (Schmuck schmuck: schatz) {
            Collection<Edelstein> edelsteine = schmuck.getVerbauteEdelsteine();
            for (Edelstein edelstein: edelsteine) {
                Assert.assertTrue("Der Preis des Edelsteins "+ edelstein.getClass().getName() +" des Schmuckes "+ schmuck.getClass().getName() +" ist null oder negativ!", edelstein.getWert() >0 || edelstein.getWert() == -1);

                if (edelstein.getWert() == -1){
                    Assert.assertTrue("Der Preis der Schmuckstückes "+ schmuck.getClass().getName() +" des Schmuckes "+ schmuck.getClass().getName()+" konnte ermittelt worden, obwohl der Edelstein einen ungültigen Wert hat!", schmuck.getGesamtwertInEuro() != -1 );
                }
            }
        }


    }
}