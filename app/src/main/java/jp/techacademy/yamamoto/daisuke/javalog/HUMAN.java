package jp.techacademy.yamamoto.daisuke.javalog;

import android.util.Log;

/**
 * Created by d_yamamoto on 2017/12/01.
 */
class HUMAN extends Animal implements Thinkable{

    // クラス変数
    static String to_jp = "私";

    // コンストラクタ
    public HUMAN(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これはクラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" );

    }

    @Override
    public void think(){

    }
}

