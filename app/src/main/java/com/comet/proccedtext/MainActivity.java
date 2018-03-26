package com.comet.proccedtext;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;

public class MainActivity extends AppCompatActivity {
    ProceedTextSurfaceView pv_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pv_one = findViewById(R.id.pv_one);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(pv_one, "movePercent", 0, 1);
        objectAnimator.setDuration(2000);
        objectAnimator.setInterpolator(new LinearInterpolator());
        objectAnimator.start();
    }
}
