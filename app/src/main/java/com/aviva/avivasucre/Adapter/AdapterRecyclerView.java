package com.aviva.avivasucre.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aviva.avivasucre.Model.Picture;
import com.aviva.avivasucre.R;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public AdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity){
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.nombreUsuarioCard.setText(picture.getUserName());
        holder.primeroCard.setText(picture.getPrimero());
        holder.tiempoCard.setText(picture.getTiempo());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagenCard;
        private TextView nombreUsuarioCard;
        private TextView primeroCard;
        private TextView tiempoCard;


        public PictureViewHolder(View itemView) {
            super(itemView);

            imagenCard = (ImageView) itemView.findViewById(R.id.imagenCard);
            nombreUsuarioCard = (TextView) itemView.findViewById(R.id.nombreUsuarioCard);
            primeroCard = (TextView) itemView.findViewById(R.id.primeroCard);
            tiempoCard = (TextView) itemView.findViewById(R.id.tiempoCard);
        }
    }

}