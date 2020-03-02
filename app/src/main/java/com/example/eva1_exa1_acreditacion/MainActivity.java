package com.example.eva1_exa1_acreditacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView etxt_acreditacion, etxt_calificacion, txt_resultado;
    private ProgressBar progressBar, progressBar2;
    private SeekBar seekbar_acreditacion, seekbar_calificacion;
    private int acre,cali;


    public MainActivity(){
        acre = 0;
        cali = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt_acreditacion = findViewById(R.id.etxt_acreditacion);
        progressBar =  findViewById(R.id.progressBar);
        seekbar_acreditacion = findViewById(R.id.seekbar_acreditacion);

        etxt_calificacion =  findViewById(R.id.etxt_calificacion);
        progressBar2 =  findViewById(R.id.progressBar2);
        seekbar_calificacion =  findViewById(R.id.seekbar_calificacion);

        txt_resultado =  findViewById(R.id.txt_resultado);

        seekbar_acreditacion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress1, boolean fromUser) {
                progressBar.setProgress(progress1);
                etxt_acreditacion.setText(""+progress1);
                acre = progress1;
                verificar(acre, cali);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekbar_calificacion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress2, boolean fromUser) {
                progressBar2.setProgress(progress2);
                etxt_calificacion.setText(""+progress2);
                cali = progress2;
                verificar(acre,cali);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void verificar(int acr, int cal){
        String text1 = "Acreditado!!!";
        String text2 = "No acreditado";

        if (acr <= cal) {
            txt_resultado.setText(text1);
        } else {
            txt_resultado.setText(text2);
        }
    }

}
