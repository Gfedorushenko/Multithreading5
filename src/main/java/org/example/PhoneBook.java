package org.example;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> bookName = new HashMap<>();
    private HashMap<String, String> bookNumber = new HashMap<>();

    public int add(String name, String number) {
        bookName.put(name, number);
        bookNumber.put(number,name);
        return bookName.size();
    }
    public String findByNumber(String number){
        return bookNumber.get(number);
    }

}
