package fairyShop.models;

public class PresentImpl implements Present {
    private String name;
    private int energyRequired;

    PresentImpl(String name, int energyRequired) {
        this.name = name;
        this.energyRequired = energyRequired;
    }

    public void getCrafted() {

    }

    public boolean isDone() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getEnergyRequired() {
        return 0;
    }


}
