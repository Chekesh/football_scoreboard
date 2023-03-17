package com.example.tablo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer mar=0;
    Integer fss=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("mar")){
            mar = savedInstanceState.getInt("mar");
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("fss")){
            fss = savedInstanceState.getInt("fss");
        }
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.textView1)).setText(mar.toString());
        ((TextView)findViewById(R.id.textView3)).setText(fss.toString());
    }

/*    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("mar")){
            mar = savedInstanceState.getInt("mar");
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("fss")){
            fss = savedInstanceState.getInt("fss");
        }
    }*/

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("mar", mar);
        outState.putInt("fss", fss);
    }

    public void onClickBtnAddMar(View view){
        mar=mar+1;
        TextView marView = (TextView)findViewById(R.id.textView1);
        marView.setText(mar.toString());

}

    public void onClickBtnAddfss(View view){
        fss=fss+1;
        ((TextView)findViewById(R.id.textView3)).setText(fss.toString());
    }

    public void onClickBtnAddDelete(View view){
        fss=0;
        mar=0;
        ((TextView)findViewById(R.id.textView1)).setText(mar.toString());
        ((TextView)findViewById(R.id.textView3)).setText(fss.toString());
    }

}