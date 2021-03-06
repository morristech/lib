package com.devinci.lib.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.devinci.lib.app.BaseComponent;
import com.devinci.lib.crash.CrashReporting;
import com.devinci.lib.dagger.Components;
import javax.inject.Inject;

/**
 * Base {@link AppCompatActivity} with injected dependencies.
 */
public abstract class BaseActivity extends AppCompatActivity {

  @Inject protected CrashReporting crashReporting;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Components.<BaseComponent>fromContext(this).inject(this);
  }
}
