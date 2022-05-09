package KODLARIM;

public class LinkedList {

    public static void main(String[] args) {


        java.util.LinkedList<Integer> ll4 = new java.util.LinkedList<>();
        ll4.add(3);
        ll4.add(12);
        ll4.add(13);
        System.out.println(ll4);//[3, 12, 13]

        java.util.LinkedList<Integer> ll3 = new java.util.LinkedList<>();
        ll3.add(0, 12);//when you use add(index, element) make the indexes in ascending order
        ll3.add(1, 13);
        ll3.add(2, 10);
        ll3.add(3, 11);
        System.out.println(ll3);

        ll4.addAll(1, ll3);//adding all elements of ll3 to index 1 of ll4
        System.out.println(ll4);//[3, 10, 9, 8, 12, 13, 3, 12, 13]
    }
}