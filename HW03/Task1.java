import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> wordArray = new ArrayList<String>();
        String[] setOfWords = {"apple", "set", "table", "pen", "web", "computer", "set", "cat", "fruit",
        "star", "text", "web", "user", "user", "value"};
        for (String word : setOfWords){
            wordArray.add(word);
        }
        System.out.println("Начальный набор слов: \n" + wordArray + "\n");
        Set<String> uniqueWords = new LinkedHashSet<String>(wordArray);
        System.out.println("Уникальный слова: \n" + uniqueWords + "\n");

        HashMap<String, Integer> frequency = new HashMap<String, Integer>();
        for (String i : uniqueWords) {
           frequency.put(i, Collections.frequency(wordArray, i));
        }
        System.out.println("Сколько раз встречается каждое слово: \n" + frequency + "\n");
    }

}

