package com.aroejg.miscontactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.aroejg.miscontactos.adapter.ContactoAdaptador;
import com.aroejg.miscontactos.adapter.pageAdapter;
import com.aroejg.miscontactos.fragment.PerfilFragment;
import com.aroejg.miscontactos.fragment.RecyclerViewFragment;
import com.aroejg.miscontactos.pojo.Contacto;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar miActionBar =  findViewById(R.id.miActionBar);
        androidx.appcompat.widget.Toolbar toolbar = miActionBar;
        setSupportActionBar(toolbar);




        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();



       

    }


        private ArrayList<Fragment> agregarFragments (){
            ArrayList<Fragment> fragments = new ArrayList<>();

            fragments.add(new RecyclerViewFragment());
            fragments.add(new PerfilFragment());

            return  fragments;
        }

        private void setUpViewPager(){
            viewPager.setAdapter(new pageAdapter(getSupportFragmentManager(), agregarFragments()));
            tabLayout.setupWithViewPager(viewPager);

            tabLayout.getTabAt(0).setIcon(R.drawable.ic_contacts);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_actio_name);



        }




}
