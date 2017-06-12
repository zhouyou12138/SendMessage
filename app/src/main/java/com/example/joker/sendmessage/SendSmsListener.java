package com.example.joker.sendmessage;

import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Joker on 2017/6/12.
 */

public class SendSmsListener implements View.OnLongClickListener{
    private MainActivity mact;
    private EditText address;
    private EditText content;

    public SendSmsListener(MainActivity mact, EditText address, EditText content) {
        this.mact = mact;
        this.address = address;
        this.content = content;
    }

    @Override
    public boolean onLongClick(View view) {
        String addressStr = address.getText().toString();
        String contentStr = content.getText().toString();
        SmsManager smsManager = SmsManager.getDefault(); //获取短信管理器
        PendingIntent sentIntent = PendingIntent.getBroadcast(mact, 0, new Intent(), 0);//创建发送短信的PendingIntent
        smsManager.sendTextMessage(addressStr,null,contentStr,sentIntent,null);//发送文本短信
        Toast.makeText(mact, "短信发送完成", Toast.LENGTH_SHORT).show();
        return false;
    }
}

