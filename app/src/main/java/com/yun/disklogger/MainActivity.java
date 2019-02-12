package com.yun.disklogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yun.logger.ServiceLogger;
import com.yun.logger.ServiceLoggerBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceLogger serviceLogger = ServiceLoggerBuilder.build().logFolder("winbox/crash").catchCrash(true)
                .print(true)
                .outPut(true)
                .printStack(true)
                .getServiceLogger();
        serviceLogger.log("业务日志");
    }
}
