package KODLARIM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

public class Arrayslist {


    public static void main(String[] args) {
///   arrays ekleme

        int arr1[] = {1,2,3,4};
        int arr2[] = {11,12,13,14,15};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(11,12,13,14,15));
        list1.addAll(list2);
        System.out.println(list1);


    }
}





