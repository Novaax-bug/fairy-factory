package fairyShop.models;

import java.util.Collection;

abstract class BaseHelper implements Helper {
    private String name;
    private int energy;
    private Collection<Instrument> instruments;

    BaseHelper(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public void work() {

    }

    public void addInstrument(Instrument instrument) {

    }

    public boolean canWork() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getEnergy() {
        return 0;
    }

    @Override
    public Collection<Instrument> getInstruments() {
        return null;
    }
}
