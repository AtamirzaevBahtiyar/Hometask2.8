package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String[]> dictionary = new HashMap<>();

        dictionary.put("деревня", new String[]{"Село", "аыйл", "кишлак", "аул"});
        dictionary.put("красивый", new String[]{"приятное", "симпотичное", "обоятельное"});
        dictionary.put("дом", new String[]{"жилище", "квартира", "шалаш", "логово"});
        dictionary.put("программист", new String[]{"хакер", "девелопер", "айтишник", "гик"});
        
        HashMap<String, String[]> bigDictionary = new HashMap<>();
        bigDictionary.putAll(dictionary);
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(bigDictionary.get("деревня")));
        System.out.println("--------------------------");
        Set<String> keys = dictionary.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String k = iter.next();
            for (int i = 0; i < dictionary.get(k).length; i++) {
                ArrayList<String> strings = new ArrayList<>();
                Collections.addAll(strings, dictionary.get(k));
                String l = strings.get(i);
                strings.set(i, k);
                String[] arr = new String[strings.size()];
                for (int m = 0; m < strings.size(); m++) {
                    arr[m] = strings.get(m);
                }
                System.out.println("!-------!");
                bigDictionary.put(l, arr);
            }
        }

        dictionary.putAll(bigDictionary);

        System.out.println("BigDictionary: ");
        Set<String> keys1 = bigDictionary.keySet();
        Iterator<String> iter1 = keys1.iterator();
        while (iter1.hasNext()) {
            String k = iter1.next();
            System.out.println(k + Arrays.toString(bigDictionary.get(k)));
        }
        System.out.println("--------------------------------------");


    }



}

