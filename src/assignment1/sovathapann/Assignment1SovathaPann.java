/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.sovathapann;
import java.util.Scanner;
public class Assignment1SovathaPann {


    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//Prompt user to input n lines
System.out.print("How many lines that you want to see of pattern 1 ?: ");
int n = input.nextInt();
System.out.println();
displayPattern(n);

System.out.println();
//Prompt user to input m lines
System.out.print("How many lines that you want to see of pattern 2 ?: ");
int m = input.nextInt();
System.out.println();
displayPattern2(m);   
System.out.println();    
    }
        //Method display Pattern 
public static void displayPattern(int n) {
    for (int i = 1; i <= n; i++) {  
        for (int j = n; j > 0; j--) {
            if (j > i) {
               System.out.printf("    ");
            }
            else {
               System.out.printf("%4d", j);
            }
                }
                System.out.println();
      

}
}
        //Method display Pattern 2
public static void displayPattern2(int n) {
    int M = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = n; j > 0; j--) {
            if (j > i) {
                System.out.printf("    ");
            }
            else {
                System.out.printf("%4d", ++M);
            }
                        
                }
    System.out.println();
    }
        }
    }





    

