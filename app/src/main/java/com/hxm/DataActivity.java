package com.hxm;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.hxm.databinding.DataActivityLayoutBinding;

import java.net.URL;

/**
 * ********文件描述：********
 * ********作者：huleiyang********
 * ********创建时间：2019/12/6********
 * ********更改时间：2019/12/6********
 * ********版本号：1********
 */
public class DataActivity extends AppCompatActivity{

    DataActivityLayoutBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 1.获取<data />标签对象
         binding = DataBindingUtil.setContentView(this,R.layout.data_activity_layout);
        // 2.创建Item对象
        Item item = new Item("父亲的背景","散文","我与父亲不相见已二年余了，我最不能忘记的是他的背影", "https://img.52z.com/upload/news/image/20180621/20180621055651_47663.jpg",R.mipmap.ele);
        // 3.绑定到mUser到布局对象中
        binding.setItem(item);



    }



}
