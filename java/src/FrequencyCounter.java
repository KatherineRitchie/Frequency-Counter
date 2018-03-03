import oracle.jrockit.jfr.StringConstantPool;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static final int NUM_ELEMENTS_TO_DISPLAY = 10;

    //TODO write JavaDocs for all of this

    public static void main(String[] args) {
        String inputString = "";
        try {
            inputString = args[0];
        } catch (IllegalArgumentException e) {
            System.out.print("Try using a valid URL");
            System.exit(1);
        }

        System.out.println(mapToString(analyseWordFrequency(inputString, NUM_ELEMENTS_TO_DISPLAY)));
    }

    public static String getUrlContentAsString(String filename) throws IllegalArgumentException {
        return null;
        //TODO write getUrlcontentAsString
    }

    public static HashMap<String, Integer> analyseWordFrequency(String textString, int numElements) throws
            NullPointerException, IllegalArgumentException {
        if (textString == null) {
            throw new NullPointerException("Are you sure that is a .txt file?");
        }s
        //TODO is this the right usage of equals????
        if (textString.equals("")) {
            throw new IllegalArgumentException("The file you have passed doesn't have any words to analyse");
        }
        HashMap<String, Integer> wordCountMap = textToCountMap(textString);
        HashMap<String, Integer> mostSeenMap = findMostPopular(wordCountMap, numElements);
        return mostSeenMap;
    }

    public static HashMap<String, Integer> textToCountMap(String textString) {
        String filteredTextString = textString.replaceAll("[\\D]|[\\S]|[\\W]", "");
        String[] textArr = filteredTextString.split(" ");
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        for (String word : textArr) {
            if (countMap.containsKey(word)) {
                int currentScore = countMap.get(word);
                countMap.put(word, currentScore + 1);
            } else {
                countMap.put(word, 1);
            }
        }
        return countMap;
    }

    public static HashMap<String, Integer> findMostPopular(HashMap<String, Integer> unsortedWordCountMap, int numElements) {
        HashMap<String, Integer> sortedWordCountMap = new HashMap<String, Integer>();
        for (int i = 0; i < numElements; i++) {
            String topKey = findMaxKeyInMap(unsortedWordCountMap);
            Integer topInteger = unsortedWordCountMap.get(topKey);
            sortedWordCountMap.put(topKey, topInteger);
            unsortedWordCountMap.remove(topKey);
        }
        return sortedWordCountMap;
    }

    public static String findMaxKeyInMap(HashMap<String, Integer> unsortedMap) {
        int maxValue = 0;
        String maxKey = new String();
        for (Map.Entry<String, Integer> entry : unsortedMap.entrySet()) {
            if ((int) entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static String mapToString(HashMap<String, Integer> mostSeenMap) {
        StringBuilder outputSb = new StringBuilder();
        int score = 1;
        for (Map.Entry<String, Integer> element : mostSeenMap.entrySet()) {
            outputSb.append(String.format("%s. %s : %s.", score, element.getKey(), element.getValue()));
            score++;
        }
        return outputSb.toString();
    }
}
