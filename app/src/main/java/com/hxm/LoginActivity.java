package com.hxm;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.hxm.databinding.LoginActivityLayoutBinding;

/**
 * ********文件描述：********
 * ********作者：huleiyang********
 * ********创建时间：2019/12/6********
 * ********更改时间：2019/12/6********
 * ********版本号：1********
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        // 1.获取<data />标签对象
        LoginActivityLayoutBinding binding= DataBindingUtil.setContentView(this,R.layout.login_activity_layout);
        // 2.创建User对象
        User user = new User("胡小牧","26");
        // 3.绑定到user到布局对象中
        binding.setUser(user);
    }
}
