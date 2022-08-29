package com.meishe.msvideocut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.meishe.libbase.BaseActivity;
import com.meishe.modulecapture.CaptureActivity;
import com.meishe.modulevideoedit.VideoEditActivity;
import com.meishe.msvideocut.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    static {
        System.loadLibrary("msvideocut");
    }

    private ActivityMainBinding mBinding;

    @Override
    public View bindLayout() {
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    public void initListener() {
        mBinding.btnCapture.setOnClickListener(this);
        mBinding.btnVideoEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_capture:
                 startActivity(new Intent(mContext, CaptureActivity.class));
                break;
            case  R.id.btn_video_edit:
                startActivity(new Intent(mContext, VideoEditActivity.class));
                break;
        }
    }

    /**
     * A native method that is implemented by the 'msvideocut' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();


}