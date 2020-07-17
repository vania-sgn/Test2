package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*int[] name = new int[5];
        name[4]=23;
        System.out.println(name[4]);
*/
       /* int[] name = new int[]{23, 34, 65};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);// выводим весь массив
        }*/
   int [] a;
   int n;
        Scanner in= new Scanner( System.in);
        System.out.println("Enter number of array:");
        n=in.nextInt();
        a= new int[n];
        for (int i=0;i<n;i++){
            System.out.println(" Enter a["+i+"]=");
            a[i]=in.nextInt(); }
        for(int j=0;j<a.length;j++) {
            System.out.println(" -------------injected array:");
            System.out.println(a[j]);
        }
    }
}
