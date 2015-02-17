package com.denethielstudio.summonerofleagueoflegend;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by neopoliticatv on 17/02/15.
 */
public class LolDatabase extends SQLiteOpenHelper {
    private static final String TAG = LolDatabase.class.getSimpleName();
    private static final String DATABASE_NAME = "lolstatic_data.db";
    private static final int DATABASE_VERSION = 1;


    private final Context mContext;

    interface Tables{
        String CHAMPION = "champion";
        String STATS = "stats";
    }

    public LolDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Tables.STATS + "("
            + BaseColumns._ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ARMOR + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ARMORPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKDAMAGE + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKDAMAGEPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKRANGE + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKSPEEDOFFSET + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKSPEEDPERLEVEL + "TEXT NOT NULL");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
