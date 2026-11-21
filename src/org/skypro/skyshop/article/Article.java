package org.skypro.skyshop.article;

import org.skypro.skyshop.searchable.Searchable;

public record Article(String title, String text) implements Searchable {

    @Override
    public String searchTerm() {
        return toString();
    }

    @Override
    public String content() {
        return "ARTICLE";
    }

    @Override
    public String toString() {
        return "Название статьи: " + title() + "\n"
                + "Текст статьи: " + text();
    }

    @Override
    public String getName() {
        return title;
    }
}
