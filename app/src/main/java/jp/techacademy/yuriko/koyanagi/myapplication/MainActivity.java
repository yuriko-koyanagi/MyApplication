package jp.techacademy.yuriko.koyanagi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ユリコ", 39, "プログラミング");     // humanのインスタンスを作る
        human.say();
        human.think();
    }
}