package com.traciing.fronts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.traciing.common.TextViewFronts;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextViewFronts)findViewById(R.id.test))
                .findAndSetStrColor(1,"aaa","#ff8000")
                .findAndSetStrColor(2,"bbb","strong")
                .findAndSetStrColor(3,"ccc","big")
                .findAndSetStrColor(2,"ddd","u")
                .findAndSetStrColor(2,"eee","i")
                .findAndSetStrColor(3,"fff","small");

    }

}
