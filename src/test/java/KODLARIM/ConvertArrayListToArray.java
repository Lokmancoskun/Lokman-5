package KODLARIM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ali");
        list.add("veli");
        list.add("can");
        //  System.out.println(list);
        String [] arr = new String [list.size()];
//
//        arr = list.toArray(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[0]);

        for (int i=0; i<list.size(); i++) {
            arr[i]= list.get(i);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);



    }
}