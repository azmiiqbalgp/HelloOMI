package com.yippytech.omi252525;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private BottomBar bottomBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_informasi) {
                    // The tab with id R.id.tab_calls was selected,
                    // change your content accordingly.
                    textView.setText("Coming soon informasi");
                } else if (tabId == R.id.tab_pertandingan) {
                    // The tab with id R.id.tab_groups was selected,
                    // change your content accordingly.
                    textView.setText("Coming soon pertandingan");
                } else if (tabId == R.id.tab_cabang_olahraga) {
                    // The tab with id R.id.tab_chats was selected,
                    // change your content accordingly.
                    textView.setText("Coming soon cabang olahraga");
                } else if (tabId == R.id.tab_medali) {
                    // The tab with id R.id.tab_chats was selected,
                    // change your content accordingly.
                    textView.setText("Coming soon medali");
                } else if (tabId == R.id.tab_sejarah) {
                    // The tab with id R.id.tab_chats was selected,
                    // change your content accordingly.
                    textView.setText("Coming soon sejarah");
                }
            }
        });
    }
}
