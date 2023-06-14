package Homework.Ait.HW19Book.Model;

public class Book {
    private final long isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    public static final int ISBN_LENGTH = 13;
    /*
    Возьмите проект Book из домашнего задания к 15 уроку. Поле isbn сделайте final.
    Добавьте константу public static final int ISBN_LENGTH = 13. В конструкторе,
    при инициализации isbn сделайте проверку аргумента на колличество цифр в числе.
    Оно должно быть равно ISBN_LENGTH. Если не равно, то инициализируйте isbn значением
    -1. Для подсчета колличества цифр в числе, используйте алгоритм реализованный нами
    в предыдущих уроках.
     */

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = checkISBN(isbn) ? isbn : -1;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(long isbn, String title, int yearOfPublishing) {
        this.isbn = checkISBN(isbn) ? isbn : -1;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.author = "no author";
    }

    private boolean checkISBN(long isbn) {
        int k = 0;
        while (isbn > 0) {
            isbn /= 10;
            k++;
        }

        return k == ISBN_LENGTH;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("Book (" +
                "isbn = " + isbn +
                ", title = " + title +
                ", author = " + author +
                ", yearOfPublishing = " + yearOfPublishing +
                ");");
    }
}
