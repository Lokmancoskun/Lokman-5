
 package KODLARIM;

 import java.util.Arrays;

 public class FindMaxElement {


     public static void main(String[] args) {
         int[] arr = {1, 100, 54, -100, 76};

         //Sorting the arrays
//            Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));

         //   1. way to find max value
//         Arrays.sort(arr);
//         System.out.println(arr[arr.length - 1]);
//     }
// }

         //2.way to find max value

         int max = arr[0];
         for (int i = 0; i < arr.length; i++) { //O(n) -> 10
             if (arr[i] > max) {
                 max = arr[i];
                 System.out.println(max);

             }
         }
     }

 }






//        Arrays.sort(arr);
         //        System.out.println(arr[arr.length -1]);

//         findMax(arr);
//


         // brute force
//            private static void findMax3(int[] arr){
//         int max = Integer.MIN_VALUE;
//         // O(n2)
//         for (int i = 0; i < arr.length; i++) { //O(n)
//             for (int j = i + 1; j < arr.length; j++) { //O(n)
//                 if (arr[i] > arr[j] && arr[i] > max) {
//                     max = arr[i];
//                 }
//             }
//         }
//                  System.out.println(max);

//
//                System.out.println(max);

//         private static void findMax( int[] arr){
//             //O(n)
//             int max = arr[0];
//             for (int i = 0; i < arr.length; i++) { //O(n) -> 10
//                 if (arr[i] > max) {
//                     max = arr[i];


// }

//        int max = arr[0];
//        for (int num: arr) {
//            if(num > max){
//                max= num;
//            }
//        }
//               System.out.println(max);
////            }
////
//         private static int findMax ( int[] arr){ // O(nlong)
//             Arrays.sort(arr); // nlogn
//             return arr[arr.length - 1]; //O(1);
//             System.out.println(arr);
//         }


//     }
// }


