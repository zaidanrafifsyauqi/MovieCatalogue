package com.example.submissionexpt;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFlimAdapter extends RecyclerView.Adapter<ListFlimAdapter.ListViewHolder> {
    private ArrayList<Flim> listFlim;

    public ListFlimAdapter(ArrayList<Flim> list) {
        this.listFlim = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_film, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Flim flim = listFlim.get(position);


        Glide.with(holder.itemView.getContext())
                .load(flim.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(flim.getName());
        holder.tvDetail.setText(flim.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(view.getContext(), DetailActivity.class);
                moveIntent.putExtra("flim", listFlim.get(position));
                view.getContext().startActivity(moveIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFlim.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);

            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}