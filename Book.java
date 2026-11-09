public class Book {
    public String title;
    public String author;
    public int pages;
    public int year;

    public String GetInfo(){
        return "Title: " + title + ", Author: " + author + " Pages: " + pages + " Year: " + year;
    }
}
