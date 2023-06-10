// public class Arrayy {
//     static boolean[] arrbool = new boolean[2];

//     public static void main(String[] args) {
//         int[] NN = {10,20};
//         for(Integer i:NN){
//             System.out.println(i);
//         }
//         int a[], b;
//         int []c, d;
//         int [ ] array = { 2, 4, 6, 8, 1, 3, 5, 7};
//         // System.out.println(array[-1]);
//         int george = 0;
//         for (int i = 0; i < array.length; i++)
//               george += array[i];
//         System.out.print(george);
//         int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
//         //Array fr will store frequencies of element  
//         int [] fr = new int [arr.length];  
//         int visited = -1;  
//         for(int i = 0; i < arr.length; i++){  
//             int count = 1;  
//             for(int j = i+1; j < arr.length; j++){  
//                 if(arr[i] == arr[j]){  
//                     count++;  
//                     //To avoid counting same element again  
//                     fr[j] = visited;  
//                 }  
//             }  
//             if(fr[i] != visited)  
//                 fr[i] = count;  
//         }  
  
//         //Displays the frequency of each element present in array  
//         System.out.println("---------------------------------------");  
//         System.out.println(" Element | Frequency");  
//         System.out.println("---------------------------------------");  
//         for(int i = 0; i < fr.length; i++){  
//             if(fr[i] != visited)  
//                 System.out.println("    " + arr[i] + "    |    " + fr[i]);  
//         }  
//         System.out.println("----------------------------------------");  
    
//         int[] arr1;
//         String[] arr2;
//         int arr3[];
//         int[] arrayRefVar[];

//         boolean[] arrbool = new boolean[2];

        
//         for (int i = 0; i < arrbool.length; i++) {
//             System.out.println(arrbool[i]);
//         }
//         min(new int[] { 33, 3, 4, 1 });
//         int arr111[] = { 33, 3, 4, 5 };
//         System.out.println("Printing original array:");
//         for (int i : arr)
//             System.out.println(i);

//         System.out.println("Printing clone of the array:");
//         int carr[] = arr111.clone();
//         for (int i : carr)
//             System.out.println(i);

//         System.out.println("Are both equal?");
//         System.out.println(arr == carr);
//         arr[0] = 1000000;
//         System.out.println("-----------------");
//         for (int i : carr)
//             System.out.println(i);

//     }

    

//     static void min(int arr[]) {
//         int min = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (min > arr[i]) {
//                 min = arr[i];

//                 System.out.println(min);
//             }
//         }
//     }
// }

