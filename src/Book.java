public class Book {
    //attributes
    String title;
    int yearOfPublishing;
    long isbnNumber;
    String authorName;

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Title = " + book.title);
        System.out.println("authorName = " + book.authorName);
        System.out.println("isbnNumber = " + book.isbnNumber);
        System.out.println("yearOfPublishing = " + book.yearOfPublishing);

        book.title = "Complete reference 12th edition";
        book.authorName = "Herbert Schildth";
        book.yearOfPublishing = 2021;
        book.isbnNumber = 1234567890123L;

        System.out.println("book.authorName = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.isbnNumber = " + book.isbnNumber);
        System.out.println("book.yearOfPublishing = " + book.yearOfPublishing);
    }
}
