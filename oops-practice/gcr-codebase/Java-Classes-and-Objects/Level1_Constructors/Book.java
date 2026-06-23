public class Book{
String title,author; double price;
Book(){title="Unknown";author="Unknown";price=0;}
Book(String title,String author,double price){this.title=title;this.author=author;this.price=price;}
public static void main(String[] args){Book b=new Book("Java","James",500);System.out.println(b.title);}
}