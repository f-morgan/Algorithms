import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int[] books = {14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println("Количество книг, где страниц больше 32: " + algo(books,32));
        System.out.println("Количество книг, где страниц больше 60: " + algo(books,60));

    }

    public static int algo(int[] books, int newBook) {
        int leftPosition = 0;
        int rightPosition = books.length - 1;
        while (leftPosition < rightPosition) {
            int middle = leftPosition + (rightPosition - leftPosition) / 2;
            int middleBook = books[middle];
            if (newBook >= middleBook) {
                leftPosition = middle + 1;
            } else if (newBook < middleBook) {
                rightPosition = middle - 1;
            }
        }
        return books.length - Math.min(leftPosition, rightPosition) - 1;

    }
}
