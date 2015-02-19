package com.denethielstudio.summonerofleagueoflegend;

import android.content.ContentProvider;
import android.content.UriMatcher;
import android.provider.ContactsContract;

/**
 * Created by neopoliticatv on 18/02/15.
 */
public class SummonersProvider extends ContentProvider {
    private LolDatabase mOpenHelper;

    private static String TAG = SummonersProvider.class.getSimpleName();

    private static UriMatcher sUriMatcher = buildUriMatcher();

    private static final int SUMMONERS = 100;
    private static final int SUMMONERS_ID = 101;

    private static UriMatcher buildUriMatcher(){
        final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
        final String authority = SummonerofLolContract.CONTENT_AUTHORY;
        matcher.addURI(authority,"Summoners",SUMMONERS);
        matcher.addURI(authority,"Summoners/*",SUMMONERS_ID);
        return matcher;

    }


}
