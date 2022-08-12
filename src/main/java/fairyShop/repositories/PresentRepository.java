package fairyShop.repositories;

import fairyShop.models.Present;

import java.util.ArrayList;
import java.util.Collection;

public class PresentRepository implements Repository {
    private Collection<Present> presents;

    PresentRepository() {
        this.presents = new ArrayList<>();
    }

    public void add(Present present) {

    }

    public boolean remove(Present present) {
        return false;
    }

    public Present findByName(String name) {
        return null;
    }

    public Collection<Present> getModels() {
        return null;
    }

    @Override
    public void add(Object model) {

    }

    @Override
    public boolean remove(Object model) {
        return false;
    }

}
