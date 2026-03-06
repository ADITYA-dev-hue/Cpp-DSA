class Book{
    public String bookName;
    public String authorName;

    public void getBook(){
        System.out.println("Book Name:"+bookName);
        System.out.println("Author Name:"+authorName);

    }
}
class AcadmicBook extends Book{
    public String category;
    public void getCategory(){
        System.out.println("Category: "+category);
    }
}

class CS_Book extends AcadmicBook{
    public String Subject;
    public String Eddition;
    public int price;
    public void getKnow(){
        System.out.println("Subject: "+Subject+"\nEddition: "+Eddition+"\nPrice: "+price);
    }
}

public class Multilevel_INHERITANCE {
    public static void main(String args[]){
        CS_Book c1=new CS_Book();
        c1.bookName="Halt of Grave";
        c1.authorName="Hardy";
        c1.category="Reference Book";
        c1.Subject="Java";
        c1.price=1200;
        c1.Eddition="Jan-2023";
        c1.getBook();
        c1.getKnow();
        c1.getCategory();

    }
}
