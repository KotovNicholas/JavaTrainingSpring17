package ua.training.Model;

import java.util.ArrayList;

/**
 * Created by Plavun on 29.03.2017.
 */
public class Model {

    public String getReverseLine (String textLine){

        ArrayList<String> textString = getTextString(textLine);

        String returnLine = getReversLine(textString);
        return returnLine;
    }

    public ArrayList<String> getTextString (String textLineForString){

        ArrayList<String> textArray = new ArrayList<String>();

        String word="";

        for (int i = 0; i<textLineForString.length(); i++) {

            if (Character.isSpaceChar(textLineForString.charAt(i))){
                textArray.add(word);
                word="";

            }else {
                word+=textLineForString.charAt(i);
            }

        }

        if (word.length()>0){
            textArray.add(word);
        }

        return textArray;
    }

    public String getReversLine (ArrayList<String> textArray){

        String finalString="";

        for (String i:textArray){
            finalString += getReversWord(i)+" ";
        }

        return finalString;
    }


    public String getReversWord (String textWord){

        String wordWithoutNumbers = getWordWithoutNumber(textWord);

        String wordWithoutNumbersRevers = getReversWordsOnly(wordWithoutNumbers);

        String getRewersWordAndNumber = getRewersWordAndNumber(textWord, wordWithoutNumbersRevers);

        return getRewersWordAndNumber;
    }

    public String getWordWithoutNumber (String textWord){

        String word = "";
        for (int i = 0; i<textWord.length(); i++) {

            if (Character.isLetter(textWord.charAt(i))) {
                word+=textWord.charAt(i);
              }

        }

        return word;
    }

    public String getRewersWordAndNumber (String textWord, String wordWithoutNumbers){

        String newWord = "";
        String word = wordWithoutNumbers;
        StringBuffer buffer = new StringBuffer(wordWithoutNumbers);
        for (int i = 0; i<textWord.length(); i++) {



            if (Character.isLetter(textWord.charAt(i))) {
                newWord += buffer.charAt(0);
                buffer.delete(0,1);
            }else {
                newWord += textWord.charAt(i);
            }

        }

        return newWord;
    }

    public String getReversWordsOnly (String wordWithoutNumbers){

        StringBuffer word = new StringBuffer(wordWithoutNumbers);

        return word.reverse().toString();
    }

}
