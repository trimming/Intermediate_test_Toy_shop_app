
import model.Toy;
import service.QueueCreator;
import service.ToysList;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            ToysList toys = new ToysList();
            toys.create("Спиннер", 20, 5);
            toys.create("Сквиш", 20, 5);
            toys.create("Симпл-димпл", 50, 10);
            toys.create("Попыт", 10, 2);

            QueueCreator queueCreator = new QueueCreator(toys.getToyList());

            queueCreator.getRandomToy();

            queueCreator.givePrize();
            queueCreator.givePrize();
            queueCreator.givePrize();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}