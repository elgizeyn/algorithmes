package github.algorithmes.leetcode.algos.math;

import java.util.HashSet;
import java.util.Set;

public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }


    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big == 0)
                return false;
            big--;
            return true;
        } else if (carType == 2) {
            if (medium == 0)
                return false;
            medium--;
            return true;
        } else {
            if (small == 0)
                return false;
            small--;
            return true;
        }
    }


    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        String s = new String("Java");
        System.out.println(set.remove(s));
        System.out.println(set.remove(s));
//        HashMap<String, Object> map = new HashMap<>();


//        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
//        boolean param_1 = parkingSystem.addCar(1);
//        boolean param_2 = parkingSystem.addCar(2);
//        boolean param_3 = parkingSystem.addCar(3);
//        boolean param_4 = parkingSystem.addCar(1);
//
//        System.out.println(param_1);
//        System.out.println(param_2);
//        System.out.println(param_3);
//        System.out.println(param_4);
    }


}
