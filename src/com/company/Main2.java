package com.company;

import java.security.Key;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("большой", new String[]{"колосальный", "огромный", "громадный", "гигантский"});
        dictionary.put("колосальный", new String[]{"огромный", "громадный", "гигантский", "большой"});
        dictionary.put("человек", new String[]{"персона", "личность", "индивидум"});
        dictionary.put("дом", new String[]{"жилище", "хата", "квартира", "недвижимость"});

        HashMap<String,String[]> bigdicitionary = new HashMap<>();
        Set<String> keys = dictionary.keySet();

        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<<<<");
            String key = iterator.next().toString();
            String[] word = dictionary.get(key);
            bigdicitionary.put(key, word);
            for (int i = 0; i < word.length; i++) {
                String novKey = word[i];
                ArrayList<String> words = new ArrayList<>(word.length);
                words.addAll(Arrays.asList(word));
                words.remove(novKey);
                words.add(key);
                String[] wo = new String[words.size()];
                wo = words.toArray(wo);
                bigdicitionary.put(novKey, wo);
                System.out.println("_________________________________");
                for (Map.Entry <String, String[]> item : bigdicitionary.entrySet()) {
                    System.out.println(item.getKey() + " " + Arrays.toString(item.getValue()));
                }
            }
        }
    }
}
