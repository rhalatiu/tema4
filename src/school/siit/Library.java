package school.siit;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        String bookName, bookType, paperQuality;
        int bookPages;
        int index = 100;

        while (true) {

            System.out.println("Please enter the book name(quit to finish the program):");
            Scanner nameOfBook = new Scanner(System.in);
            bookName = nameOfBook.nextLine();

            if (bookName.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Please enter the number of pages");
            Scanner pagesOfBook = new Scanner(System.in);
            bookPages = pagesOfBook.nextInt();

            System.out.println("Please enter the book type");
            Scanner typeOfBook = new Scanner(System.in);
            bookType = typeOfBook.nextLine();

            System.out.println("Please enter the paper quality");
            Scanner qualityOfPaper = new Scanner(System.in);
            paperQuality = qualityOfPaper.nextLine();
            //System.out.println(bookName + " " + bookPages + " " + bookType);

            Book newBook = new Book(bookName, bookPages);
            books.add(newBook);
            //System.out.println(books);
        }
            for(Book t: books) {
                System.out.println("Name: " + t.getBookName() + "\nPages: " + t.getNumberOfPages());
                System.out.println();
            }
            String bookToRemove = null;
            System.out.println("Please enter the book to be removed");
            Scanner removeBook = new Scanner(System.in);
            bookToRemove = removeBook.nextLine();

            for (Book bookNameList:books){
                if (bookNameList.getBookName().equals(bookToRemove)){
                    index = books.indexOf(bookNameList);
                    break;
                }
            }
            books.remove(index);
        for(Book t: books) {
            System.out.println("Name: " + t.getBookName() + "\nPages: " + t.getNumberOfPages());
            System.out.println();
        }
    }
}