package school.siit;

import java.util.Scanner;

public class Book {

    private String bookName;
    private Integer numberOfPages;

    //Constructor
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    //Accesosor
    public String getBookName() {
        return bookName;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    /**    public Book(String bookName, Integer numberOfPages){

        this.bookName = bookName;
        this.numberOfPages = numberOfPages;

    }*\
    /**System.out.println("Introduceti numele cartii");
     Scanner nameOfBook = new Scanner(System.in);
     //String bookName = nameOfBook.nextLine();
     System.out.println("Introduceti numarul de pagini");
     Scanner pagesOfBook = new Scanner(System.in);
     //int bookPages = pagesOfBook.nextInt();
     System.out.println("Introduceti tipul cartii");
     Scanner bookType = new Scanner(System.in);
     //String bookType = typeOfBook.nextLine();
     //System.out.println(bookName + " " + bookPages + " " + bookType);

     String info = "The book name is " + bookName +", it has " + numberOfPages + " pages and it is a " + typeOfBook + ".";
     System.out.println(info);
     */
    /**private String bookName;
     private Integer bookPages;
     private String bookType;


     public void addBook(){

     }

     public void removeBook(){

     }

     public Book (String name, int pages, String type){
     bookName = name;
     bookPages = pages;
     bookType = type;
     }


     public void setName(String name) {
     this.bookName = name;
     }

     public void setPages(String pages) {
     this.bookType = pages;
     }

     public void setBookType(String bookType) {
     this.bookType = bookType;
     }

     @Override
     public String toString() {
     return "Book{" +
     "bookName='" + bookName + '\'' +
     ", bookPages=" + bookPages +
     ", bookType='" + bookType + '\'' +
     '}';

     */
/**
 public static String BookName(String bookName){
 }
 */

}