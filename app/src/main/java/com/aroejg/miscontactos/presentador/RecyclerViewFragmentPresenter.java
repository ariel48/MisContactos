package com.aroejg.miscontactos.presentador;

import android.content.Context;

import com.aroejg.miscontactos.db.ConstructorContactos;
import com.aroejg.miscontactos.fragment.IRecyclerViewFragment;
import com.aroejg.miscontactos.pojo.Contacto;

import java.util.ArrayList;

public class RecyclerViewFragmentPresenter implements iRecyclerViewFragmentPresenter{



    private IRecyclerViewFragment iRecyclerViewFragment;
    private Context context;
    private ConstructorContactos constructorContactos;
    private ArrayList <Contacto> contactos;


    public RecyclerViewFragmentPresenter(IRecyclerViewFragment iRecyclerViewFragment, Context context) {
        this.iRecyclerViewFragment = iRecyclerViewFragment;
        this.context = context;
        obtenerContactosBaseDatos();
    }

    @Override
    public void obtenerContactosBaseDatos() {
        constructorContactos = new ConstructorContactos(context);
        contactos = constructorContactos.obtenerDatos();
        mostrarContactosRV();
    }

    @Override
    public void mostrarContactosRV() {
        iRecyclerViewFragment.inicializarAdaptdorRV(iRecyclerViewFragment.crearAdaptador(contactos));
        iRecyclerViewFragment.generarLinearLayoutVertical();
    }
}
