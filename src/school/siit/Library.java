package school.siit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<Book>();
        boolean isRunning  = true;

        while (isRunning) {

            System.out.println("Please enter the book name(quit to finish the program):");
            Scanner nameOfBook = new Scanner(System.in);
            String bookName = nameOfBook.nextLine();
            if (bookName.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Please enter the number of pages");
            Scanner pagesOfBook = new Scanner(System.in);
            int bookPages = pagesOfBook.nextInt();
            System.out.println("Please enter the book type");
            Scanner typeOfBook = new Scanner(System.in);
            String bookType = typeOfBook.nextLine();
            System.out.println("Please enter the paper quality");
            Scanner qualityOfPaper = new Scanner(System.in);
            String paperQuality = qualityOfPaper.nextLine();
            //System.out.println(bookName + " " + bookPages + " " + bookType);
            Book b = new Book(bookName, bookPages);
            bk.add(b);

        }
            System.out.println(bk);
    }
}
