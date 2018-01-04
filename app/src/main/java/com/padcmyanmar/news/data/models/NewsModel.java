package com.padcmyanmar.news.data.models;

import com.padcmyanmar.news.network.HttpUrlConnectionDataAgent;
import com.padcmyanmar.news.network.NewsDataAgent;

/**
 * Created by NB-MM-HQ-MNL on 12/23/2017.
 */

public class NewsModel {

    private NewsDataAgent mDataAgent;

    private static NewsModel sObjInstance;

    private NewsModel() {
        mDataAgent= HttpUrlConnectionDataAgent.getsDataAgent();
    }

    public static NewsModel getsObjInstance() {
        if (sObjInstance == null) {
            sObjInstance = new NewsModel();
        }
        return sObjInstance;
    }

    /**
     * Load news from network api.
     */
    public void loadNews() {
        mDataAgent.loadNews();
    }
}
