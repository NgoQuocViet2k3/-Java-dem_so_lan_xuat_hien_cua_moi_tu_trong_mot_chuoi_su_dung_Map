package com.codegym;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	String sentence ="Ba mươi năm hà đông " + " ba mươi năm hà tây "+"đừng khinh thiếu niên nghèo";
        Map<String, Integer> treemap = new TreeMap<>();
        String[] arr = sentence.toLowerCase().split(" ");


        for (String s : arr) {
            if (treemap.containsKey(s)) {
                int count = treemap.get(s);
                treemap.replace(s, count + 1);
            } else {
                treemap.put(s, 1);
            }
        }


        // in ra map
        treemap.entrySet().forEach(entry -> {
            System.out.println("Từ \"" + entry.getKey() + "\" xuất hiện " + entry.getValue() +  " lần");
        });
    }
}
