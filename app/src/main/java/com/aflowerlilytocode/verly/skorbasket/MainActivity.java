package com.aflowerlilytocode.verly.skorbasket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int skorTimA,skorTimB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setSubtitle("AFlowerLilyToCode Studio");
    }

    public void tampilanSkorTimA(int skor){
        TextView lihatSkor = (TextView) findViewById(R.id.skorTimA);
        lihatSkor.setText(String.valueOf(skor));
    }

    public void skorTigaA(View v){
        skorTimA = skorTimA+3;
        tampilanSkorTimA(skorTimA);
    }

    public void skorDuaA(View v){
        skorTimA = skorTimA+2;
        tampilanSkorTimA(skorTimA);
    }

    public void skorSatuA(View v){
        skorTimA = skorTimA+1;
        tampilanSkorTimA(skorTimA);
    }

    public void tampilanSkorB(int skor){
        TextView skorB = (TextView) findViewById(R.id.skorTimB);
        skorB.setText(String.valueOf(skor));
    }

    public void skorTigaB(View view){
        skorTimB = skorTimB+3;
        tampilanSkorB(skorTimB);
    }

    public void skorDuaB(View view){
        skorTimB = skorTimB+2;
        tampilanSkorB(skorTimB);
    }

    public void skorSatuB(View view){
        skorTimB = skorTimB+1;
        tampilanSkorB(skorTimB);
    }

    public void resetBtn(View view){
        skorTimB = 0;
        skorTimA = 0;
        tampilanSkorB(skorTimB);
        tampilanSkorTimA(skorTimA);
    }


}
