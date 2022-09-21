package classes;

public class Author {
    
    String authorName;
    String authorEmail;
    char authorGender;
    
    public Author (String authorName, String authorEmail, char authorGender){
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.authorGender = authorGender;
    }
    
    
    protected String getAuthorName(){
        return this.authorName;
    }
    
    protected String getAuthorEmail(){
        return this.authorEmail;
    }
    
    protected char getAuthorGender(){
        return this.authorGender;
    }
    
    
}