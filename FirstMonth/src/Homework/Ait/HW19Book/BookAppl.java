package Homework.Ait.HW19Book;

import Homework.Ait.HW19Book.Model.Book;

public class BookAppl {
    public static void main(String[] args) {
        view();
    }

    private static void view(){
        Book book1 = new Book(111111, "12 стульев", "Ильф и Петров", 2020);
        book1.display();

        Book book2 = new Book(222_222_222_222_2l, "От первого лица", 2022);
        book2.display();
    }
}
