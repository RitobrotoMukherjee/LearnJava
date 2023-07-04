package dsa.hashing;

import java.util.*;
import dsa.Interfaces.MainInterface;

public class SubsetOfArray implements MainInterface {

    private List<Integer> arrayOne;
    private List<Integer> arrayTwo;

    public SubsetOfArray(List<Integer> arrayOne, List<Integer> arrayTwo) {
        this.arrayOne = arrayOne;
        this.arrayTwo = arrayTwo;
    }

    public void getSolution() {
        System.out.println("Rito");
        System.out.println(this.arrayOne);
        System.out.println(this.arrayTwo);
    }
}