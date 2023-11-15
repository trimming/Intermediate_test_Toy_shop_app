import model.ToysList;

public class Main {
    public static void main(String[] args) {

        ToysList toysList = new ToysList();
        toysList.create("Спиннер", 30, 20);
        toysList.create("Сквиш", 20, 12);
        toysList.create("Симпл-димпл", 10, 15);

        System.out.println(toysList.getToyList().toString());
        System.out.println(toysList.getToyById(2));
    }
}