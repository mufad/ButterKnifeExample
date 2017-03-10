package com.droiddigger.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {


    //---Binding our views with the variable--\\
    @Bind(R.id.error)
    Button error;
    @Bind(R.id.success)
    Button success;
    @Bind(R.id.info)
    Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--Don't miss this line out--\\
        ButterKnife.bind(this);
    }

    //--Binding the methods with the id--\\
    @OnClick(R.id.success)
    public void success(){
        Toasty.success(this, "Successful Toast", Toast.LENGTH_SHORT, true).show();
    }

    @OnClick(R.id.error)
    public void error(){
        Toasty.error(this, "Error Toast", Toast.LENGTH_SHORT, true).show();
    }

    @OnClick(R.id.info)
    public void info(){
        Toasty.info(this, "Info Toast", Toast.LENGTH_SHORT, true).show();
    }
}
