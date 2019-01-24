package com.vikrant.kalamquotes.AdapterClass;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vikrant.kalamquotes.Activities.ClickImage;
import com.vikrant.kalamquotes.Activities.KalamNotificationActivity;
import com.vikrant.kalamquotes.R;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {


        private List<Movie> moviesList;
        Context mContext;



        public class MyViewHolder extends RecyclerView.ViewHolder {

            private CardView cardview;

            public MyViewHolder(View view) {
                super(view);
                cardview=view.findViewById(R.id.cardview);





            }
        }
    // creating a CardView and assigning a value.

        public MoviesAdapter(List<Movie> moviesList) {
            this.moviesList = moviesList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.recycler, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Movie movie = moviesList.get(position);
            holder.cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(mContext,ClickImage.class);
                    mContext.startActivity(intent);
                }
            });





        }

        @Override
        public int getItemCount() {
            return moviesList.size();
        }
    }

