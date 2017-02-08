package com.dbstar.myrxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout activity_main;
    private Button bt_myrxjava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        activity_main = (LinearLayout) findViewById(R.id.activity_main);
        bt_myrxjava = (Button) findViewById(R.id.bt_myrxjava);
        bt_myrxjava.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_myrxjava:
                //maptest();
                //maptest2();
                maptest3();
                break;
        }
    }

    private void maptest3() {
        
    }

    private void maptest2() {
        Observable<Integer> observable = Observable.just(110);
        //被观察者observable调用map方法进行转换，得到新的被观察者，observable2
        //新的被观察者 observable2  接收字符类型数据
        Observable<String> observable2 = observable.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) throws Exception {
                return integer.toString();
            }
        });
        //新的被观察者 observable2 注册观察者
        observable2.subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {

            }
        });
    }

    private void maptest() {
        //被观察者observable 接收整型数据110
        Observable<Integer> observable = Observable.just(110);
        //被观察者observable调用map方法进行转换，得到新的被观察者，observable2
        //新的被观察者 observable2  接收字符类型数据
        Observable<String> observable2 = observable.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) throws Exception {
                return integer.toString();
            }
        });
        //新的被观察者 observable2 注册观察者
        observable2.subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {

            }
        });


    }
}
