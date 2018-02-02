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
        // 测试提交：第一次提交
        // 测试提交：第二次提交
        // 测试提交：第 3 次提交
        // 测试提交：第 4 次提交
        // 测试提交：第 5 次提交
        // 测试提交：第 6 次提交
        // 测试提交：第 7 次提交
        // 测试提交：第 11 次提交
        // 测试提交：第 12 次提交
        // 测试提交：第 21 次提交
        // 测试提交：第 22 次提交
        // 测试提交：第 31 次提交
        // 测试提交：第 32 次提交
        // 测试提交：第 41 次提交
        // 测试提交：第 42 次提交
        // test commit 00 1
        // test commit 00 2
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
                //maptest3();
                maptest4();
                break;
        }
    }

    private void maptest4() {
        Observable<Integer> observable = Observable.just(110);
        //被观察者observable调用map方法进行转换，得到新的被观察者，observable2
        //新的被观察者 observable2  发送的是 Observable<User>类型，这个Integer 到 Observable<User>的转换
        //新的被观察者observable2 的发送数据Observable<User>，发送给观察者
        /*
        Observable<Observable<User>> observable2 = observable.map(new Function<Integer, Observable<User>>() {
            @Override
            public Observable<User> apply(Integer integer) throws Exception {
                return  Observable<User> 类型数据;
            }
        });
        */
    }

    private void maptest3() {
        Observable<Integer> observable = Observable.just(110);
        //被观察者observable调用map方法进行转换，得到新的被观察者，observable2
        //新的被观察者 observable2  发送的是 User类型，这个Integer 到 User的转换，实际上就是一次网络访问
        //网络访问的结果，作为新的被观察者observable2 的发送数据，发送给观察者，更新UI界面
        /*
        Observable<User> observable2 = observable.map(new Function<Integer, User>() {
            @Override
            public User apply(Integer integer) throws Exception {
                return api.getUserInfoWithPath(integer).excute().body();
            }
        });
        */
        //当然，其中的User是假设存在的，api也是假设存在的一个网络访问接口，网络访问得到的数据转换为User类型
        /*
        observable2.subscribe(new Consumer<User>() {
            @Override
            public void accept(User user) throws Exception {
                //根据网络访问到的数据User，更新ui等
            }
        });
        */
    }

    private void maptest2() {
        Observable<Integer> observable = Observable.just(110);
        //被观察者observable调用map方法进行转换，得到新的被观察者，observable2
        //新的被观察者 observable2  发送字符类型数据
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
        //新的被观察者 observable2  发送字符类型数据
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
