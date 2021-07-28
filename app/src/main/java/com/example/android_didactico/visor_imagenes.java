package com.example.android_didactico;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class visor_imagenes extends AppCompatActivity {
    Button b1,b2;
    int contador=0;
    ImageView image;
    MediaPlayer a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagenes);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        image=findViewById(R.id.img_3);
        a1= MediaPlayer.create(this, R.raw.cerebro);
        a2= MediaPlayer.create(this, R.raw.corazon);
        a3= MediaPlayer.create(this, R.raw.estomago);
        a4= MediaPlayer.create(this, R.raw.higado);
        a5= MediaPlayer.create(this, R.raw.intestino);
        a6= MediaPlayer.create(this, R.raw.pancreas);
        a7= MediaPlayer.create(this, R.raw.rinones);
        a8= MediaPlayer.create(this, R.raw.pulmones);
        a9= MediaPlayer.create(this, R.raw.musculos);
        a10= MediaPlayer.create(this, R.raw.timo);
        a11= MediaPlayer.create(this, R.raw.bazo);
        a12= MediaPlayer.create(this, R.raw.ojos);
        a13= MediaPlayer.create(this, R.raw.oido);
        a14= MediaPlayer.create(this, R.raw.lengua);
        a15= MediaPlayer.create(this, R.raw.nariz);
        a16= MediaPlayer.create(this, R.raw.dientes);
        a17= MediaPlayer.create(this, R.raw.huesos);
        a18= MediaPlayer.create(this, R.raw.piel);
        a19= MediaPlayer.create(this, R.raw.cuerpo);
        a1.start();
    }
    public void onClick_2(View v) {
        switch(v.getId()) {
            case R.id.btn_1:
                //Contador1
                if (contador > 0) {
                    contador = contador - 1;
                    if (contador == 0) {
                        contador = contador + 19;
                    }
                } else if (contador == 0) {
                    contador = contador + 19;
                }
                //Contador1
                //switch
                switch (contador) {
                    case 1:
                        image.setImageResource(R.drawable.foto_1);
                        a1.start();

                        break;
                    case 2:
                        image.setImageResource(R.drawable.foto_2);
                        a2.start();
                        break;
                    case 3:
                        image.setImageResource(R.drawable.foto_3);
                        a3.start();
                        break;
                    case 4:
                        image.setImageResource(R.drawable.foto_4);
                        a4.start();
                        break;
                    case 5:
                        image.setImageResource(R.drawable.foto_5);
                        a5.start();
                        break;
                    case 6:
                        image.setImageResource(R.drawable.foto_6);
                        a6.start();
                        break;
                    case 7:
                        image.setImageResource(R.drawable.foto_7);
                        a7.start();
                        break;
                    case 8:
                        image.setImageResource(R.drawable.foto_8);
                        a8.start();
                        break;
                    case 9:
                        image.setImageResource(R.drawable.foto_9);
                        a9.start();
                        break;
                    case 10:
                        image.setImageResource(R.drawable.foto_10);
                        a10.start();
                        break;
                    case 11:
                        image.setImageResource(R.drawable.foto_11);
                        a11.start();
                        break;
                    case 12:
                        image.setImageResource(R.drawable.foto_12);
                        a12.start();
                        break;
                    case 13:
                        image.setImageResource(R.drawable.foto_13);
                        a13.start();
                        break;
                    case 14:
                        image.setImageResource(R.drawable.foto_14);
                        a14.start();
                        break;
                    case 15:
                        image.setImageResource(R.drawable.foto_15);
                        a15.start();
                        break;
                    case 16:
                        image.setImageResource(R.drawable.foto_16);
                        a16.start();
                        break;
                    case 17:
                        image.setImageResource(R.drawable.foto_17);
                        a17.start();
                        break;
                    case 18:
                        image.setImageResource(R.drawable.foto_18);
                        a18.start();
                        break;
                    case 19:
                        image.setImageResource(R.drawable.foto_19);
                        a19.start();
                        break;


                }
                //switch
                break;

            case R.id.btn_2:
                //Contador
                if(contador==0){
                    contador=contador+2;
                }
                else if (contador <20 ) {
                    contador = contador + 1;
                    if (contador == 20) {
                        contador = 1;
                    }
                }
                else if (contador ==20){
                    contador=1;
                }
                //Contador2
                //switch
                switch (contador){
                    case 1:
                        image.setImageResource(R.drawable.foto_1);
                        a1.start();

                        break;
                    case 2:
                        image.setImageResource(R.drawable.foto_2);
                        a2.start();
                        break;
                    case 3:
                        image.setImageResource(R.drawable.foto_3);
                        a3.start();
                        break;
                    case 4:
                        image.setImageResource(R.drawable.foto_4);
                        a4.start();
                        break;
                    case 5:
                        image.setImageResource(R.drawable.foto_5);
                        a5.start();
                        break;
                    case 6:
                        image.setImageResource(R.drawable.foto_6);
                        a6.start();
                        break;
                    case 7:
                        image.setImageResource(R.drawable.foto_7);
                        a7.start();
                        break;
                    case 8:
                        image.setImageResource(R.drawable.foto_8);
                        a8.start();
                        break;
                    case 9:
                        image.setImageResource(R.drawable.foto_9);
                        a9.start();
                        break;
                    case 10:
                        image.setImageResource(R.drawable.foto_10);
                        a10.start();
                        break;
                    case 11:
                        image.setImageResource(R.drawable.foto_11);
                        a11.start();
                        break;
                    case 12:
                        image.setImageResource(R.drawable.foto_12);
                        a12.start();
                        break;
                    case 13:
                        image.setImageResource(R.drawable.foto_13);
                        a13.start();
                        break;
                    case 14:
                        image.setImageResource(R.drawable.foto_14);
                        a14.start();
                        break;
                    case 15:
                        image.setImageResource(R.drawable.foto_15);
                        a15.start();
                        break;
                    case 16:
                        image.setImageResource(R.drawable.foto_16);
                        a16.start();
                        break;
                    case 17:
                        image.setImageResource(R.drawable.foto_17);
                        a17.start();
                        break;
                    case 18:
                        image.setImageResource(R.drawable.foto_18);
                        a18.start();
                        break;
                    case 19:
                        image.setImageResource(R.drawable.foto_19);
                        a19.start();
                        break;

                }
                //switch
                break;
        }
    }
}
