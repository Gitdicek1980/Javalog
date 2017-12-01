package jp.techacademy.yamamoto.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HUMAN human = new HUMAN("テックアカデミー", 1);     // 名前をテックアカデミー、年齢1歳で、Humanのインスタンスを作る

        human.say();
        Log.d("javatest", "私の名前は" + human.name + "です。");
        Log.d("javatest", "私の年齢は" + human.age + "歳です。");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HUMAN human2 = new HUMAN() // 趣味をテックアカデミー　Humanのインスタンスを作る

        human.think();
        Log.d("javatest", "私は" + human.hobby + "ついて考える。");




    }

}