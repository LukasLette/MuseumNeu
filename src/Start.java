import stuff.Schatztruhe;
import stuff.Schmuck;

import java.util.Collection;

public class Start {


    public static void main(String[] args) {


        Collection<Schmuck> schatz = Schatztruhe.getSchatz();
        for (Schmuck schmuck : schatz) {
            System.out.println("Gefunden: " + schmuck.getBezeichnung());
        }
    }
}
