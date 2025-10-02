package com.example.colorpicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnMessageSendListener {

    FragmentManager fg;
    ColorViewModel colorsModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            fg = getSupportFragmentManager();
            FragmentTransaction trans = fg.beginTransaction();

            ColorPickFragment cg = new ColorPickFragment();
            trans.add(R.id.gridFragment, cg, "gridFrag");

            ColorListFragment cl = new ColorListFragment();
            trans.add(R.id.listFragment, cl, "listFrag");

            trans.commit();
        }
    }

    @Override
    public void onMessageSend(String message) {

    }
}