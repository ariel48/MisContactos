package com.aroejg.miscontactos.db;

import android.content.ContentValues;
import android.content.Context;

import com.aroejg.miscontactos.R;
import com.aroejg.miscontactos.pojo.Contacto;

import java.util.ArrayList;

public class ConstructorContactos {

    private static final int LIKE = 1;
    private Context context;

    public ConstructorContactos(Context context) {
        this.context = context;
    }

    public ArrayList<Contacto> obtenerDatos(){

        /*ArrayList<Contacto> contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto(R.drawable.auto, "Anahi Salgado", "77779999", "anahi@gmail.com", 5));
        contactos.add(new Contacto(R.drawable.bmw, "Pedro Sanchez", "88882222", , 3));
        contactos.add(new Contacto(R.drawable.ferrari, "Mireya Martinez", "333311111", "mireya@gmail.com", 8));
        contactos.add(new Contacto(R.drawable.maserati, "Juan Lopez", "44442222", "juan@gmail.com", 9));
        return  contactos;*/

        BaseDatos db = new BaseDatos(context);
        insertarTresContactos(db);
        return db.obtenerTodosLosContactos();

    }

    public void insertarTresContactos(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_NOMBRE, "Anahi Salgado");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_TELEFONO, "77779999");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_EMAIL, "anahi@gmail.com");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_FOTO, R.drawable.auto);

        db.insertarContacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_NOMBRE, "Pedro Sanchez");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_TELEFONO, "88882222");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_EMAIL, "pedro@gmail.com");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_FOTO, R.drawable.bmw);

        db.insertarContacto(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_NOMBRE, "Mireya Martinez");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_TELEFONO, "333311111");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_EMAIL, "mireya@gmail.com");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_FOTO, R.drawable.ferrari);

        db.insertarContacto(contentValues);
    }

    public void darLikeContacto(Contacto contacto){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_CONTACT_ID_CONTACTO, contacto.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_CONTACT_NUMERO_LIKES, LIKE);
        db.insertarLikeContacto(contentValues);
    }

    public int obtenerLikesContacto (Contacto contacto){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesContacto(contacto);

    }


}
