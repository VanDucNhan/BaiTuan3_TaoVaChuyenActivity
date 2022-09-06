package com.google.baituan3_taoactivitychuyengiuaactivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Button opChild = (Button) findViewById(R.id.openParent);
        opChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(ChildActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
