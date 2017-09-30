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


        RecyclerView lista = (RecyclerView) findViewById(R.id.lista);
        lista.setItemAnimator(new DefaultItemAnimator());
        lista.setLayoutManager(new LinearLayoutManager(this));

        ListAdapter adapter = new ListAdapter(this, model);
        lista.setAdapter(adapter);
    }


}
