package org.skypro.skyshop.search;

import org.skypro.skyshop.searchable.Searchable;

import java.util.Arrays;

public class SearchEngine {
    private final Searchable[] searchables;
    private int size = 0;

    public SearchEngine(int count){
        searchables = new Searchable[count];
    }

    public void add(Searchable name){
        if (size < searchables.length){
            searchables[size++] = name;
        }else {
            System.out.println("превышен лимит");
        }
    }

    private Searchable[] search(String search){
        Searchable[] results = new Searchable[5];
        int count =0;
        for (Searchable item : searchables) {
            if (item != null && item.searchTerm().contains(search)){
                if (count < results.length){
                    results[count++] = item;
                }else {
                    break;
                }
            }
        }
        return results;
    }

    public void printSearchResult(String name){
        System.out.println(Arrays.toString(search(name)));
    }
}
