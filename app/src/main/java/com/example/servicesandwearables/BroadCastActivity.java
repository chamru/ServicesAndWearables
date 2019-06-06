package com.example.servicesandwearables;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BroadCastActivity extends AppCompatActivity {

    BroadcastReceiverExample broadcastReceiverExample = new BroadcastReceiverExample();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast);
    }


    protected void onStart(){
        super.onStart();

        IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(broadcastReceiverExample,intentFilter);
    }

    protected void onStop(){
        super.onStop();

        unregisterReceiver(broadcastReceiverExample);
    }


}
