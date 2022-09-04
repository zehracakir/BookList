package BookList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Çalıkuşu", 541, "Reşat Nuri Güntekin", 1922));
        bookList.add(new Book("Beyaz Zambaklar Ülkesinde", 248, " Grigoriy Petrov", 1923));
        bookList.add(new Book("Aylak Adam", 192, "Yusuf Atilgan", 1959));
        bookList.add(new Book("Bu Ulke", 339, "Cemil Meric", 1975));
        bookList.add(new Book("Sol Ayağım", 89, "Christy Brown", 1985));
        bookList.add(new Book("Dönüşüm", 160, "Franz Kafka", 1940));
        bookList.add(new Book("Siyah İnci", 150, "Anna Sewell", 2014));
        bookList.add(new Book("Yılkı Atı", 95, "Peyami Safa", 1977));
        bookList.add(new Book("Ateş ve Kan", 800, "George R. R. Martin", 2020));
        bookList.add(new Book("Momo", 119, "Ende", 1980));

        System.out.println("*--------------------------------------*");
        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getBookName(), book.getAuthor()));
        for (String i : bookMap.keySet()) {
            System.out.println("Book Name: " + i + "\nAuthorName: " + bookMap.get(i));
        }
        System.out.println("*--------------------------------------*");
        // filter
        List<Book> listBook = bookList.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        listBook.stream().forEach(b -> System.out.println("Book name : " + b.getBookName() + "  " +
                "Page Number : " + b.getPageNumber() + "  " +
                "Author : " + b.getAuthor() + "  " +
                "ReleaseDate : " + b.getReleaseDate()));

        System.out.println("*--------------------------------------*");

        // to view the total number of books
        long count = bookList.stream().count();
        System.out.println("Number of books: " + count);

    }
}
