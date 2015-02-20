package com.denethielstudio.summonerofleagueoflegend;

import android.content.ContentProvider;
import android.content.UriMatcher;

/**
 * Created by neopoliticatv on 20/02/15.
 */
public class ChampionsProvider extends ContentProvider {
    private LolDatabase mOpenHelper;

    private static final TAG = ChampionsProvider.class.getSimpleName();

    private static final UriMatcher sUriMatcher = buildUriMatcher();

    private static final int CHAMPIONS = 100;
    private static final int CHAMPIONS_ID = 101;
}
