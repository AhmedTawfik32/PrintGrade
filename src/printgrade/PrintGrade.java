/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printgrade;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class PrintGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please, enter your degree: ");
        
        double degree = input.nextDouble();
        
        if(degree>=85 & degree <= 100){
            System.out.println("Excellent");
        }else if(degree>=75 && degree <85){
            System.out.println("Very Good");
        }else if(degree>=65 && degree<75){
            System.out.println("Good");
        }else if(degree>=50 && degree<65){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }
            
        
    }
    
}
