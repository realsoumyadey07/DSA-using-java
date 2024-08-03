package advanced_patterns;

public class second {
<<<<<<< HEAD
     public static void main(String[] args) {
          int n = 5;
          for(int i=n;i>=1;i--){
               for(int j=1;j<=i-1;j++){
                    System.out.print(" ");
               }
               for(int j=1;j<=n;j++){
                    System.out.print("*");
               }
               System.out.println();
          }
     }
=======
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
>>>>>>> d589d110dba06e15e22e786dbb03dff8b54b6508
}
