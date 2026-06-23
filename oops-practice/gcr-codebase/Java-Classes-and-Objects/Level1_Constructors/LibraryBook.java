public class LibraryBook{
String title,author; double price; boolean availability=true;
LibraryBook(String t,String a,double p){title=t;author=a;price=p;}
void borrowBook(){if(availability) availability=false;}
}