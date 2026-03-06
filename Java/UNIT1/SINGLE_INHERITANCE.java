class Book{
    public String bookName;
    public String authorName;

    public void getBook(){
        System.out.println("Book Name:"+bookName);
        System.out.println("Author Name:"+authorName);

    }
}
class Novel extends Book{
    public String category;
    public void getCategory(){
        System.out.println("Category: "+category);
    }
}

public class SINGLE_INHERITANCE {
    public static void main(String args[]){
        Novel n1 = new Novel();
        n1.bookName="Halt of Grave";
        n1.authorName="Hardy";
        n1.category="Novel";
        n1.getBook();
        n1.getCategory();
    }
}
