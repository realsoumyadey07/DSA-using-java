package array;
import java.util.*;

public class first {
     //array is a non-premetive data type
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          // int[] marks = new int[3];
          // marks[0] = 23;
          // marks[1]= 45;
          // marks[2]= 50;
          // System.out.println(marks);
          // for(int i=0; i<marks.length; i++){
          //      System.out.println(marks[i]);
          // }

          // int marks2[] = {90, 99, 89};
          // for(int i=0;i<marks2.length;i++){
          //      System.out.println(marks2[i]);
          // }
          int n = sc.nextInt();
          int marks[] = new int[n];
          for(int i=0;i<marks.length;i++){
               marks[i] = sc.nextInt();
          }
          System.out.println("Enter the number that you want to find:");
          int fn = sc.nextInt();
          for(int i=0;i<marks.length;i++){
               if(marks[i]==fn){
                    System.out.println("Number has been found at: "+ (i+1) +" index");
               }
          }
     }
}
