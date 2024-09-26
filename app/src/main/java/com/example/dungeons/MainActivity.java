package com.example.dungeons;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dungeons.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public int contador;
    public  int contador6;
    public int contador8;
    public int contador10;
    public int contador12;
    public int contador20;
    public int contador100;
    public int sumaT;
    ActivityMainBinding binding;
    public static final String VALOR_CONTADOR= "Valor del contador";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState != null) {
            contador = savedInstanceState.getInt(VALOR_CONTADOR);
            binding.numT.setText(String.valueOf(contador));
        } else {
            contador = 0;
        }
        contador = 0;
        //ACCIONES PARA DADO D4
        binding.d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                binding.numTiradas.setText(String.valueOf(contador));
                int resultado = (int) (Math.random() * 4) + 1;
                sumaT += resultado;
                resetResults();
                binding.numResultado.setText(String.valueOf(resultado));
                binding.numT.setText(String.valueOf(sumaT));

            }
        });
        //ACCIONES DADO D6
        binding.d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador6++;
                binding.numTiradas6.setText(String.valueOf(contador6));
                int resultado = (int) (Math.random() * 6) + 1;

                sumaT += resultado;
                resetResults();
                binding.numResultado6.setText(String.valueOf(resultado));
                binding.numT.setText(String.valueOf(sumaT));
            }
        });

        //ACCIONES DADO D8
        binding.D8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador8++;
                binding.numTir8.setText(String.valueOf(contador8));
                int resultado = (int) (Math.random() * 8) + 1;

                sumaT += resultado;
                resetResults();
                binding.numResult8.setText(String.valueOf(resultado));
                binding.numT.setText(String.valueOf(sumaT));

            }
        });

        //ACCIONES DADO D10
        binding.D10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador10++;
                binding.numTir10.setText(String.valueOf(contador10));
                int resultado = (int) (Math.random() * 10) + 1;

                sumaT += resultado;
                resetResults();
                binding.numResult10.setText(String.valueOf(resultado));
                binding.numT.setText(String.valueOf(sumaT));
            }
        });

        //ACCIONES DADO D12
        binding.D12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador12++;
                binding.numTir12.setText(String.valueOf(contador12));
                int resultado = (int) (Math.random() * 12) + 1;

                sumaT += resultado;
                resetResults();
                binding.numResult12.setText(String.valueOf(resultado));
                binding.numT.setText(String.valueOf(sumaT));
            }
        });

        //ACCIONES DADO D20
        binding.D20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador20++;
                binding.numTira20.setText(String.valueOf(contador20));
                int resultado = (int) (Math.random() * 20) + 1;

                sumaT += resultado;
                resetResults();
                binding.numResult20.setText(String.valueOf(resultado));
                binding.numT.setText(String.valueOf(sumaT));
            }
        });

        //ACCIONES DADO D100
        binding.D100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador100++;
                binding.numTir100.setText(String.valueOf(contador100));
                int resultado = (int) (Math.random() * 100) + 1;

                sumaT += resultado;
                resetResults();
                binding.numResult100.setText(String.valueOf(resultado));
                binding.numT.setText(String.valueOf(sumaT));
            }
        });


        //para borrar pulsando reset
        binding.Reset.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                contador=0;
                contador6=0;
                contador8=0;
                contador10=0;
                contador12=0;
                contador20=0;
                contador100=0;
                sumaT=0;
                resetResults();

                binding.numTiradas.setText(String.valueOf(contador));
                binding.numT.setText(String.valueOf(contador));

                binding.numResultado.setText("-");

                binding.numTiradas6.setText(String.valueOf(contador6));
                binding.numResultado6.setText("-");

                binding.numTir8.setText(String.valueOf(contador8));
                binding.numResult8.setText("-");

                binding.numTir10.setText(String.valueOf(contador10));
                binding.numResult10.setText("-");

                binding.numTir12.setText(String.valueOf(contador12));
                binding.numResult12.setText("-");

                binding.numTira20.setText(String.valueOf(contador20));
                binding.numResult20.setText("-");

                binding.numTir100.setText(String.valueOf(contador100));
                binding.numResult100.setText("-");

                binding.numT.setText(String.valueOf(sumaT));
            }
        });

    }

    private void resetResults() {
        binding.numResultado.setText("-");
        binding.numResultado6.setText("-");
        binding.numResult8.setText("-");
        binding.numResult10.setText("-");
        binding.numResult12.setText("-");
        binding.numResult20.setText("-");
        binding.numResult100.setText("-");
    }
    @Override
    protected void onSaveInstanceState( Bundle savedInstanceState) {
        savedInstanceState.putInt(VALOR_CONTADOR,contador);
        super.onSaveInstanceState(savedInstanceState);
    }
}