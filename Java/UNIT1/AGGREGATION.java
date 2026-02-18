
import java.util.*;
class Books{
    private String name;
    public Books(String name){
        this.name=name;
    }
    public String getBookName(){
        return this.name;
    }
}
class Library{
    private String LibName;
    private List<Books> collectionBook;

    public Library(String LibName){
        this.LibName=LibName;
        this.collectionBook=new ArrayList<>();
    }

    public String getLibName(){
        return this.LibName;
    }

    public void  addBook(Books book){
        collectionBook.add(book);
    }
    public void displayBooks(){
        System.out.println("Books in "+LibName+" library:");
        for(Books book: collectionBook){
            System.out.println("- "+book.getBookName());
        }
    }

}

public class AGGREGATION {
    public static void main(String args[]){
        Books b1 = new Books("Jofery");
        Books b2 = new Books("Harry Potter");
        Library lib = new Library("Central Library");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.displayBooks();

    }
}
