package jp.techacademy.yamamoto.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HUMAN human = new HUMAN("テクオ", 1, "プログラミング");     // 名前をテックアカデミー、年齢1歳で、HUMANのインスタンスを作る

        human.say();
        Log.d("javatest", "私の名前は" + human.name + "です。"+ "私の年齢は" + human.age + "歳です。");

        human.think();
        Log.d("javatest", "私は" + human.hobby + "ついて考える。");


    }

}