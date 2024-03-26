package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        RelativeLayout rootView = findViewById(R.id.profilegridshow);

        LinearLayout gridLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.addRule(RelativeLayout.BELOW, R.id.profilegridshow);
        gridLayout.setLayoutParams(layoutParams);
        gridLayout.setOrientation(LinearLayout.VERTICAL);

        for (int i = 0; i < 2; i++) {
            LinearLayout rowLayout = new LinearLayout(this);
            LinearLayout.LayoutParams rowParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            rowLayout.setLayoutParams(rowParams);
            rowLayout.setOrientation(LinearLayout.HORIZONTAL);

            for (int j = 0; j < 3; j++) {
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.call); // Set your image resource here
                LinearLayout.LayoutParams imageLayoutParams = new LinearLayout.LayoutParams(
                        0,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        1
                );
                imageView.setLayoutParams(imageLayoutParams);
                rowLayout.addView(imageView);
            }

            gridLayout.addView(rowLayout);
        }

        // Add the grid layout to the root layout
        rootView.addView(gridLayout);
    }
}
