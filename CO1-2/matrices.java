import java.util.Scanner;
public class matrices{  
public static void main(String args[]){  
   
int m,n,i,j,k,l;
int first[][] = new int[m][n];
int first1[][] = new int[k][l];
  
        Scanner in = null;
            in = new Scanner(System.in);
            System.out.println("Enter the number "+ "of rows of the first matrix");
            m = in.nextInt();
            System.out.println("Enter the number "+ "of columns of the first matrix");
            n = in.nextInt();

            System.out.println("Enter the elements of the first matrix");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();


            System.out.println("Enter the number "+ "of rows of the second matrix");
            k = in.nextInt();
            System.out.println("Enter the number "+ "of columns of the second matrix");
            l = in.nextInt();

            System.out.println("Enter the elements of the matrix");
            for (i = 0; i < k; i++)
                for (j = 0; j < l; j++)
                    first1[i][j] = in.nextInt();



            System.out.println("Elements of the first matrix are");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
	                in = new Scanner(System.in);}

            System.out.println("Elements of the second matrix are");
            for (i = 0; i < k; i++) {
                for (j = 0; j < l; j++)
                    System.out.print(first1[i][j] + "  ");
                System.out.println();
	                in = new Scanner(System.in);}
in.close();   
}     
}    