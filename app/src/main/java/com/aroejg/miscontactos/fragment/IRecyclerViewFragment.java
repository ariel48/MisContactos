package com.aroejg.miscontactos.fragment;

import com.aroejg.miscontactos.adapter.ContactoAdaptador;
import com.aroejg.miscontactos.pojo.Contacto;

import java.util.ArrayList;

public interface IRecyclerViewFragment {

    public void generarLinearLayoutVertical();

    public ContactoAdaptador crearAdaptador (ArrayList <Contacto> contactos);

    public void inicializarAdaptdorRV(ContactoAdaptador adaptador);

}
