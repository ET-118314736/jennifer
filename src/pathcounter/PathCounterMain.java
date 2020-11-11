/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathcounter;

import java.util.Scanner;

/**
 *
 * @author adamoc
 */
public class PathCounterMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        int inputtedNum = scan.nextInt();
        PathCounter pathCounter = new PathCounter();
        System.out.println(pathCounter.countPaths(inputtedNum));
    }
    
}
