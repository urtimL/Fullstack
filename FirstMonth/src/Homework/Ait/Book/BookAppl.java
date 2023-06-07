package Homework.Ait.Book;

import Homework.Ait.Book.Model.Book;

public class BookAppl {
    public static void main(String[] args) {
        view();
    }

    private static void view(){
        Book book1 = new Book(111111, "12 стульев", "Ильф и Петров", 2020);
        book1.display();

        Book book2 = new Book(222222, "От первого лица", 2022);
        book2.display();
    }
}
