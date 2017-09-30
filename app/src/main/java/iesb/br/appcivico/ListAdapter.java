package iesb.br.appcivico;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListaViewHolder> {
    private Context context;
    private ArrayList<Estabelecimento> model;

    public ListAdapter(Context context, ArrayList<Estabelecimento> modelo) {
        this.context = context;
        this.model = modelo;
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_list_item, parent, false);
        return new ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {
        Estabelecimento e = model.get(position);
        holder.nomeCras.setText(e.getNomeCras());
        holder.endereco.setText(e.getEndereco());
        holder.cep.setText(e.getCep());
    }

    @Override
    public int getItemCount() { return model.size(); }

    public class ListaViewHolder extends RecyclerView.ViewHolder {
        public TextView nomeCras;
        public TextView endereco;
        public TextView cep;

        public ListaViewHolder(View v) {
            super(v);

            nomeCras = (TextView) v.findViewById(R.id.nomeCras);
            endereco = (TextView) v.findViewById(R.id.endereco);
            cep = (TextView) v.findViewById(R.id.cep);
        }
    }
}
