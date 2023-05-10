public class Main {
    public static void main(String[] args) {
        System.out.println("HOMEWORK:");
        Author lee = new Author("Harper", "Lee");
        String harper = lee.getAuthorName() + " "+ lee.getAuthorSurname();
        System.out.println("lee.authorName = " + harper);

        Author remark = new Author("Erich Maria", "Remark");
        String erich = remark.getAuthorName()+ " " + remark.getAuthorSurname();
        System.out.println("remark.authorName = " + erich );
        System.out.println();

        Book first = new Book("To kill a Mockingbird", lee, 1960);
        Book second  = new Book(  "Drei Kammeraden", remark, 1936);
        System.out.println("First book is " + first.getName() + ", "
                + harper+ ", " + first.getYear());
        System.out.println();
        System.out.println("Second book is " + second.getName() + ", " + erich +
                ", "+ second.getYear());
        System.out.println();

        first.setYear(1961);
        System.out.println("First book's change: " + first.getYear());

    }
}