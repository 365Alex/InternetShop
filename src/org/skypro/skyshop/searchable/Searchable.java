package org.skypro.skyshop.searchable;

public interface Searchable {
   String searchTerm();
   String content();
   String getName();
   default String getStringRepresentation(){
      return getName() + " - " + content();
   }
}
