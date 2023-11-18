package view;

import model.Toy;

import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

public class ToysView implements View{
    Logger logger = Logger.getLogger(ToysView.class.getName());
    @Override
    public void sendOnConsole(Toy toy) {
        logger.info(toy.toString());

    }

}
