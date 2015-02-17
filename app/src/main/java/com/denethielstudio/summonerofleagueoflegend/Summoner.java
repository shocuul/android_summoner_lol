package com.denethielstudio.summonerofleagueoflegend;

import java.io.Serializable;

/**
 * Created by neopoliticatv on 17/02/15.
 */
public class Summoner implements Serializable{
    private static final long serialVersionUID = 1L;
    private String mId;
    private String mName;
    private String mProfileIconId;
    private String mSummonerLevel;

    public Summoner(String id, String name, String profileIconId, String summonerLevel) {
        this.mId = id;
        this.mName = name;
        this.mProfileIconId = profileIconId;
        this.mSummonerLevel = summonerLevel;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getProfileIconId() {
        return mProfileIconId;
    }

    public String getSummonerLevel() {
        return mSummonerLevel;
    }
}
