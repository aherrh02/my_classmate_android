package com.example.myclassmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myclassmate.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    boolean isRotate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ViewAnimation.init(bi.fabNewTask);
        ViewAnimation.init(bi.fabNewProject);

        bi.todayClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Segunda_Activity.class);
                startActivity(intent);
            }
        });

        bi.inboxClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), tasks_activity.class);
                startActivity(intent);
            }
        });

        bi.fabNewProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), new_project_form.class);
                startActivity(intent);
            }
        });

        bi.fabAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                isRotate = ViewAnimation.rotateFab(v, !isRotate);
                if (isRotate) {
                    ViewAnimation.showIn(bi.fabNewProject);
                    ViewAnimation.showIn(bi.fabNewTask);
                } else {
                    ViewAnimation.showOut(bi.fabNewProject);
                    ViewAnimation.showOut(bi.fabNewTask);
                }
            }

        });

    }
}