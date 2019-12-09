package com.hxm;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.hxm.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity{
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setListener(new Listener());
        binding.setSkip(new Skip());
        binding.setLogin(new Login());
    }
    public class Listener{
        public void OnClick(View view){
            Toast.makeText(MainActivity.this, "第一个点击事件", Toast.LENGTH_SHORT).show();
        }
    }

    public class Skip{
        public void OnBtn(View view){
            startActivity(new Intent(MainActivity.this,DataActivity.class));
        }
    }

    public class Login{
        public void OnLogin(View view){
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        }
    }
}
