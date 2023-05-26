package br.com.codifiquei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap<String, Integer>();
        map.put("C", 2);
        map.put("D", 3);
        map.put("A", 10);
        System.out.println(map.keySet().contains("A"));
        map.forEach((k, v) ->{
          System.out.println("Chave="+k+ " com valor = "+v);
        });

    }
}