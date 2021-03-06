package com.itheima.startservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void click(View view) {
        // 显式启动服务
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void click2(View view) {
        // 显式关闭服务
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }
}
