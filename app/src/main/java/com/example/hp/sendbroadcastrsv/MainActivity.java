package com.example.hp.sendbroadcastrsv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private String  MESSAGE_A="Xin chao A";
    private String MESSAGE_B="Xin chao sub B";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_send_a).setOnClickListener(this);
        findViewById(R.id.btn_send_b).setOnClickListener(this);
    }

    public void sendBroadcastA() {
        Intent intent=new Intent();
        intent.setAction(Constant.ACTION_A);
        intent.putExtra(Constant.KEY_MESSAGE_A, MESSAGE_A);
        sendBroadcast(intent);
    }

    public void sendBroadcastB() {
        Intent intent=new Intent();
        intent.setAction(Constant.ACTION_B);
        intent.putExtra(Constant.KEY_MESSAGE_B, MESSAGE_B);
        sendBroadcast(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_send_a:
                sendBroadcastA();
                break;
            case R.id.btn_send_b:
                sendBroadcastB();
                break;
            default:
                break;
        }
    }
}
