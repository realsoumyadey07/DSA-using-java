package advanced_patterns;

public class third {
<<<<<<< HEAD
     public static void main(String[] args) {
          
     }
=======
    public static void main(String[] args) {
        int n= 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
>>>>>>> d589d110dba06e15e22e786dbb03dff8b54b6508
}
