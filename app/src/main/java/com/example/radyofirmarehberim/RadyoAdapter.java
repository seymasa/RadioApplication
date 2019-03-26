package com.example.radyofirmarehberim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RadyoAdapter extends RecyclerView.Adapter<RadyoAdapter.MyViewHolder> {

    ArrayList<Radyo> mRadyoList;
    LayoutInflater inflater;

    public RadyoAdapter(Context context, ArrayList<Radyo> radios){
        inflater = LayoutInflater.from(context);
        this.mRadyoList = radios;
    }


    @NonNull
    @Override
    public RadyoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = inflater.inflate(R.layout.item_card,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Radyo selectedRadio = mRadyoList.get(position);
        holder.setData(selectedRadio,position);
    }

    @Override
    public int getItemCount() {
        return mRadyoList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView radyoName;
        ImageView radyoImage, likedImage;
        Boolean like;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            radyoName  = itemView.findViewById(R.id.radioName);
            radyoImage = itemView.findViewById(R.id.radyoImage);
            likedImage = itemView.findViewById(R.id.likedImage);
            likedImage.setOnClickListener(this);
        }

        public void setData(Radyo selectedRadyo, int position) {
            this.radyoName.setText(selectedRadyo.getRadyoName());
            this.radyoImage.setImageResource(selectedRadyo.getImageID());
            this.likedImage.setImageResource(R.drawable.unliked); // veri tabanından alınması daha mantıklı her açtıgımda siyah gelmez daha önce ne sectiysem o gelir hiç değilse.
            like = false;
        }

        @Override
        public void onClick(View v) {
            if ( like == false)
            {
                likedImage.setImageResource(R.drawable.liked);
                like = true;
            }
            else if (like == true){
                likedImage.setImageResource(R.drawable.unliked);
                like = false;
            }
        }
    }

}
