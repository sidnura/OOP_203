public class Reader {
    String fullName;
    int ticketNumber;
    String faculty;
    String birthday;
    String phone;

    Reader(String fullName, int ticketNumber, String faculty, String birthday, String phone)
    {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }
    void takeBook(int numberBooks)
    {
        System.out.println(fullName + " взял " + numberBooks + " книги");
    }
    void takeBook(String... bookNames)
    {
        System.out.print(fullName + " взял книги:");
        for (String bookName : bookNames) {
            System.out.print(" " + bookName + ","); }
        System.out.println();
    }
    void takeBook(Book... books)
    {
        System.out.print(fullName + " взял книги:");
        for (Book book : books) {
            System.out.print(" " + book.name + ","); }
        System.out.println();
    }
    void returnBook(String... bookNames)
    {
        System.out.print(fullName + " вернул книги:");
        for (String bookName : bookNames) {
            System.out.print(" " + bookName + ","); }
        System.out.println();
    }
    void returnBook(int numberOfBooks)
    {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }
}

class Book {
    String name;
    String author;
    Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }
}
