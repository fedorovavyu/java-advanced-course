import java.util.*;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook(){
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String number){

        if(phoneBook.containsKey(surname)){
            ArrayList<String> numbers = phoneBook.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
            }
        }else {
            phoneBook.put(surname, new ArrayList<String>(Arrays.asList(number)));
        }
    }

    public void get(String surname){
        if(phoneBook.containsKey(surname)){
            System.out.printf("Контакт %s: %s", surname, phoneBook.get(surname));
        }else System.out.println("Такой фамилии нет в списке");
    }


    public HashMap<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }
}
