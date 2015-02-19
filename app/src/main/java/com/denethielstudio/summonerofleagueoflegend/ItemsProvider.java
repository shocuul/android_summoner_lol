package com.denethielstudio.summonerofleagueoflegend;

import android.content.ContentProvider;
import android.content.UriMatcher;

/**
 * Created by neopoliticatv on 18/02/15.
 */
public class ItemsProvider extends ContentProvider {
    private LolDatabase mOpenHelper;

    private static String TAG = ItemsProvider.class.getSimpleName();

    private static final UriMatcher sUriMatcher = buildUriMatcher();

    private static final int ITEMS = 100;
    private static final int ITEMS_ID = 101;

    private static UriMatcher buildUriMatcher(){

    }

}
