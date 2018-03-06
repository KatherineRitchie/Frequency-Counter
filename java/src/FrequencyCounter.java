import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static final int NUM_ELEMENTS_TO_DISPLAY = 10;

    /**
     * This program accepts a url of a .txt file and prints out information about the most frequent ten words.
     * @param args url of .txt file
     */
    public static void main(String[] args) {
        String inputUrl = "";
        try {
            inputUrl = args[0];
        } catch (IllegalArgumentException e) {
            System.out.print("Try using a valid URL");
            System.exit(1);
        }
        String inputString = Load.getUrlContentsAsString(inputUrl);
        System.out.println(analyseWordFrequency(inputString, NUM_ELEMENTS_TO_DISPLAY));
    }

    /**
     * This function accepts a string and print out the most frequently appearing words.
     * @param textString contents of file
     * @param numElements number of most frequent words to display
     * @return String of user description of most frequent words
     * @throws NullPointerException if the file passed is not a .txt file
     * @throws IllegalArgumentException if the file is empty and thus cannot be analysed
     */
    public static String analyseWordFrequency(String textString, int numElements) throws
            NullPointerException, IllegalArgumentException {
        if (textString == null) {
            throw new NullPointerException("Are you sure that is a .txt file?");
        }
        if (textString.equals("")) {
            throw new IllegalArgumentException("The file you have passed doesn't have any words to analyse");
        }
        HashMap<String, Integer> wordCountMap = textToCountMap(textString);
        return findMostPopular(wordCountMap, numElements);
    }

    /**
     * Converts string into a hashmap counting all instances of that word
     * @param textString string of text
     * @return HashMap<String, Integer> with word as key and frequency as value.
     */
    public static HashMap<String, Integer> textToCountMap(String textString) {
        String filteredTextString = textString.toLowerCase();
        filteredTextString = filteredTextString.replaceAll("[^a-zA-Z\\s-']", "");
        String[] textArr = filteredTextString.split("\\s+");
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        for (String word : textArr) {
            if (word.equals("")) {
                continue;
            }
            if (countMap.containsKey(word)) {
                int currentScore = countMap.get(word);
                countMap.put(word, currentScore + 1);
            } else {
                countMap.put(word, 1);
            }
        }
        return countMap;
    }

    /**
     * Creates a string describing the most popular elements in the map passed
     * @param unsortedWordCountMap map of string, int values describing word counts
     * @param numElements number of top-elements to display
     * @return String description
     */
    public static String findMostPopular(HashMap<String, Integer> unsortedWordCountMap, int numElements) {
        if (numElements > unsortedWordCountMap.size()) {
            numElements = unsortedWordCountMap.size();
        }
        StringBuilder sortedOutputSb = new StringBuilder();
        sortedOutputSb.append(String.format("The most frequent %s words are:\n", numElements));
        for (int i = 0; i < numElements; i++) {
            String topKey = findMaxKeyInMap(unsortedWordCountMap);
            Integer topInteger = unsortedWordCountMap.get(topKey);
            sortedOutputSb.append(String.format("%s. %s : %s \n", i + 1, topKey, topInteger));
            unsortedWordCountMap.remove(topKey);
        }
        return sortedOutputSb.toString();
    }

    /**
     * Returns a the key of the element in the map with the highest value. If two elements have the same value, the
     * one with the highest alphanumerical key is returned
     * @param unsortedMap
     * @return String key
     */
    public static String findMaxKeyInMap(HashMap<String, Integer> unsortedMap) {
        int maxValue = 0;
        String maxKey = new String();
        for (Map.Entry<String, Integer> entry : unsortedMap.entrySet()) {
            if ((int) entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
            //if two entries have the same value, the one that comes first in the alphabet is returned.
            if ((int) entry.getValue() == maxValue && maxKey.compareToIgnoreCase(entry.getKey()) > 0) {
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
