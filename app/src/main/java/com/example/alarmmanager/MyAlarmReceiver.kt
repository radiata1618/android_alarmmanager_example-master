package com.example.alarmmanager

import android.widget.Toast
import android.content.Intent
import android.content.BroadcastReceiver
import android.content.Context
import android.util.Log


class MyAlarmReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d("MyApp", "通りました222")
        Toast.makeText(context, "Alarm Triggered", Toast.LENGTH_LONG).show()
    }
}