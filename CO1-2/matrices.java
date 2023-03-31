import java.util.Scanner;
public class matrices{  
public static void main(String args[]){  
   
 int m, n, i, j;
        Scanner in = null;
            in = new Scanner(System.in);
            System.out.println("Enter the number "+ "of rows of the matrix");
            m = in.nextInt();
            System.out.println("Enter the number "+ "of columns of the matrix");
            n = in.nextInt();
   
            int first[][] = new int[m][n];
  

            System.out.println("Enter the elements of the matrix");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();
 
            System.out.println("Elements of the matrix are");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
in.close();   
}   
 
System.out.println();   
}    
} 