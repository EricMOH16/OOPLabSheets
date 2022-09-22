package labsheet4.exercise3;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }


    public Book(String title,double price,String ISBN,int pages){
        setTitle(title);
        setISBN(ISBN);
        setPrice(price);
        setPages(pages);
    }
     public String getTitle(){
        return title;
     }

    public double getPrice() {
        return price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public String toString(){
        return "Title: " + getTitle() + " Price: " + getPrice() + " ISBN: " + getISBN() +
                " Pages: " + getPages() ;

    }
}
