package com.task3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Book {
    int bookid;
    String booktitle;
    String author_name;
    boolean isavailable;

    public Book(int a, String b, String c, boolean status) {
        this.bookid = a;
        this.booktitle = b;
        this.author_name = c;
        this.isavailable = status;
    }

    public int getbookid() {
        return this.bookid;
    }

    public void setbookid(int a) {
        this.bookid = a;
    }

    public String getbooktitle() {
        return this.booktitle;
    }

    public void setbooktitle(String b) {
        this.booktitle = b;
    }

    public String getauthor_name() {
        return this.author_name;
    }

    public void setauthor_name(String c) {
        this.author_name = c;
    }

    public boolean getisavailable() {
        return this.isavailable;
    }

    public void setisavailable(boolean status) {
        this.isavailable = status;
        }
    }
class Library{
    public Book[] books;
    public int i=0;
    public Library(){
        this.books=new Book[5];
    }
    public void addbook(Book book)
    {
        books[i]=book;
        i++;
    }
    public void removeBook(int bookid)
    {
        for (int i=0,j=0;j<this.books.length;j++)
        {
            if(this.books[j].bookid!=bookid)
            {
                this.books[i++]=this.books[j];
            }
        }
        i=i--;
        this.books= Arrays.copyOf(this.books,i);
    }
    public void searchBook(int bookid)
    {
        for (int i=0;i<this.books.length;i++)
        {
            if(this.books[i].bookid==bookid)
            {
                System.out.println("Book Id:"+this.books[i].bookid+"  Book title:"+this.books[i].booktitle+"  Book Author Name:"+this.books[i].author_name+"  Book Availability Status:"+this.books[i].isavailable);
break;
            }
        }


    }
    public void displayBooks()
    {
        for(int i=0;i< this.books.length;i++)
        {
            System.out.println("Book Id:"+this.books[i].bookid+"  Book title:"+this.books[i].booktitle+"  Book Author Name:"+this.books[i].author_name+"  Book Availability Status:"+this.books[i].isavailable);
        }

    }



}

public class BookManagementSystem
{

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        Book book1=new Book(1,"HARRY POTTER"   ,"J.K ROWLING"           ,true);
        Book book2=new Book(2,"HAMLET"         ,"WILLIAM SHAKESPEARE"   ,true);
        Book book3=new Book(3,"A PROMISED LAND","BARRAK OBAMA"          ,true);
        Book book4=new Book(4,"WINGS OF FIRE"  ,"A.P.J ABDUL KALAM"     ,true);
        Book book5=new Book(5,"RAMAYANA"       ,"VALMIKI"               ,true);

        Library lib=new Library();
        lib.addbook(book1);
        lib.addbook(book2);
        lib.addbook(book3);
        lib.addbook(book4);
        lib.addbook(book5);
        lib.displayBooks();

        System.out.println("Book Id to remove:");
        int remveBookId= Scanner.nextInt();

        lib.removeBook(remveBookId);
        lib.displayBooks();

        System.out.println("Book you are searching for:");
        int bookId= Scanner.nextInt();
        lib.searchBook(bookId);




    }
}
