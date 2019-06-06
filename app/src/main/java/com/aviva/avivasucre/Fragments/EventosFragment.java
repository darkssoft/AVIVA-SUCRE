package com.aviva.avivasucre.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.aviva.avivasucre.MapsActivity;
import com.aviva.avivasucre.PrincipalActivity;
import com.aviva.avivasucre.R;
import com.github.clans.fab.FloatingActionMenu;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventosFragment extends Fragment {


    public EventosFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eventos, container, false);

        FloatingActionMenu actionMenuEventos = (FloatingActionMenu) view.findViewById(R.id.menuFloatingEventos);
        actionMenuEventos.setClosedOnTouchOutside(true);

        return view;
    }



}