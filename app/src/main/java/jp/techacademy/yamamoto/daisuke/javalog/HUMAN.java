package jp.techacademy.yamamoto.daisuke.javalog;

import android.util.Log;

/**
 * Created by d_yamamoto on 2017/12/01.
 */
class HUMAN extends Animal {
    // クラス変数
    static String to_jp = "私";

    // コンストラクタ
    public HUMAN(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これはクラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" );
    }
}