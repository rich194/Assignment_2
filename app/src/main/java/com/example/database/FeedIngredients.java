package com.example.database;

import android.provider.BaseColumns;

public final class FeedIngredients {
    private FeedIngredients(){}

    public static class FeedIngredientsTable implements BaseColumns{
        public static final String TABLE_NAME = "name";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
}
