package fairyShop.models;

import java.util.Collection;

public class InstrumentImpl implements Instrument {
    private int power ;

    InstrumentImpl(int power){
        this.power = power;
    }

    @Override
    public int getPower() {
        return 0;
    }

    public void use () {

    }
    public boolean isBroken(){
        return false;
    }


}
