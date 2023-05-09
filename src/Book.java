public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {   // method
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName() {    // название книги
        return this.name;
    }

    //public Author getAuthor(){
     //   return this.author;
    // }

    public int getYear() {        // год издания
        return this.year;
        }
    public void setYear(int year) {   // год издания
        this.year = year;
    }
}

