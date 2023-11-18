package service;

import model.Toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QueueCreator implements Creator{
    private  final List<Toy> queueList = new ArrayList<>();

    private final List<Toy> toys;

    public QueueCreator(List<Toy> toysList) {
        this.toys = toysList;
    }


    public List<Toy> getQueueList() {
        return queueList;
    }

    private void setAllToysRange() {
        int count = 0;
        for(Toy toy: toys){
            toy.setToyRange(count);
            count += toy.getChance();
        }
    }
    private int getTotalToys() {
        int totalToys = 0;
        for (Toy toy: toys){
            totalToys += toy.getQuantity();
        }
        return totalToys;
    }
    private void writePrizeToFile(Toy toy){
        try (FileWriter fileWriter = new FileWriter("toys.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(toy.toString());
            System.out.println(toy.getName() + " выдан!");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void getRandomToy(){
        this.setAllToysRange();
        Random random = new Random();
        int totalToys = this.getTotalToys();
        while(totalToys > 0){
            int randomNum = random.nextInt(100);
            for(Toy toy: toys){
                if(randomNum >= toy.getToyRange() &&
                        randomNum < toy.getToyRange() + toy.getChance() &&
                        toy.getQuantity() > 0){
                    queueList.add(toy);
                    totalToys--;
                    toy.setQuantity(toy.getQuantity() - 1);
                    System.out.println("Выпал " + toy.getName() + ". Выигрыш можно получить на кассе.");
                }
            }
        }
    }

    @Override
    public void givePrize() {
        this.writePrizeToFile(this.queueList.get(0));
        this.getQueueList().remove(0);
    }
}
