package Basic;

import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        // ArrayList: resizable Array

         // 2D ArrayList
         ArrayList<String> bakeryList = new ArrayList<>();
         bakeryList.add("Concha");
         bakeryList.add("Pastel de tres leches");
         bakeryList.add("donuts");
 
         ArrayList<String> produceList = new ArrayList<>();
         produceList.add("Brocoli");
         produceList.add("Onions");
         produceList.add("Tomatos");
         produceList.add("Carrots");


        ArrayList<String> food = new ArrayList<>();
        food.add("Enchiladas");
        food.add("Tacos");
        food.add("Tamales");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(food);

        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(2));


        for(String f: food) {
            System.out.println(f);
        }

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            nums.add(i + i);
        }

        System.out.println(nums);
        nums.set(0,  89);
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);
        nums.clear();
        System.out.println(nums);
       

        
    }
}
