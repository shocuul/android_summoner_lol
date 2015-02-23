package com.denethielstudio.summonerofleagueoflegend;

import android.net.Uri;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neopoliticatv on 23/02/15.
 */
public class GetChampionJsonData extends GetRawData {
    private String TAG = GetChampionJsonData.class.getSimpleName();
    private String mRealm = "lan";
    private List<Champion> mChampions;
    private Uri mDestinationUri;

    public GetChampionJsonData() {
        super(null);
        createRiotUri();
        mChampions = new ArrayList<Champion>();
    }

    public void execute(){
        super.setRawUrl(mDestinationUri.toString());

    }

    public boolean createRiotUri(){
        mDestinationUri = "https://global.api.pvp.net/api/lol/static-data/lan/v1.2/champion?champData=all&api_key=df88f795-a91e-4f2a-b7ea-18d99be980bb";
        return mDestinationUri != null;
    }

    public List<Champion> getChampions() {
        return mChampions;
    }

    public void processResult(){
        if(getDownloadStatus() != DownloadStatus.OK){
            Log.e(TAG,"Error downloading raw file");
            return;
        }
        
    }
}
