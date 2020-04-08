package codeTest;

/*
 * @author Nawal
 */
public class Q1ArrayInteger {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrays = {6, 5, 2, 5, 3, 9, 5, 4}; //array of integers
        System.out.print("The array is :");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + ", "); //display all the integers
        }
        System.out.print("\n");
        System.out.println("Display integer if even\nDisplay odd if odd");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 9) { //if 9
                System.out.print(arrays[i] + " "); //display 9
                break; // stop the loop
            } else if (arrays[i] % 2 != 0) { // if odd
                System.out.print("odd, "); // display "odd"
            } else { //if even
                System.out.print(arrays[i] + ", "); //display integer
            }
        }
    }
}
