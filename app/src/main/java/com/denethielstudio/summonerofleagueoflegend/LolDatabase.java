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
        String ITEMS = "items";
    }

    public LolDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Tables.STATS + "("
            + BaseColumns._ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_CHAMPION_ID + "INTEGER NOT NULL"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ARMOR + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ARMORPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKDAMAGE + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKDAMAGEPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKRANGE + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKSPEEDOFFSET + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_ATTACKSPEEDPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_CRIT + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_CRITPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_HP + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_HPPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_HPREGEN + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_SPELLBLOCKPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_MPREGENPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_MPPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_MOVESPEED + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_HPREGENPERLEVEL + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_SPELLBLOCK + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_MP + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionsStatsColumns.STATS_MPREGEN + "TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+ Tables.CHAMPION + "("
            + BaseColumns._ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SummonerofLolContract.ChampionColumns.CHAMPIONS_RIOT_ID + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionColumns.CHAMPIONS_NAME + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionColumns.CHAMPIONS_KEY + "TEXT NOT NULL,"
            + SummonerofLolContract.ChampionColumns.CHAMPIONS_TITLE + "TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+ Tables.ITEMS + "("
            + BaseColumns._ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SummonerofLolContract.ItemsColumns.ITEMS_NAME + "TEXT NOT NULL,"
            + SummonerofLolContract.ItemsColumns.ITEMS_COST + "TEXT NOT NULL,"
            + SummonerofLolContract.ItemsColumns.ITEMS_IMG_URL + "TEXT NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        int version = oldVersion;
        if(version == 1){
            //Add some extra fields to the database without deleting existing date
            version = 2;
        }
        if (version != DATABASE_VERSION){
            db.execSQL("DROP TABLE IF EXITS " + Tables.CHAMPION);
            db.execSQL("DROP TABLE IF EXITS " + Tables.STATS);
            db.execSQL("DROP TABLE IF EXITS " + Tables.ITEMS);
            onCreate(db);
        }

    }

    public void SummonerofLolDatabase(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
        mContext = context;
    }
    public stativ void deleteDatabase(Context context){
        context.deleteDatabase(DATABASE_NAME);
    }


}
