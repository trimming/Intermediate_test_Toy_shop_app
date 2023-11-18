package view;

import model.Toy;

import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

public class ToysView implements View{
    Logger logger = Logger.getLogger(ToysView.class.getName());
    @Override
    public void sendOnConsole(List<Toy> list) {
        for(Toy toy: list){
            logger.info(toy.toString());
        }
    }

}
