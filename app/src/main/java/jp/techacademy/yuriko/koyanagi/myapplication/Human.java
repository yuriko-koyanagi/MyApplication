package jp.techacademy.yuriko.koyanagi.myapplication;

import android.util.Log;

class Human extends Animal implements Thinkable {
    //  メンバ変数
    String hobby;  //  趣味

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。歳は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}