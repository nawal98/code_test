package codeTest;

import java.util.*;

/*
 * @author Nawal
 */
public class Q3Shape {

    public static void main(String[] args) {

        char c, c1;
        String answer;
        int n, m;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please select which shape to be displayed:");
            System.out.println("[Option: 'S' = square,'R = rectangle, 'T' = triangle, 'C' = circle, 'D' = diamond]");//user input
            c = input.next().charAt(0); //key in the shape to display
            c1 = Character.toLowerCase(c);

            System.out.println("Please Key in the size of the shape: ");
            n = input.nextInt(); //key in the size of shape to display

            m = n * 2; // width of rectangle = height * 2

            switch (c1) { //Display the shape according to the user's input
                case 'r':
                    print_rectangle(n, m);
                    break;
                case 's':
                    print_square(n);
                    break;
                case 'c':
                    print_circle(n);
                    break;
                case 't':
                    print_triangle(n);
                    break;
                case 'd':
                    print_diamond(n);
                    break;
                default:
                    break;
            }
            System.out.println("Do you want to display another shape? (Yes/No)");
            answer = input.next(); //user decide when to quit the program

        } while (answer.equalsIgnoreCase("yes"));

    }
   // Function to print square 
    static void print_square(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    // Function to print rectangle 
    static void print_rectangle(int n, int m) 
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n
                        || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
    // Function to print triangle 
    static void print_triangle(int n) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (2 * i - 1); j++) {
                if (i == n || j == 1
                        || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
   // Function to print circle 
    static void print_circle(int n) {

        // dist represents distance to the center 
        double dist;

        // for horizontal movement 
        for (int i = 0; i <= 2 * n; i++) {

            // for vertical movement 
            for (int j = 0; j <= 2 * n; j++) {
                dist = Math.sqrt((i - n) * (i - n)
                        + (j - n) * (j - n));

                // dist should be in the range (radius - 0.5) 
                // and (radius + 0.5) to print stars(*) 
                if (dist > n - 0.5 && dist < n + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }

    }
   // Function to print diamond 
    static void print_diamond(int n) {
        int i, j, space = 1;
        space = n - 1;
        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
