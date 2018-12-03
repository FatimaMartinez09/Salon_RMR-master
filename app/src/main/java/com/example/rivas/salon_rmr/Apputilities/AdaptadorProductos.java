package com.example.rivas.salon_rmr.Apputilities;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rivas.salon_rmr.Fragment.DetailsFragment;
import com.example.rivas.salon_rmr.Fragment.FragmentProductoGenerico;
import com.example.rivas.salon_rmr.Model.Item;
import com.example.rivas.salon_rmr.R;

import java.util.ArrayList;

public class AdaptadorProductos extends RecyclerView.Adapter<AdaptadorProductos.ViewHolder> {

    private ArrayList<Item> list = new ArrayList<>();
    private Context context;
    private FragmentManager fragmentManager;

    public void setFragmentManager(FragmentManager manager){
        fragmentManager = manager;
    }

    public AdaptadorProductos(ArrayList<Item> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_producto, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item p = list.get(position);

        //TODO implementar imagenes
        if(p.getId().equals("8")){
            holder.imgProducto.setImageResource(R.drawable.joyeria2);
        }
        holder.txtNombreProducto.setText(p.getNombre());
        holder.txtPrecioProducto.setText(p.getPrecio());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgProducto;
        private TextView txtNombreProducto;
        private TextView txtPrecioProducto;
        private CardView cardviewItemProducto;


        public ViewHolder(View itemView) {
            super(itemView);
            imgProducto         = itemView.findViewById(R.id.imgProductoItem);
            txtNombreProducto   = itemView.findViewById(R.id.txtNombreProductoItem);
            txtPrecioProducto   = itemView.findViewById(R.id.txtPrecioProductoItem);
            cardviewItemProducto =itemView.findViewById(R.id.cardItemProducto);
        }
    }
}
