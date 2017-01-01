package com.yippytech.omi252525;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.crashlytics.android.Crashlytics;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
import com.yippytech.omi252525.view.CabangOlahragaFragment;
import com.yippytech.omi252525.view.InformasiFragment;
import com.yippytech.omi252525.view.MedaliFragment;
import com.yippytech.omi252525.view.PertandinganFragment;
import com.yippytech.omi252525.view.SejarahFragment;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    private BottomBar bottomBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_informasi) {
                    // The tab with id R.id.tab_calls was selected,
                    // change your content accordingly.
                    commitFragment(new InformasiFragment());
                } else if (tabId == R.id.tab_pertandingan) {
                    // The tab with id R.id.tab_groups was selected,
                    // change your content accordingly.
                    commitFragment(new PertandinganFragment());
                } else if (tabId == R.id.tab_cabang_olahraga) {
                    // The tab with id R.id.tab_chats was selected,
                    // change your content accordingly.
                    commitFragment(new CabangOlahragaFragment());
                } else if (tabId == R.id.tab_medali) {
                    // The tab with id R.id.tab_chats was selected,
                    // change your content accordingly.
                    commitFragment(new MedaliFragment());
                } else if (tabId == R.id.tab_sejarah) {
                    // The tab with id R.id.tab_chats was selected,
                    // change your content accordingly.
                    commitFragment(new SejarahFragment());
                }
            }
        });
    }

    private void commitFragment(Fragment fragment){
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.contentContainer, fragment);
        fragmentTransaction.commit();
    }
}
