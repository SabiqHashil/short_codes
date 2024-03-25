// Radio Button (Write a Program to Select gender using radio button)

package com.example.radio;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
    Button btn;
    RadioGroup rdg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button1);
        rdg = (RadioGroup) findViewById(R.id.radioGroup1);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                int selectId = rdg.getCheckedRadioButtonId();
                RadioButton rdb = (RadioButton) findViewById(selectId);
                Toast.makeText(MainActivity.this,
                        rdb.getText(), 500).show();
            }
        });
    }
}
