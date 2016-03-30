/*
    * Author:       Taras Karpin 
    * Sted:         DTU-Compute
    * Start Date:   30/30-2016
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Point;


public class RicochetRobots {

    public static void main(String[] args){
        java.util.Scanner keyBoard= new java.util.Scanner(System.in, "windows-1252");
        String userString;
        
        while(true){
            System.out.println("Write a name of the border you want to solve");
            userString = keyBoard.nextLine();
            Board myBord = new Board(userString);  
        }
               
    }
    
    
}
