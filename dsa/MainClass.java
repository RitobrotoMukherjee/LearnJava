package dsa;
import java.util.*;
import dsa.hashing.SubsetOfArray;

class MainClass {

    public static List<Integer> convertArrayToList(int ...arr) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i: arr) {
            list.add(i);
        }

        return list;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 7, 8, 3, 4, 56 };
        List<Integer> l1 = convertArrayToList(arr1);
        List<Integer> l2 = convertArrayToList(arr2);

        SubsetOfArray cl = new SubsetOfArray(l1, l2);

        cl.getSolution();
    }
}