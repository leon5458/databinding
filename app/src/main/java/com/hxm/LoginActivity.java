package com.hxm;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * ********文件描述：********
 * ********作者：huleiyang********
 * ********创建时间：2019/12/6********
 * ********更改时间：2019/12/6********
 * ********版本号：1********
 */
public class LoginActivity extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_layout);
        txt = findViewById(R.id.textview);
        txt.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
