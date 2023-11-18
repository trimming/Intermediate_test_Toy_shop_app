package model;

public class Toy {
    private final int toyId;
    private final String name;
    private int chance;
    private int quantity;
    private int toyRange;

    public Toy(int toyId, String name, int chance, int quantity) {

            this.toyId = toyId;
            this.name = name;
            this.chance = chance;
            this.quantity = quantity;


    }

    public int getToyRange() {
        return toyRange;
    }

    public void setToyRange(int toyRange) {
        this.toyRange = toyRange;
    }

    public int getToyId() {
        return toyId;
    }

    public String getName() {
        return name;
    }


    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return  "id=" + toyId +
                '\'' + name + '\'' + '\n';
    }
}
