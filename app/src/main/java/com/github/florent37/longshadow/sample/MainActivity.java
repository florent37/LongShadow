package com.github.florent37.longshadow.sample;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.LinearInterpolator;
import android.widget.SeekBar;
import android.widget.TextView;

import com.github.florent37.longshadow.LongShadow;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.angle)
    TextView angle;

    @BindView(R.id.shadow)
    LongShadow shadowFrameLayout;

    @BindView(R.id.shadow2)
    LongShadow shadowFrameLayout2;

    @BindView(R.id.seekbar)
    SeekBar seekbar;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                shadowFrameLayout.setShadowAngle(i);
                angle.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*
        final ObjectAnimator animator = ObjectAnimator.ofFloat(shadowFrameLayout2, "shadowAngle", 0, 360);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setInterpolator(new LinearInterpolator());
        animator.setDuration(3000);
        animator.start();
        */
    }
}
