package mx.edu.utng.dloza.ejercicioadapter;

/**
 * Created by Daniel on 18/09/2017.
 */

public class WildTurkey implements Turkey {
    @Override
    public String gobble() {
        return "Gorda gorda gorda";
    }

    @Override
    public String fly() {
        return "I'm flying a short distance";
    }
}
