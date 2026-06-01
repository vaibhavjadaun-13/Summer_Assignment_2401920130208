package week1;
import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicates {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();
        int [] arr= new int [n];
        System.out.println("enter array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        HashSet<Integer> set=new HashSet<>();
       System.out.println("Array after removing duplicates:");
       for (int i = 0; i < n; i++) {
           if (!set.contains(arr[i])) {
               set.add(arr[i]);
               System.out.print(arr[i] + " ");
           }
       }
   }
}
