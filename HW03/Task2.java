import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        String[] surname = {"Borisov", "Kuplinov", "Tesla"};
        String[] phoneNumber = {"89167458293", "898564789523","89036687411","89254785211","89045686633"};

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(surname[0], phoneNumber[0]);
        phoneBook.add(surname[0], phoneNumber[1]);
        phoneBook.add(surname[1], phoneNumber[2]);
        phoneBook.add(surname[2], phoneNumber[3]);
        phoneBook.add(surname[2], phoneNumber[4]);

        System.out.println(phoneBook.getPhoneBook());

        phoneBook.get("Tesla");

    }
}
