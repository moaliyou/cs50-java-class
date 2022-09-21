package classes;

public class Book {
    
    String bookName;
    double bookPrice;
    Author bookAuthor;
    
    public Book (String bookName, double bookPrice, Author bookAuthor){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
    }
    
    private String getBookName(){
        return this.bookName;
    }
    
    private double getBookPrice(){
        return this.bookPrice;
    }
    
    public void printBookDetails() {
        
        System.out.println("Book Name: " + getBookName());
        System.out.println("Book price: $" + getBookPrice());
        System.out.println("Book autor: " + bookAuthor.getAuthorName());
        System.out.println("Author E-mail: " + bookAuthor.getAuthorEmail());
        System.out.println("Gender: " + bookAuthor.getAuthorGender());
        
    }
    
}