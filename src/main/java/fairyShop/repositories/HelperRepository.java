package fairyShop.repositories;

import fairyShop.models.Helper;

import java.util.ArrayList;
import java.util.Collection;

public class HelperRepository implements Repository {

    private Collection<Helper> helpers;

    HelperRepository() {
        this.helpers = new ArrayList<Helper>();
    }

    public void add(Helper helper) {

    }

    public boolean remove(Helper helper) {
        return false;
    }

    public Helper findByName(String name) {
        return null;
    }

    public Collection<Helper> getHelpers() {

        return null;
    }

    @Override
    public Collection getModels() {
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

