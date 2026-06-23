public class Person{
String name; int age;
Person(String name,int age){this.name=name;this.age=age;}
Person(Person p){this.name=p.name;this.age=p.age;}
}