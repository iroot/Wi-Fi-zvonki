package com.mavenir.android.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import com.fgmicrotec.mobile.android.fgvoip.FgVoIP;
import com.mavenir.android.fragments.PreferenceAppLogFragment;

public class PreferenceAppLogActivity extends ActionBarActivity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(16908290) == null) {
            new Handler().post(new Runnable(this) {
                final /* synthetic */ PreferenceAppLogActivity b;

                public void run() {
                    supportFragmentManager.beginTransaction().add(16908290, new PreferenceAppLogFragment()).commit();
                }
            });
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                FgVoIP.U().c((Activity) this);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
