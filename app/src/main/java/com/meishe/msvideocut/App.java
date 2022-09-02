package com.meishe.msvideocut;

import android.app.Application;
import android.content.Context;

import com.meicam.sdk.NvsStreamingContext;

/**
 * All rights Reserved, Designed By www.meishesdk.com
 *
 * @Author: lpf
 * @CreateDate: 2022/9/1 下午3:57
 * @Description:
 * @Copyright: www.meishesdk.com Inc. All rights reserved.
 */
public class App extends Application {

    private Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;
        NvsStreamingContext.init(mContext,"",0);
    }
}
