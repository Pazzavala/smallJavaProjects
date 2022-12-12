package Basic;

import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        // ArrayList: resizable Array

        ArrayList<String> food = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        food.add("Enchiladas");
        food.add("Tacos");
        food.add("Tamales");

        for(String f: food) {
            System.out.println(f);
        }

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

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
