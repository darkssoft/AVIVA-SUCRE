package com.aviva.avivasucre.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aviva.avivasucre.Adapter.AdapterRecyclerView;
import com.aviva.avivasucre.Model.Picture;
import com.aviva.avivasucre.R;
import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;

public class NoticiasFragment extends Fragment {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    public NoticiasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noticias, container, false);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        AdapterRecyclerView adapterRecyclerView = new AdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(adapterRecyclerView);

        FloatingActionMenu actionMenuNoticias = (FloatingActionMenu) view.findViewById(R.id.menuFloatingNoticias);
        actionMenuNoticias.setClosedOnTouchOutside(true);



        return view;
    }
    /**
    public void (View view){

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if(intent.resolveActivity(getActivity().getPackageManager()) != null){
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }

    }



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
         if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == getActivity().RESULT_OK){

         }
    }
    */

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://novalandtours.com/images/guide/guilin.jpg","Kevin Medrano", "Hace", "3 dias"));
        pictures.add(new Picture("https://www.google.com/search?q=sucre&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiNwOyqus7hAhXlxlkKHbnIB00Q_AUIDigB&biw=1366&bih=625#imgrc=-vBDCQcjQmz9tM:", "Jaime Nina", "Hace", "7 dias"));
        pictures.add(new Picture("https://novalandtours.com/images/guide/guilin.jpg","Javier Rodriguez", "Hace", "12 dias"));
        pictures.add(new Picture("https://novalandtours.com/images/guide/guilin.jpg","Apollo Creed", "Hace", "1 hora"));
        pictures.add(new Picture("https://novalandtours.com/images/guide/guilin.jpg","Ricardo Milos", "Hace", "2 horas"));
        return pictures;
    }

}