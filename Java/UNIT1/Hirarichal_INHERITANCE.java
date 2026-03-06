class Book1{
    public String bookName;
    public String authorName;

    public void getBook(){
        System.out.println("Book Name:"+bookName);
        System.out.println("Author Name:"+authorName);

    }
}
class Comic extends Book1{
    public String category;
    public void getCategory(){
        System.out.println("Category: "+category);
    }
}

class Magzine extends Book1{
    public String Subject;
    public String Eddition;
    public int price;
    public void getKnow(){
        System.out.println("Subject: "+Subject+"\nEddition: "+Eddition+"\nPrice: "+price);
    }
}

class Hirarichal_INHERITANCE {
    public static void main(String args[]){
        Magzine c1=new Magzine();
        c1.bookName="Halt of Grave";
        c1.authorName="Hardy";
        c1.Subject="Java";
        c1.price=1200;
        c1.Eddition="Jan-2023";
        c1.getBook();
        c1.getKnow();

        Comic co=new Comic();
        co.category="Comic";
        co.bookName="Commander Dhrov";
        co.authorName="Raj Kumar";
        co.getBook();
        co.getCategory();

    }
}
