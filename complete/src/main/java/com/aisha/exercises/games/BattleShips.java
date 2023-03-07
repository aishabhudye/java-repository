package com.aisha.exercises.games;

import java.util.Arrays;
import java.util.Scanner;

public class BattleShips {
    public static void main(String[] args) {
        BattleShips battleShips = new BattleShips();
        battleShips.E();
    }

    public void setShips() {
        String[][] grid = {
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", "X"},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", "X"},
                {" ", " ", "X", "X", "X", " ", " ", " ", " ", " "},
                {"X", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {"X", " ", " ", " ", " ", "X", " ", "X", " ", " "},
                {"X", " ", " ", " ", " ", "X", " ", "X", " ", " "},
                {"X", " ", " ", " ", " ", "X", " ", "X", " ", " "},
                {"X", " ", " ", " ", " ", "X", " ", "X", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " "}
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print("|" + grid[i][j]);
            }
            System.out.println("|");
        }
    }

    public void User() {
        int X;
        int Y;
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[10][10];
// Read the matrix values
        System.out.println("Enter the X: ");
        X  = sc.nextInt();
        System.out.println("Enter the Y: ");
        Y = sc.nextInt();
//loop for X
        for (i = 0; i < array.length; i++) {
//inner for loop for Y
            for (j = 0; j < array.length; j++) {

            }
        }
//accessing array elements
        System.out.println("Elements of the array are: ");
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++)
//prints the array elements
                System.out.print(array[i][j] + " ");
//throws the cursor to the next line
            System.out.println();
        }
    }

    // Function to insert x in arr at position pos
    public static int[] insertX(int n, int arr[],
                                int x, int pos)
    {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    // Driver code
    public void main1()
    {

        int n = 10;
        int i;

        // initial array of size 10
        int arr[]
                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // print the original array
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));

        // element to be inserted
        int x = 50;

        // position at which element
        // is to be inserted
        int pos = 5;

        // call the method to insert x
        // in arr at position pos
        arr = insertX(n, arr, x, pos);

        // print the updated array
        System.out.println("\nArray with " + x
                + " inserted at position "
                + pos + ":\n"
                + Arrays.toString(arr));
    }

    public void E(){
        int[][] arr = {
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14}
        };

        for (int i=0; i < arr.length; i++) {
            int[] row = arr[i];
            for (int j=0; j < row.length; j++) {
                System.out.println(i + "," + j + ": " + arr[i][j]);
            }
        }

    }

}



