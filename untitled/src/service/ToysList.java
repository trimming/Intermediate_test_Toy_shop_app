package service;

import model.Toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToysList {
    private final List<Toy> toyList = new ArrayList<>();

    public ToysList() {
    }
    public void create(String name, int chance, int quantity) {
        int id = this.getFreeId();
        Toy toy = new Toy(id, name, chance, quantity);
        this.toyList.add(toy);
    }

    private int getFreeId() {
        int lastId = 1;
        for (Toy toy : this.toyList) {
            lastId = toy.getToyId() + 1;
        }
        return lastId;
    }

    public Toy getToyById(int id) {
        for (Toy toy:
             this.toyList) {
            if (toy.getToyId() == id) {
                return toy;
            }
        }
        return null;
    }

    public List<Toy> getToyList() {
        return this.toyList;
    }

}
