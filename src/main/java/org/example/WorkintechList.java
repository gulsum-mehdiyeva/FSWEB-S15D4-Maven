package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class WorkintechList<Element extends Comparable<Element>> extends ArrayList<Element>{
    @Override
    public boolean add(Element element) {
       if(!this.contains(element)){
           return super.add(element);
       }
       return false;
    }
    public void sortList() {
        Collections.sort(this);
    }
    public boolean remove(Object obj) {
        boolean silindi = super.remove(obj);
        if (silindi) {
            sortList();
        }
        return silindi;
    }
}
