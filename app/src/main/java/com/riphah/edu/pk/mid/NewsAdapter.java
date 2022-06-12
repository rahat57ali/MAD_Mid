package com.riphah.edu.pk.mid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyHolderViews> {

    private Context context;
    private List<News> newsList;

    public NewsAdapter(Context context, List<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public MyHolderViews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.list_view, parent, false);
        return new MyHolderViews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolderViews holder, int position) {

        holder.id.setText(newsList.get(position).getId());
        holder.heading.setText(newsList.get(position).getHeading());
        holder.description.setText(newsList.get(position).getDescription());
        Glide.with(context).load(newsList.get(position).getUrl()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class MyHolderViews extends RecyclerView.ViewHolder {

        TextView id;
        TextView heading;
        TextView description;
        ImageView image;

        public MyHolderViews(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.tv_id);
            heading = itemView.findViewById(R.id.tv_heading);
            description = itemView.findViewById(R.id.tv_description);
            image = itemView.findViewById(R.id.imageView);
        }
    }
}
