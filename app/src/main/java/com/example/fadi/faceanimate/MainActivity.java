package com.example.fadi.faceanimate;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private RelativeLayout canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.FaceIcon);
        canvas  = (RelativeLayout) findViewById(R.id.animationcanvas);
    }

    public void onButtonClicked (View v){
    int screenhieght = canvas.getHeight();
        int targety = screenhieght - imageView.getHeight();

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView,"y",0,targety).setDuration(1000);
        animator.setInterpolator(new BounceInterpolator());
                animator.start();

    }
}
