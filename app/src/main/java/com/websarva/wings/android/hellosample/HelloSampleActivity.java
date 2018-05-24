package com.websarva.wings.android.hellosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelloSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_sample);
    }

    /**
     * ボタンをクリックしたときのリスナクラス。
     */
    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
        }
    }
}
