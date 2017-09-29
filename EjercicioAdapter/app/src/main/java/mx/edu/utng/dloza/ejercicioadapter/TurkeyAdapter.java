package mx.edu.utng.dloza.ejercicioadapter;

/**
 * Created by Daniel on 18/09/2017.
 */

public class TurkeyAdapter implements Duck{
    Turkey turkey; //objeto tipo ppavo

    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }
    @Override
    public String quack() {
        return turkey.gobble();
    }

    @Override
    public String fly() {
        return turkey.fly();
    }
}
