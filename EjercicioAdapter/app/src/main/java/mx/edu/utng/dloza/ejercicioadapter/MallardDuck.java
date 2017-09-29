package mx.edu.utng.dloza.ejercicioadapter;

/**
 * Created by Daniel on 18/09/2017.
 */

public class MallardDuck implements Duck{ //Pato silvestre
    @Override
    public String quack() {
        return "Quack!!";
    }

    @Override
    public String fly() {
        return "I'm flying!!";
    }
}
