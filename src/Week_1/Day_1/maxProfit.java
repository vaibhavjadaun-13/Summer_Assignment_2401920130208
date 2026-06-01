import java.util.Scanner;
public class maxProfit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array prices");
        int n = sc.nextInt();
        int [] prices= new int [n];
        System.out.println("enter array");
        for (int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int max=0;
        int i=1,minval=prices[0];
        while(i<prices.length){
            max=Math.max(max,prices[i]-minval);
            i++;
            minval=Math.min(minval,prices[i-1]);
        }
        System.out.println(max);
    }
}