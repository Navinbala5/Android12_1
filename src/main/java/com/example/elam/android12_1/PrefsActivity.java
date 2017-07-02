package com.example.elam.android12_1;

/**
 * Created by elam on 02-07-2017.
 */

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

public class PrefsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        addPreferencesFromResource(R.xml.);
        addPreferencesFromResource(R.xml.prefs);
    }
}