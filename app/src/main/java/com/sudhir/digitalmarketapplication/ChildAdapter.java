package com.sudhir.digitalmarketapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.sudhir.digitalmarketapplication.HorizontalActivities.AccessoriesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.FridgeActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.W_MActivity;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {

    List<ChildModelClass> childModelClassList;
    Context context;

    public ChildAdapter(List<ChildModelClass> childModelClassList, Context context) {
        this.childModelClassList = childModelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChildAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.horizonatal_products_rv_child,null,false);
            return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapter.ViewHolder holder, int position) {
        holder.img_child_top.setImageResource(childModelClassList.get(position).image);
        holder.txt_child_top.setText(childModelClassList.get(position).product_name);
        ChildModelClass childModelClass = childModelClassList.get(position);
        holder.cardView_horizntl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                        Intent laptop_Activity = new Intent(context, LaptopsActivity.class);
                        context.startActivity(laptop_Activity);
                        break;
                    case 1:
                        Intent tv_Activity = new Intent(context, TelevisionActivity.class);
                        context.startActivity(tv_Activity);
                        break;
                    case 2:
                        Intent mobile_Activity = new Intent(context, MobilesActivity.class);
                        context.startActivity(mobile_Activity);
                        break;
                    case 3:
                        Intent fridge_Activity = new Intent(context, FridgeActivity.class);
                        context.startActivity(fridge_Activity);
                        break;
                    case 4:
                        Intent w_machine_Activity = new Intent(context, W_MActivity.class);
                        context.startActivity(w_machine_Activity);
                        break;
                    case 5:
                        Intent accessories_Activity = new Intent(context, AccessoriesActivity.class);
                        context.startActivity(accessories_Activity);
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return childModelClassList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img_child_top;
        TextView txt_child_top;
        CardView cardView_horizntl;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_child_top = itemView.findViewById(R.id.img_child_top);
            txt_child_top = itemView.findViewById(R.id.txt_child_top);
            cardView_horizntl = itemView.findViewById(R.id.cv_child_top);
        }
    }
}
