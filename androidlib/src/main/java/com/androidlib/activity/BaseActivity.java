package com.androidlib.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidlib.R;

/**
 * activity 包中存放的是与业务无关的 Activity 基类。
 * Activity 基类要分两层:
 * 1.AndroidLib 下的基类 BaseActivity 封装的是业务无关的公用逻辑
 * 2.主项目中的 AppBaseActivity 基类封装的是业务相关的公用逻辑
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
