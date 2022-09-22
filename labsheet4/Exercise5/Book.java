package labsheet4.Exercise5;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }


    public Book(String title, double price, String ISBN, int pages){
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
        if (pages >0 && pages <4000)
        this.pages = pages;
    }

    public void setTitle(String title) {
        if(title.equals("") || title == null)
            this.title = "No valid title supplied";
        else
            this.title = title;
    }

    public void setISBN(String ISBN) {
        if(ISBN.equals("") || ISBN == null)
            this.ISBN = "No valid ISBN supplied";
        else
            this.ISBN = ISBN;

    }

    public void setPrice(double price) {
        if (price>0 && price <50000)
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
