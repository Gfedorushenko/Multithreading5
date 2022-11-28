package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> bookName =new TreeMap<String, String>();
    private Map<String, String> bookNumber = new TreeMap<String, String>();

    public int add(String name, String number) {
        bookName.put(name, number);
        bookNumber.put(number,name);
        return bookName.size();
    }
    public String findByNumber(String number){
        return bookNumber.get(number);
    }

    public String findByName(String name){
        return bookName.get(name);
    }

    public String[] printAllNames(){
        return new String[]{"",""};
    }

}
