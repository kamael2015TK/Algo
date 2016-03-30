/*
    * Author:       Taras Karpin 
    * Sted:         DTU-Compute
    * Start Date:   30/30-2016
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Point;
import java.io.File;

public class Board {

    private char[][] board;
    private int robotAmount;
    private int size;

    private static final char GOAL_CHAR = 'G';
    private static final char WALL_CHAR = '#';
    private static final char EMPTY_CHAR = ' ';

    public Board(String s) {
        try {
            java.util.Scanner in = new java.util.Scanner(new File(s));

            try {
                size = Integer.parseInt(in.nextLine());
                robotAmount = Integer.parseInt(in.nextLine());

            } catch (Exception ex) {
                System.out.println("Document error" + ex.getMessage());
            }
            board = new char[size][size];
            // test 021

        } catch (Exception e) {
            System.out.println("File Does not Exist" + e.getMessage());
        }
    }
}
