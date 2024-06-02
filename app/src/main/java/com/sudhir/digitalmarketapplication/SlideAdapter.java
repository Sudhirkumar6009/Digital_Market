package com.sudhir.digitalmarketapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SlideAdapter extends RecyclerView.Adapter<SlideAdapter.SliderviewHolder> {

    private List<SlideItem> slideItems;
    private ViewPager2 viewPager2;

    private OnImageClickListener imageClickListener;

    public interface OnImageClickListener {
        void onImageClick(int position);
    }

    public void setImageClickListener(OnImageClickListener listener) {
        this.imageClickListener = listener;
    }

    SlideAdapter(List<SlideItem> slideItems, ViewPager2 viewPager2) {
        this.slideItems = slideItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.slide_item_container,
                parent,
                false
        );
        return new SliderviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderviewHolder holder, int position) {
        holder.setImage(slideItems.get(position));
    }

    @Override
    public int getItemCount() {
        return slideItems.size();
    }

    class SliderviewHolder extends RecyclerView.ViewHolder {

        private RoundedImageView imageView;

        SliderviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewSlide);

            // Set click listener for the image
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imageClickListener != null) {
                        int position = getAbsoluteAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            imageClickListener.onImageClick(position);
                        }
                    }
                }
            });
        }

        void setImage(SlideItem slideItem) {
            imageView.setImageResource(slideItem.getImage());
        }
    }
}
