package com.denethielstudio.summonerofleagueoflegend;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by neopoliticatv on 23/02/15.
 */
public class Champion implements Serializable {
    private static final long serialVersionUID = 2L;
    // Atributos Primarios
    private String mRiotId;
    private String mTitle;
    private String mName;
    private String mKey;
    private String mStats;
    private String mSquareImageUrl;
    private ChampionSkill mPassive;
    private ChampionSkill mQSkill;
    private ChampionSkill mWSkill;
    private ChampionSkill mESkill;
    private ChampionSkill mRSkill;
    private String mLore;
    private Map<String,String> mSkins;



}
