//Jacob Gaylord
//jigaylord16@ole.augie.edu
//MulMatrix.java
import java.util.Scanner;
public class MulMatrix
{
  //Desc: 	Multiply 2 square matrices
  //Input:	Keyboard supplies the dimensions of the matrix, followed by the values of the first
  //	matrix, followed by the values of the second matrix.  The values are entered in row-major
  //	(the values of row 1 followed by values of row 2 and so on) and are separated by white
  //	space.
  //Output:The product of the 2 input matrices
  public static void main(String[] args)
  {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter dimension of square matrix: ");
  int n=input.nextInt();
	int[][] m1=new int[n][n];
  System.out.println("Enter values for m1:");
  readMatrix(m1, input);
	int[][] m2=new int[n][n];
  System.out.println("Enter values for m2:");
  readMatrix(m2, input);
  int[][] m3= mulMatrix (m1,m2);
  System.out.println("Product of m1 and m2:");
  printMatrix(m3);
  input.close();
	}
	//Desc: 	Read values to fill a matrix
  //Input:	Scanner input supplies integers separated by white space in row-major to fill matrix m
  //Post:	  matrix m filled with values from input
  public static void readMatrix(int[][] m, Scanner input)
  {
    for(int i=0;i<m.length;++i){
      System.out.printf("\tEnter integers for row %d seperated by white space: ",i);
      for(int j=0;j<m[i].length;++j)
        m[i][j]=input.nextInt();
      }
  }
  //Desc: 	Print a matrix
  //Output: matrix m printed on the screen
  public static void printMatrix(int[][] m)
  {
    for(int i=0;i<m.length;++i)
    {
      for(int j=0;j<m[i].length;++j)
        System.out.printf("%5d",m[i][j]);
      System.out.println();
    }
  }
  //Desc:   Multiply 2 matrices
  //Pre:    m1 and m2 have the same dimensions
  //Return: A matrix that is the product of m1 and m2
  public static int[][] mulMatrix(int[][] m1,int[][] m2)
  {
    int [][] result=new int[m1.length][m1[0].length];
    for(int i=0;i<result.length;++i)
      for(int j=0;j<result.length;++j)
        for(int k=0;k<result.length;++k)
          result[i][j]+=(m1[i][k]*m2[k][j]);
    return result;
  }
}
