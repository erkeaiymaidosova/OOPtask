public class Book {
    private String title;
    private String author;
    private int isbn;
    private double price;

    public Book(String bTitle,String bAuthor,int bIsbn,double bPrice){
        this.title=bTitle;
        this.author=bAuthor;
        this.isbn=bIsbn;
        this.price=bPrice;
    }
    public Book(){
        this.title="";
        this.author="";
        this.isbn=0;
        this.price=0;
    }
    public String getTitle(String title){
        return title;
    }
    public String getAuthor(String author){
        return author;
    }
    public int getIsbn(int isbn){
        return isbn;
    }
    public Double getPrice(double price){
        return price;
    }

    /*public String toString()
    {
        return "Book title: " + title + "  Author of book: " + author + "  ISBN: " + isbn + "  Price: " + price;
    }

    */
    public void displayInfo(){
        System.out.println( "Book title: " + title);
        System.out.println( "Author of book: " + author);
        System.out.println( "ISBN: " + isbn );
        System.out.println( "Price: " + price);
    }
}
