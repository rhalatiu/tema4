package school.siit;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

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

            Book newBook = new Book(bookName, bookPages);
            books.add(newBook);
            System.out.println(books);
        }
            //for(Book t: books){
            //System.out.println("Name: " + t.getBookName() + "\nPages: " + t.getNumberOfPages());
            //System.out.println();
            //}
    }
}
