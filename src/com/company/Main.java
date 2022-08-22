package com.company;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<City>treeset=new TreeSet(new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return Integer.compare(o2.code, o1.code);
            }
        });
        City[] cities={new City(8,"Berlin"),
                new City(3,"Bishkek"),
                new City(5,"Moscow"),
                new City(4,"Astana"),
                new City(9,"Paris")};
        for(City a:cities) {
            if(a.code%2==1){
                treeset.add(a);
            }
        }
           System.out.println(treeset);
       }
    }


    /*City деген класс тузунуз. (code, name, ...)
        Эгерде code так сан болсо TreeSetke салыныз.
        Аларды чонунан кичинесине караган тартипте чыгарыныз.*/
