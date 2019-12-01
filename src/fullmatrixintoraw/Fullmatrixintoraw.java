/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullmatrixintoraw;

import java.util.Scanner;
public class Fullmatrixintoraw {

   
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
       System.out.println("Enter the number of rows : ");
       int nrows = scn.nextInt();
       System.out.println("Enter the number of columns : ");
       int ncolums = scn.nextInt();
       int matrix[][]= new int[nrows][ncolums];
       System.out.println("Enter the elements : ");
       
       //Read elements for storing
      for(int i =0; i<nrows; i++)
       {
           for(int j =0;  j < ncolums; j++)
           {
               matrix[i][j] = scn.nextInt();
           }
       }
      //Display elements of the matrix
      System.out.println("Display the Full Matrix :");
      for(int i = 0;i < nrows; i++)
      {
          for(int j=0; j< ncolums; j++)
          {
              System.out.print(matrix[i][j] + "\t");
          }
          System.out.println();
      }
     
      //represent full matrix into raw vector
      
      System.out.println("Represent full matrix into raw vector :");
      System.out.print(" [ ");
      // Loop through all rows 
        for (int i = 0; i <matrix.length; i++) 
  
      // Loop through all elements of current row 
            for (int j = 0; j < matrix[i].length; j++) 
                System.out.print(matrix[i][j] + " "); 
        System.out.print(" ] ");
    }
    }
    

