package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
//        if (citizens.containsKey()) {
//            citizens.put(citizen.getPassport(), citizen);
//        }
        return rsl;
    }


    public Collection<Citizen> getAll() {
        return citizens.values();
    }

    public Citizen get(String passport) {
        return null;
    }
}
