package com.websarva.wings.android.hellosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_sample);

        // 表示ボタンであるButtonオブジェクトを取得
        Button btClick = findViewById(R.id.btClick);
        // リスナクラスのインスタンスを作成
        HelloListener listener = new HelloListener();
        // 表示ボタンにリスナを設定
        btClick.sentOnClickListener(listener);

    }

    /**
     * ボタンをクリックしたときのリスナクラス。
     */
    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            // 名前入力欄であるEditTextオブジェクトを取得
            EditText input = findViewById(R.id.etName);
            //メッセージを表示するTextViewオブジェクトを取得
            TextView output = findViewById(R.id.tvOutput);
            //入力された名前文字列を取得
            String inputStr = input.getText().toString();
            //メッセージを表示
            output.setText(inputStr + "さん、こんにちは！");
        }
    }
}
