package com.example.myclassmate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myclassmate.databinding.ActivityMainBinding;
import com.example.myclassmate.databinding.NewProjectFormBinding;

public class new_project_form extends AppCompatActivity {

    NewProjectFormBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.new_project_form);

        bi.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        bi.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        RadioGroup group1 = bi.emojiGroup;
        RadioGroup group2 = bi.emojiGroup2;
        RadioGroup group3 = bi.emojiGroup3;
        RadioGroup group4 = bi.emojiGroup4;
        RadioGroup group5 = bi.emojiGroup5;
        RadioGroup group6 = bi.emojiGroup6;

        RadioGroup.OnCheckedChangeListener listener1 = new RadioGroup.OnCheckedChangeListener() {

            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int count = group.getChildCount();
                for (int i = 0; i < count; i++) {
                    group1.getChildAt(i).setAlpha(1);
                }

                for (int i = 0; i < count; i++) {
                    group2.getChildAt(i).setAlpha(1);
                }

                for (int i = 0; i < count; i++) {
                    group3.getChildAt(i).setAlpha(1);
                }

                for (int i = 0; i < count; i++) {
                    group4.getChildAt(i).setAlpha(1);
                }

                for (int i = 0; i < count; i++) {
                    group5.getChildAt(i).setAlpha(1);
                }

                for (int i = 0; i < count; i++) {
                    group6.getChildAt(i).setAlpha(1);
                }
                Log.println(Log.INFO, "*****************", String.valueOf(checkedId));
                switch (checkedId) {
                    case 6:
                        checkedId = 1;
                        break;
                    case 7:
                        checkedId = 2;
                        break;
                    case 8:
                        checkedId = 3;
                        break;
                    case 9:
                        checkedId = 4;
                        break;
                    case 10:
                        checkedId = 5;
                        break;
                    case 11:
                        checkedId = 1;
                        break;
                    case 12:
                        checkedId = 2;
                        break;
                    case 13:
                        checkedId = 3;
                        break;
                    case 14:
                        checkedId = 4;
                        break;
                    case 15:
                        checkedId = 5;
                        break;
                    case 16:
                        checkedId = 1;
                        break;
                    case 17:
                        checkedId = 2;
                        break;
                    case 18:
                        checkedId = 3;
                        break;
                    case 19:
                        checkedId = 4;
                        break;
                    case 20:
                        checkedId = 5;
                        break;
                    case 21:
                        checkedId = 1;
                        break;
                    case 22:
                        checkedId = 2;
                        break;
                    case 23:
                        checkedId = 3;
                        break;
                    case 24:
                        checkedId = 4;
                        break;
                    case 25:
                        checkedId = 5;
                        break;
                    case 26:
                        checkedId = 1;
                        break;
                    case 27:
                        checkedId = 2;
                        break;
                    case 28:
                        checkedId = 3;
                        break;
                    case 29:
                        checkedId = 4;
                        break;
                    case 30:
                        checkedId = 5;
                        break;

                }

                Log.println(Log.INFO, "*****************", String.valueOf(checkedId));

                group.getChildAt(checkedId - 1).setAlpha((float) 0.2);
            }
        };

        group1.setOnCheckedChangeListener(listener1);
        group2.setOnCheckedChangeListener(listener1);
        group3.setOnCheckedChangeListener(listener1);
        group4.setOnCheckedChangeListener(listener1);
        group5.setOnCheckedChangeListener(listener1);
        group6.setOnCheckedChangeListener(listener1);


    }
}
