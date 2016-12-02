/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collatz;

import java.util.Scanner;

public class Collatz {


    public static void main(String[] args) {
        System.out.println("Please give an integer");
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int number = sc.nextInt();
        
        while (number > 1) {
            System.out.println(number);
            counter ++;
        if ((number & 1) == 0) { 
                number = number / 2; 
                
            }
         else {
            number = (number * 3) + 1;
           
        } 
                    }
        System.out.println("It Took " + counter + " times to complete.");
        }
    }
