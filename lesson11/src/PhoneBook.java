import maps.AssociativeArray;

public class PhoneBook {
    AssociativeArray book;

    public PhoneBook() {
        book = new AssociativeArray();
    }

    public void addPhone(String lastName, String number) {
        if (book.containsKey(lastName) == null) {
            System.out.println("New entry: " + lastName + " - " + number);
        } else {
            System.out.println("Replace number");
        }
        book.add(lastName, number);
    }

    public void getPhone(String lastName) {
        if (book.containsKey(lastName) == null) {
            System.out.println("Entry not found");
        } else {
            System.out.println(lastName + " - " + book.containsKey(lastName));
        }
    }

    public void removePhone(String lastName) {
        if (book.containsKey(lastName) == null) {
            System.out.println("Entry not found");
        } else {
            System.out.println("Entry deleted: " + lastName + " - " + book.remove(lastName));
        }
    }
}


