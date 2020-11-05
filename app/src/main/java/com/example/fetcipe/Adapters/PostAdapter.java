package com.example.fetcipe.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fetcipe.Models.Post;
import com.example.fetcipe.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    Context mContext;
    List<Post> mData;

    public PostAdapter(Context mContext,List<Post> mData) {
        this.mContext = mContext;
        this.mData=mData;
    }

    @NonNull
    @Override
    public PostAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View row= LayoutInflater.from(mContext).inflate(R.layout.row_post_item, false);
        return new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.MyViewHolder holder, int position) {

        holder.tvTitle.setText(mData.get(position).getTitle());
        Glide.with(mContext).load(mData.get(position).getPicture()).info(holder.imgPost);
        Glide.with(mContext).load(mData.get(position).getUserPhoto()).info(holder.imgPostProfile);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ImageView imgPost;
        ImageView imgPostProfile;

        public MyViewHolder(View itemView){
            super(itemView);

            tvTitle=itemView.findViewById(R.id.row_post_title);
            imgPost=itemView.findViewById(R.id.row_post_img);
            imgPostProfile=itemView.findViewById(R.id.row_post_profile_img);
        }
    }
}
