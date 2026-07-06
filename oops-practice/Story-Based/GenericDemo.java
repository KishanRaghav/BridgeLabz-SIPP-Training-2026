import java.util.*;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("Pair: " + first + ", " + second);
    }
}

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public void display() {
        System.out.println(list);
    }
}

class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}

public class GenericDemo {

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Kishan", 101);
        pair.display();

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());

        stack.display();

        Integer[] numbers = {12, 45, 67, 23, 89};
        System.out.println("Maximum: " + findMax(numbers));

        Repository<String> repository = new Repository<>();
        repository.add("Java");
        repository.add("Python");
        repository.add("C++");

        System.out.println("Repository Data:");
        repository.display();

        List<String> list = Arrays.asList("One", "Two", "Three");

        System.out.println("Wildcard List:");
        printList(list);
    }
}