package com.hly;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hly.databinding.SimpleActivityLayoutBinding;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/1/14~~~~~~
 * ~~~~~~更改时间:2019/1/14~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class SimpleActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 1.获取<data />标签对象
         SimpleActivityLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.simple_activity_layout);
        // 2.创建User对象
         User mUser=new User("小明","18",0);

        // 3.绑定到mUser到布局对象中
        binding.setUser(mUser);





    }



}
