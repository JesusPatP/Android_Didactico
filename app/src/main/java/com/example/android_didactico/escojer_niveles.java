package com.example.android_didactico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class escojer_niveles extends AppCompatActivity {
    Intent intent;
    public static int nivel_v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escojer_niveles);

    }

    public void onClick_e(View v) {

        switch(v.getId()){
            case R.id.c_1:
                nivel_v=1;
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;

            case R.id.c_2:
                nivel_v=2;
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;
            case R.id.c_3:
                nivel_v=3;
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;

            case R.id.c_4:
                nivel_v=4;
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;
            case R.id.c_5:
                nivel_v=5;
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;

            case R.id.c_6:
                nivel_v=6;
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;
            case R.id.c_7:
                nivel_v=7;
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;

            case R.id.c_8:
                nivel_v=8;
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;

        }
    }

}
