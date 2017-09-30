package iesb.br.appcivico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ArrayList<Estabelecimento> model = new ArrayList<Estabelecimento>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Estabelecimento c1 = new Estabelecimento();
        c1.setNomeCras("CRAS SANTOS DUMONT");
        c1.setEndereco("ADALBERTO BELLINI");
        c1.setCep("7152440");
        model.add(c1);

        Estabelecimento c2 = new Estabelecimento();
        c2.setNomeCras("CRAS Centro de Referencia de Assistencia Social");
        c2.setEndereco("Alberto dos Santos");
        c2.setCep("7152440");
        model.add(c2);

        Estabelecimento c3 = new Estabelecimento();
        c3.setNomeCras("CENTRO DE REFERENCIA DE ASSISTENCIA SOCIAL");
        c3.setEndereco("3818 ODIVAL MARGARIDO DOS SANTOS JARDIM ELDORADO 75");
        c3.setCep("7500000");
        model.add(c3);

        Estabelecimento c4 = new Estabelecimento();
        c4.setNomeCras("CRAS SANTA AMÉLIA");
        c4.setEndereco("ALBERTO SANTOS DUMONT");
        c4.setCep("86370000");
        model.add(c4);

        Estabelecimento c5 = new Estabelecimento();
        c5.setNomeCras("CRAS VILA NOVA");
        c5.setEndereco("Amâncio José da Silva");
        c5.setCep("79995000");
        model.add(c5);

        Estabelecimento c6 = new Estabelecimento();
        c6.setNomeCras("CENTRO DE REFERNCIA DE ASSISTENCIA SOCIAL DE TORRE DE PEDRA");
        c6.setEndereco("03 DE MARÇO");
        c6.setCep("18265000");
        model.add(c6);

        Estabelecimento c7 = new Estabelecimento();
        c7.setNomeCras("CRAS SALTENSE");
        c7.setEndereco("ACACIO RODRIGUES DE MORAES");
        c7.setCep("13327220");
        model.add(c7);

        Estabelecimento c8 = new Estabelecimento();
        c8.setNomeCras("CRAS ALTO DA PONTE");
        c8.setEndereco("ALZIRO LEBRÃ");
        c8.setCep("12212500");
        model.add(c8);

        Estabelecimento c9 = new Estabelecimento();
        c9.setNomeCras("CRAS - CENTRAL");
        c9.setEndereco("ALBERTO PINTO DE FARIA");
        c9.setCep("12282400");
        model.add(c9);

        Estabelecimento c10 = new Estabelecimento();
        c10.setNomeCras("CRAS CENTRO DE REFERÊNCIA DE ASSISTÊNCIA SOCIAL");
        c10.setEndereco("AGOSTINHO MOREIRA");
        c10.setCep("86780000");
        model.add(c10);


        RecyclerView lista = (RecyclerView) findViewById(R.id.lista);
        lista.setItemAnimator(new DefaultItemAnimator());
        lista.setLayoutManager(new LinearLayoutManager(this));

        ListAdapter adapter = new ListAdapter(this, model);
        lista.setAdapter(adapter);
    }


}
