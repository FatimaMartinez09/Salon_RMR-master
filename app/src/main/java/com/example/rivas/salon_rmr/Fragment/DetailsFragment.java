package com.example.rivas.salon_rmr.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rivas.salon_rmr.Apputilities.BaseFragment;
import com.example.rivas.salon_rmr.Model.Item;
import com.example.rivas.salon_rmr.R;

public class DetailsFragment extends BaseFragment {

    TextView txtDetalleTitulo,txtDetalleNombre,txtDetalleDescripcion,txtDetallePrecio;
    ImageView imagDetalleItem;
    Button btnReservar;

    private Item item;
    View view;

    public void setItem(Item item) {
        this.item = item;
    }

    public DetailsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_details, container, false);

        txtDetalleTitulo = view.findViewById(R. id.textDetalleTitulo);
        txtDetalleNombre = view.findViewById(R. id.textDetalleNombre);
        txtDetalleDescripcion = view.findViewById(R. id.textDetalleDescripcion);
        txtDetallePrecio = view.findViewById(R. id.textDetallePrecio);
        imagDetalleItem = view.findViewById(R. id.imgDetalleItem);
        btnReservar = view.findViewById(R. id.btnReservar);

        if(item!=null){
            //txtDetalleTitulo.setText(item.ge);
            txtDetalleNombre.setText(item.getNombre());
            txtDetalleDescripcion.setText(item.getDescripcion());
            txtDetallePrecio.setText(item.getPrecio());
        }
        return view;


    }


}
