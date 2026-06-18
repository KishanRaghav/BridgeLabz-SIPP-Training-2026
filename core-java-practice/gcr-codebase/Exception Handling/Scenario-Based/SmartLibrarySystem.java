import java.util.*;
import java.io.*;

public class SmartLibrarySystem {

    static String[] books = {"Java", "Python", null, "C++"};

    static int getBookLength(int index) {

        try {
            return books[index].length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (NullPointerException e) {
            System.out.println("Book entry is null");
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(getBookLength(2));
        System.out.println(getBookLength(10));
    }
}