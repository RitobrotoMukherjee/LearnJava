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
        List<Integer> l1 = convertArrayToList(1, 2, 3, 4, 5, 6);
        List<Integer> l2 = convertArrayToList(7, 8, 3, 4, 56);

        SubsetOfArray cl = new SubsetOfArray(l1, l2);

        cl.getSolution();
        System.out.println("Result: " + cl.getResult());
    }
}