package be.intecbrussel.ArrayListOefening.myCollection;

import java.util.Arrays;

public class MyCollection {
    private String[] words;

    public MyCollection(String[] words) {
        this.words = words;
    }

    public void add(String value) {
        words = Arrays.copyOf(words, words.length+1);
        words[words.length -1] = value;
    }

    public void remove(int index) {
        String[] arrNew = new String[words.length-1];

        int count = 0;
        for(int i=0;i<words.length;i++) {
            if (i != index) {
                arrNew[count] = words[i];
                count++;
            }
            words = arrNew;
        }
    }

    public int size () {
        return words.length;
    }

    public String get(int index) {
        return words[index];
    }


}
