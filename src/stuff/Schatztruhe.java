package stuff;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Die stuff.Schatztruhe beinhaltet eine Schatz, der aus jeweils einem Objekt von jeder Klasse besteht,
 * welche {@link Schmuck} implementieren und im Verzeichnis 'schmuckstuecke' liegen.
 */
public class Schatztruhe {


    public static Collection<Schmuck> getSchatz(){


        Reflections reflections = new Reflections("schmuckstuecke");

        Set<Class<? extends Schmuck>> allSchmuckClasses = reflections.getSubTypesOf(Schmuck.class);
        Collection<Schmuck> schmuckstuecke = new HashSet<>();
        for (Class<? extends Schmuck> schmuckKlasse : allSchmuckClasses) {
            try {
                schmuckstuecke.add(schmuckKlasse.getDeclaredConstructor().newInstance());
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        return schmuckstuecke;

    }
}
