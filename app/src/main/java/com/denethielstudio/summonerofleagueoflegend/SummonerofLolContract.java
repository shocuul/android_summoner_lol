package com.denethielstudio.summonerofleagueoflegend;
// Fpure

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by neopoliticatv on 17/02/15.
 */
public class SummonerofLolContract {
    interface ChampionsStatsColumns{
        String STATS_ATTACKRANGE = "stats_attackrange";
        String STATS_MPPERLEVEL = "stats_mpperlevel";
        String STATS_MP = "stats_mp";
        String STATS_ATTACKDAMAGE = "stats_attackdamage";
        String STATS_HP = "stats_hp";
        String STATS_HPPERLEVEL = "stats_hpperlevel";
        String STATS_ATTACKDAMAGEPERLEVEL = "stats_attackdamageperlevel";
        String STATS_ARMOR = "stats_armor";
        String STATS_MPREGENPERLEVEL = "stats_mpregenperlevel";
        String STATS_HPREGEN = "stats_hpregen";
        String STATS_CRITPERLEVEL = "stats_critperlevel";
        String STATS_SPELLBLOCKPERLEVEL = "stats_spellblockperlevel";
        String STATS_MPREGEN = "stats_mpregen";
        String STATS_ATTACKSPEEDPERLEVEL = "stats_attackspeedperlevel";
        String STATS_SPELLBLOCK = "stats_spellblock";
        String STATS_MOVESPEED = "stats_movespeed";
        String STATS_ATTACKSPEEDOFFSET = "stats_attackspeedoffset";
        String STATS_CRIT = "stats_crit";
        String STATS_HPREGENPERLEVEL = "stats_hpregenperlevel";
        String STATS_ARMORPERLEVEL = "stats_armorperlevel";
    }

    public static final String CONTENT_AUTHORY = "com.denethielstudio.android.summoneroflol.provider";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORY);

    private static final String PATH_STATS = "stats";

    public static final String[] TOP_LEVEL_PATHS = {
            PATH_STATS
    };

    public static class Stats implements ChampionsStatsColumns, BaseColumns{
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendEncodedPath(PATH_STATS).build();

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd."+CONTENT_AUTHORY+".stats";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd."+CONTENT_AUTHORY+".stats";

        public static Uri buildStatsUri(String statsId){
            return CONTENT_URI.buildUpon().appendEncodedPath(statsId).build();
        }

        public static String getStatsId(Uri uri){
            return uri.getPathSegments().get(1);
        }
    }
}
