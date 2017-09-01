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
    private ArrayList<Contact> model;

    public ListAdapter(Context context, ArrayList<Contact> modelo) {
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
        Contact c = model.get(position);
        holder.nome.setText(c.getName());
        holder.email.setText(c.getEmail());
    }

    @Override
    public int getItemCount() { return model.size(); }

    public class ListaViewHolder extends RecyclerView.ViewHolder {
        public ImageView profileImage;
        public TextView nome;
        public TextView email;


        public ListaViewHolder(View v) {
            super(v);

            profileImage = (ImageView) v.findViewById(R.id.imgProfile);
            nome = (TextView) v.findViewById(R.id.txtNome);
            email = (TextView) v.findViewById(R.id.txtEmail);
        }
    }
}
