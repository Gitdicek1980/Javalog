package jp.techacademy.yamamoto.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("テクオ", 1, "プログラミング");     // 名前をテックアカデミー、年齢1歳で、HUMANのインスタンスを作る

    }

}