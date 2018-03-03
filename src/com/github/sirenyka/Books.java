package com.github.sirenyka;

public class Books {
    String title;
    String author;
}
class BookTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int y = 0;
        int x = 0;
        while (y < 3) {
            myBooks[y] = new Books();
            y += 1;
        }
        myBooks[0].title = "плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Jan";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}