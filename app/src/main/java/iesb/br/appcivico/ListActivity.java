package iesb.br.appcivico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ArrayList<Contact> model = new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Contact c1 = new Contact();
        c1.setName("David Leandro");
        c1.setEmail("david@webredonda.com.br");
        model.add(c1);

        Contact c2 = new Contact();
        c2.setName("Tom");
        c2.setEmail("tom@gmail.com");
        model.add(c2);

        Contact c3 = new Contact();
        c3.setName("Rafael");
        c3.setEmail("rafael@gmail.com");
        model.add(c3);


        RecyclerView lista = (RecyclerView) findViewById(R.id.lista);
        lista.setItemAnimator(new DefaultItemAnimator());
        lista.setLayoutManager(new LinearLayoutManager(this));

        ListAdapter adapter = new ListAdapter(this, model);
        lista.setAdapter(adapter);
    }


}
