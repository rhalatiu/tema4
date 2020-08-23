package school.siit;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        int i = 0;
        boolean isRunning  = true;

        while (isRunning) {

            System.out.println("Please enter the book name(quit to finish the program):");
            Scanner nameOfBook = new Scanner(System.in);
            String bookName = nameOfBook.nextLine();
            if(bookName.equalsIgnoreCase("quit")){
                break;
            }
            System.out.println("Please enter the number of pages");
            Scanner pagesOfBook = new Scanner(System.in);
            int bookPages = pagesOfBook.nextInt();
            System.out.println("Please enter the book type");
            Scanner typeOfBook = new Scanner(System.in);
            String bookType = typeOfBook.nextLine();
            //System.out.println(bookName + " " + bookPages + " " + bookType);



            books.add(bookName);
            books.add(Integer.toString(bookPages));
            books.add(bookType);

        }
        System.out.println(books);
    }
}
