package Homework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Data {

    public static void main(String[] args) {

        ArrayList<String>namelist=new ArrayList<String>();
        namelist.add("mike");
        namelist.add("peter");
        namelist.add("hendry");
        namelist.add("gorge");
        namelist.remove("mike");
        namelist.add("hary");
        for (int a=0;a<namelist.size();a ++){
            System.out.println(namelist.get(a));
        }
        System.out.println();

        System.out.println();
        LinkedList<String>linklist=new LinkedList<String>();
        linklist.add("hasan");
        linklist.add("jek");
        linklist.add("bob");
        linklist.add("zep");
        linklist.remove("zep");

        for (int s=0;s<linklist.size();s++){
            System.out.println(linklist.get(s));
        }
    }
}
