package org.example;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> book = new HashMap<>();

    public int add(String name, String number) {
        book.put(name, number);
        return book.size();
    }
}
