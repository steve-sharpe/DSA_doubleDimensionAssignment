// Double dimension array implementation in Java
// Author: Steve Sharpe

import java.util.Scanner; // Importing Scanner class to take input from the user

public class DoubleDimension {
    int arr[][] = null; // Declaring a 2D array

    public DoubleDimension(int row, int column) { // Constructor to initialize the array
        arr = new int[row][column]; // Initializing the array with the given row and column
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Looping through the array
                arr[i][j] = Integer.MIN_VALUE; // Initializing the array with minimum value
            }
        }
    }

    // Insert method
    public void insert(int valueToInsert, int rowIndex, int columnIndex) { // Method to insert the value in the array
        try {
            if (arr[rowIndex][columnIndex] == Integer.MIN_VALUE) { // Checking if the cell is empty
                arr[rowIndex][columnIndex] = valueToInsert; // Inserting the value in the array
                System.out.println("Successfully inserted"); // Printing the message
            } else {
                System.out.println("This Cell is already occupied"); // Printing the message
            }

        } catch (ArrayIndexOutOfBoundsException e) { // Catching the exception
            System.out.println("Invalid index to access array"); // Printing the message
        }
    }

    // Traverse an array
    public void traverse() { // Method to traverse the array
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) { // Looping through the array
                    System.out.print(arr[i][j] + " "); // Printing the value in the array
                }
                System.out.println(); // Printing the new line
            }
        } catch (Exception e) { // Catching the exception
            System.out.println("Array no longer exist"); // Printing the message
        }
    }

    // Search for an element
    public void searchArray(int valueToSearch) { // Method to search the value in the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Looping through the array
                if (arr[i][j] == valueToSearch) { // Checking if the value is found
                    System.out.println("Value is found at the index of " + i + " " + j); // Printing the message
                    return;
                }
            }
        }
        System.out.println(valueToSearch + " is not found"); // Printing the message
    }

    // Delete value from the array
    public void deleteValueAtIndex(int rowIndex, int columnIndex) { // Method to delete the value from the array
        try {
            arr[rowIndex][columnIndex] = Integer.MIN_VALUE; // Deleting the value from the array
            System.out.println("The value has been deleted successfully"); // Printing the message
        } catch (ArrayIndexOutOfBoundsException e) { // Catching the exception
            System.out.println("The value that is provided is not in the range of array"); // Printing the message
        }
    }

    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in); // Creating an object of Scanner class
        System.out.print("Enter the number of rows: "); // Printing the message for rows
        int row = scanner.nextInt(); // Assuming you have a Scanner object named scanner

        System.out.print("Enter the number of columns: "); // Printing the message for columns
        int column = scanner.nextInt(); // Assuming you have a Scanner object named scanner

        DoubleDimension doubleDimension = new DoubleDimension(row, column); // Creating an object of DoubleDimension
                                                                            // class
        System.out.print("Enter the number of elements to be inserted: "); // Printing the message

        int elements = scanner.nextInt(); // Taking the input from the user
        for (int i = 0; i < elements; i++) { // Looping through the elements

            System.out.print("Enter the value to be inserted: "); // Printing the message
            int value = scanner.nextInt(); // Taking the input from the user

            System.out.print("Enter the row index: "); // Printing the message for row index
            int rowIndex = scanner.nextInt(); // Taking the input from the user

            System.out.print("Enter the column index: "); // Printing the message for column index
            int columnIndex = scanner.nextInt(); // Taking the input from the user

            doubleDimension.insert(value, rowIndex, columnIndex); // Inserting the value in the array
        }
        System.out.print("The elements in the array are: "); // Printing the message

        doubleDimension.traverse(); // Traversing the array
        System.out.print("Enter the element to be searched: "); // Printing the message

        int searchElement = scanner.nextInt(); // Taking the input from the user
        doubleDimension.searchArray(searchElement); // Searching the element in the array

        System.out.print("Enter the row index to delete the element: "); // Printing the message for row index
        int rowIndex = scanner.nextInt(); // Taking the input from the user

        System.out.print("Enter the column index to delete the element: "); // Printing the message for column index
        int columnIndex = scanner.nextInt(); // Taking the input from the user

        doubleDimension.deleteValueAtIndex(rowIndex, columnIndex); // Deleting the value from the array
        System.out.print("The elements in the array are: "); // Printing the message

        doubleDimension.traverse(); // Traversing the array
        scanner.close(); // Closing the scanner
    }
}
