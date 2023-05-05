package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Servicos extends AppCompatActivity {

    private Button btnPrestarServico, btnSolicitarServico;
    private PrestarServicoFragment prestarServicoFragment;
    private SolicitarServicosFragment solicitarServicosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnPrestarServico = findViewById(R.id.btnPrestarServico);
        btnSolicitarServico = findViewById(R.id.btnSolicitarServico);

        prestarServicoFragment = new PrestarServicoFragment();

        //Configurar Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, prestarServicoFragment);
        transaction.commit();
    }
}