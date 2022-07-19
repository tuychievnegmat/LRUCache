package com.coderbyte.LRUCache.model;


import org.springframework.util.Assert;


import java.util.*;

/*checks are already implemented in the unit test, in the LruCacheApplicationTests class*/
public class LRUCache{
    private static int size = 4;

    public static void main(String[] args) {

    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        LRUCache.size = size;
    }

    //https://github.com/Arafat-Dipto/coderbyte-codes/blob/master/LRU%20Cache.py
    public static String LRUCache(String[] strArr){
        int size = getSize();
        List<String> stringList = new ArrayList<>();
        for (String s : strArr) {
            if(stringList.contains(s)){
                stringList.remove(s);
                stringList.add(s);
            }
            else {
                if (stringList.size() > size){
                    stringList.remove(0);
                }
                stringList.add(s);
            }
        }

        StringBuilder builder = new StringBuilder();
        stringList.forEach(builder::append);
        if (builder.toString().isEmpty())
            return "EMPTY";
        return builder.toString();
    }
}
