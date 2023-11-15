package model;

public class Toy {
    private int toyId;
    private String name;
    private int chance;
    private int quantity;

    public Toy(int toyId, String name, int chance, int quantity) {
        this.toyId = toyId;
        this.name = name;
        this.chance = chance;
        this.quantity = quantity;
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Toy{" +
                "toyId=" + toyId +
                ", name='" + name + '\'' +
                ", chance=" + chance +
                ", quantity=" + quantity +
                '}';
    }
}
