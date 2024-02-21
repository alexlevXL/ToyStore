package ToyStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Кукла", 348);
        Toy toy2 = new Toy(1, "Машинка", 245);
        Toy toy3 = new Toy(2, "Робот", 886);
        Toy toy4 = new Toy(3, "Матрёшка", 767);

        List<Toy> toys = new ArrayList<Toy>(); //Массив
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
               return o2 - o1;
            }
            
        });
        queue.add(4);
        queue.add(1);
        queue.add(3); 
        queue.add(2);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); //Используем API коллекцию: java.util.PriorityQueue 
            
    

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
    }
}
}