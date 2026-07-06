import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class AddressBookApp {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number. Contact not added.");
            return;
        }

        Contact contact = new Contact(name, phone, email);
        contacts.add(contact);
        contactMap.put(name, contact);
        phoneSet.add(phone);

        System.out.println("Contact added successfully.");
    }

    static void searchContact(String name) {
        Contact contact = contactMap.get(name);

        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    static void deleteContact(String name) {
        Contact contact = contactMap.remove(name);

        if (contact != null) {
            contacts.remove(contact);
            phoneSet.remove(contact.phone);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    static void displayContacts() {
        Collections.sort(contacts, (c1, c2) -> c1.name.compareToIgnoreCase(c2.name));

        System.out.println("\nContacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {

        addContact("Kishan", "9876543210", "kishan@gmail.com");
        addContact("Rahul", "9876501234", "rahul@gmail.com");
        addContact("Amit", "9876543211", "amit@gmail.com");
        addContact("Rohit", "9876543210", "rohit@gmail.com");

        System.out.println();

        searchContact("Rahul");

        System.out.println();

        deleteContact("Amit");

        displayContacts();
    }
}