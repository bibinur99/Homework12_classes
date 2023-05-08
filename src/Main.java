public class Main {
    public static void main(String[] args) {
        Book first = new Book("To kill a Mockingbird", "Harper Lee", 1960);
        Book second  = new Book(  " ""Drei Kammeraden"", "Erich Maria Remark", 1936);
        System.out.println("first book is " + first.getName() + ", "
                + first.getAuthor()+ ", " + first.getYear());
        System.out.println("second book is " + second.getName() + ", " + second.getAuthor()+
                ", "+ second.getYear());

        Author lee = new Author("Harper", "Lee");
        System.out.println("lee.authorName = " + lee.getAuthorName() + " " +
                lee.getAuthorSurname());
        Author remark = new Author("Erich Maria", "Remark");
        System.out.println("remark.authorName = " + " " + remark.getAuthorName()+
                " " + remark.getAuthorSurname());
        first.setYear(1961);
        System.out.println("first book's change: " + first.getYear());

    }
}