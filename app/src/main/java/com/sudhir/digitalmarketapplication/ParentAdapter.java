package com.sudhir.digitalmarketapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.sudhir.digitalmarketapplication.DiscountProducts.DiscountCPUActivity;
import com.sudhir.digitalmarketapplication.DiscountProducts.DiscountEarbudsActivity;
import com.sudhir.digitalmarketapplication.DiscountProducts.DiscountFridgeActivity;
import com.sudhir.digitalmarketapplication.DiscountProducts.DiscountLaptopsActivity;
import com.sudhir.digitalmarketapplication.DiscountProducts.DiscountMobileActivity;
import com.sudhir.digitalmarketapplication.DiscountProducts.DiscountSpeakersActivity;
import com.sudhir.digitalmarketapplication.DiscountProducts.DiscountTvActivity;
import com.sudhir.digitalmarketapplication.DiscountProducts.DiscountWMActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.FridgeActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesActivity;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ViewHolder> {

    List<ParentModelClass> parentModelClassList;
    // Inside your activity or fragment

    Context context;

    public ParentAdapter(List<ParentModelClass> parentModelClassList, Context context) {
        this.parentModelClassList = parentModelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public ParentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.horizontl_rv_parent_mainpage,null,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StorageReference storageReference = FirebaseStorage.getInstance().getReference();

        // Database Coding

        StorageReference imageRef_1_1 = storageReference.child("Main_Page_Discounts/Products/discount_img_laptop.png");
        imageRef_1_1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                updateImageViewWithProgress(
                        holder.imageView_laptop_img,
                        holder.laptop_discount_progressbar,
                        uri
                );
            }
        });

        StorageReference imageRef_1_2 = storageReference.child("Main_Page_Discounts/Logos/lenovo_logo.jpg");
        imageRef_1_2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_laptop_logo);
            }
        });
        StorageReference imageRef_1_3 = storageReference.child("Main_Page_Discounts/Labels/laptop_discount.png");
        imageRef_1_3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_laptop_label);
            }
        });

        StorageReference imageRef_2_1 = storageReference.child("Main_Page_Discounts/Products/discount_img_tv.jpg");
        imageRef_2_1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                updateImageViewWithProgress(
                        holder.imageView_tv_img,
                        holder.tv_discount_progressbar,
                        uri
                );
            }
        });
        StorageReference imageRef_2_2 = storageReference.child("Main_Page_Discounts/Logos/samsung_logo.png");
        imageRef_2_2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_tv_logo);
            }
        });
        StorageReference imageRef_2_3 = storageReference.child("Main_Page_Discounts/Labels/tv_discount.png");
        imageRef_2_3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_tv_label);
            }
        });

        StorageReference imageRef_3_1 = storageReference.child("Main_Page_Discounts/Products/discount_img_mobile.jpg");
        imageRef_3_1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                updateImageViewWithProgress(
                        holder.imageView_mobile_img,
                        holder.mobile_discount_progressbar,
                        uri
                );
            }
        });
        StorageReference imageRef_3_2 = storageReference.child("Main_Page_Discounts/Logos/oppo_logo.png");
        imageRef_3_2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_mobile_logo);
            }
        });
        StorageReference imageRef_3_3 = storageReference.child("Main_Page_Discounts/Labels/mobile_discount.png");
        imageRef_3_3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_mobile_label);
            }
        });

        StorageReference imageRef_4_1 = storageReference.child("Main_Page_Discounts/Products/discount_img_fridge.jpg");
        imageRef_4_1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                updateImageViewWithProgress(
                        holder.imageView_fridge_img,
                        holder.frige_discount_progressbar,
                        uri
                );
            }
        });
        StorageReference imageRef_4_2 = storageReference.child("Main_Page_Discounts/Logos/godrej_logo.png");
        imageRef_4_2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_fridge_logo);
            }
        });
        StorageReference imageRef_4_3 = storageReference.child("Main_Page_Discounts/Labels/fridge_discount.png");
        imageRef_4_3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_fridge_label);
            }
        });

        StorageReference imageRef_5_1 = storageReference.child("Main_Page_Discounts/Products/discount_img_w_m.jpg");
        imageRef_5_1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                updateImageViewWithProgress(
                        holder.imageView_w_m_img,
                        holder.w_m_discount_progressbar,
                        uri
                );
            }
        });
        StorageReference imageRef_5_2 = storageReference.child("Main_Page_Discounts/Logos/lg_logo.png");
        imageRef_5_2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_w_m_logo);
            }
        });
        StorageReference imageRef_5_3 = storageReference.child("Main_Page_Discounts/Labels/w_m_discount.png");
        imageRef_5_3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_w_m_label);
            }
        });

        StorageReference imageRef_6_1 = storageReference.child("Main_Page_Discounts/Products/discount_img_earbuds.jpg");
        imageRef_6_1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                updateImageViewWithProgress(
                        holder.imageView_earbuds_img,
                        holder.earbuds_discount_progressbar,
                        uri
                );
            }
        });
        StorageReference imageRef_6_2 = storageReference.child("Main_Page_Discounts/Logos/boat_logo.png");
        imageRef_6_2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_earbuds_logo);
            }
        });
        StorageReference imageRef_6_3 = storageReference.child("Main_Page_Discounts/Labels/earbuds_discount.png");
        imageRef_6_3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_earbuds_label);
            }
        });

        StorageReference imageRef_7_1 = storageReference.child("Main_Page_Discounts/Products/discount_img_cpu.jpg");
        imageRef_7_1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                updateImageViewWithProgress(
                        holder.imageView_cpu_img,
                        holder.cpu_discount_progressbar,
                        uri
                );
            }
        });
        StorageReference imageRef_7_2 = storageReference.child("Main_Page_Discounts/Logos/hp_logo.png");
        imageRef_7_2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_cpu_logo);
            }
        });
        StorageReference imageRef_7_3 = storageReference.child("Main_Page_Discounts/Labels/cpu_discount.png");
        imageRef_7_3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_cpu_label);
            }
        });

        StorageReference imageRef_8_1 = storageReference.child("Main_Page_Discounts/Products/discount_img_speaker.jpg");
        imageRef_8_1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                updateImageViewWithProgress(
                        holder.imageView_speaker_img,
                        holder.speaker_discount_progressbar,
                        uri
                );
            }
        });
        StorageReference imageRef_8_2 = storageReference.child("Main_Page_Discounts/Logos/philips_logo.png");
        imageRef_8_2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_speaker_logo);
            }
        });
        StorageReference imageRef_8_3 = storageReference.child("Main_Page_Discounts/Labels/speakers_discount.png");
        imageRef_8_3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(holder.imageView_speaker_label);
            }
        });



        // Database Coding

        holder.cv_discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DiscountLaptopsActivity.class));
            }
        });
        holder.tv_discount_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DiscountTvActivity.class));
            }
        });
        holder.mobile_discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DiscountMobileActivity.class));
            }
        });
        holder.fridge_discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DiscountFridgeActivity.class));
            }
        });
        holder.w_m_discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DiscountWMActivity.class));
            }
        });
        holder.earbuds_discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DiscountEarbudsActivity.class));
            }
        });
        holder.cpu_discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DiscountCPUActivity.class));
            }
        });
        holder.speakers_discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DiscountSpeakersActivity.class));
            }
        });
        ChildAdapter childAdapter;
        childAdapter = new ChildAdapter(parentModelClassList.   get(position).childModelClassList,context);
        holder.rv_child.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.rv_child.setAdapter(childAdapter);
        childAdapter.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return parentModelClassList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ViewPager2 viewPager2;
        RecyclerView    rv_child;
        TextView tv_horizontal_title_top;
        CardView cv_discount;
        CardView tv_discount_cv;
        CardView mobile_discount;
        CardView fridge_discount;
        CardView w_m_discount;
        CardView earbuds_discount;
        CardView cpu_discount;
        CardView speakers_discount;
        ProgressBar laptop_discount_progressbar,tv_discount_progressbar,mobile_discount_progressbar,frige_discount_progressbar,w_m_discount_progressbar,earbuds_discount_progressbar,cpu_discount_progressbar,speaker_discount_progressbar;
        ImageView imageView_laptop_img,imageView_laptop_logo,imageView_laptop_label;
        ImageView imageView_tv_img,imageView_tv_logo,imageView_tv_label;
        ImageView imageView_mobile_img,imageView_mobile_logo,imageView_mobile_label;
        ImageView imageView_fridge_img,imageView_fridge_logo,imageView_fridge_label;
        ImageView imageView_w_m_img,imageView_w_m_logo,imageView_w_m_label;
        ImageView imageView_earbuds_img,imageView_earbuds_logo,imageView_earbuds_label;
        ImageView imageView_cpu_img,imageView_cpu_logo,imageView_cpu_label;
        ImageView imageView_speaker_img,imageView_speaker_logo,imageView_speaker_label;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // Inside your activity or fragment
            ViewPager2 viewPager2 = itemView.findViewById(R.id.viewPagerImageSlider);
            WormDotsIndicator dotsIndicator = itemView.findViewById(R.id.dots_indicator);

            List<SlideItem> slideItems = new ArrayList<>();
            slideItems.add(new SlideItem(R.drawable.img_8));
            slideItems.add(new SlideItem(R.drawable.img_9));
            slideItems.add(new SlideItem(R.drawable.img_10));
            slideItems.add(new SlideItem(R.drawable.img_11));
            slideItems.add(new SlideItem(R.drawable.img_12));

            SlideAdapter slideAdapter = new SlideAdapter(slideItems, viewPager2);
            viewPager2.setAdapter(slideAdapter);
            dotsIndicator.setViewPager2(viewPager2);

            viewPager2.setClipToPadding(false);
            viewPager2.setClipChildren(false);
            viewPager2.setOffscreenPageLimit(3);
            viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

            CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
            compositePageTransformer.addTransformer(new MarginPageTransformer(40));
            compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
                @Override
                public void transformPage(@NonNull View page, float position) {
                    float r = 1 - Math.abs(position);
                    page.setScaleY(0.85f + r + 0.15f);
                }
            });
            viewPager2.setPageTransformer(compositePageTransformer);

            Handler handler = new Handler();
            Runnable sliderItems = new Runnable() {
                @Override
                public void run() {
                    int currentItem = viewPager2.getCurrentItem();
                    int nextItem = currentItem + 1;
                    if (nextItem >= slideItems.size()) {
                        nextItem = 0; // Reset to the first item for infinite loop
                    }
                    viewPager2.setCurrentItem(nextItem);
                    handler.postDelayed(this, 2000); // Auto-slide every 2 seconds
                }
            };
            handler.postDelayed(sliderItems, 2000);
            slideAdapter.setImageClickListener(new SlideAdapter.OnImageClickListener() {
                @Override
                public void onImageClick(int position) {
                    // Handle image click event based on position
                    // You can use a switch case or if-else statements here
                    switch (position) {
                        case 0:
                            itemView.getContext().startActivity(new Intent(itemView.getContext(), DiscountLaptopsActivity.class));
                            break;
                        case 1:
                            itemView.getContext().startActivity(new Intent(itemView.getContext(), DiscountTvActivity.class));
                            break;
                        case 2:
                            itemView.getContext().startActivity(new Intent(itemView.getContext(), DiscountMobileActivity.class));
                            break;
                        case 3:
                            itemView.getContext().startActivity(new Intent(itemView.getContext(), DiscountWMActivity.class));
                            break;
                        case 4:
                            itemView.getContext().startActivity(new Intent(itemView.getContext(), DiscountSpeakersActivity.class));
                            break;
                    }
                }
            });

            //ProgressBar

            laptop_discount_progressbar = itemView.findViewById(R.id.laptop_discount_progressbar);
            mobile_discount_progressbar = itemView.findViewById(R.id.mobile_discount_progressbar);
            tv_discount_progressbar = itemView.findViewById(R.id.tv_discount_progressbar);
            frige_discount_progressbar = itemView.findViewById(R.id.frige_discount_progressbar);
            w_m_discount_progressbar = itemView.findViewById(R.id.w_m_discount_progressbar);
            earbuds_discount_progressbar = itemView.findViewById(R.id.earbuds_discount_progressbar);
            cpu_discount_progressbar = itemView.findViewById(R.id.cpu_discount_progressbar);
            speaker_discount_progressbar = itemView.findViewById(R.id.speaker_discount_progressbar);

            //ProgressBar

            rv_child = itemView.findViewById(R.id.horizontl_rv_child);
            cv_discount = itemView.findViewById(R.id.laptop_discount);
            tv_discount_cv = itemView.findViewById(R.id.tv_discount_cv);
            mobile_discount = itemView.findViewById(R.id.mobile_discount);
            fridge_discount = itemView.findViewById(R.id.fridge_discount);
            w_m_discount = itemView.findViewById(R.id.w_m_discount);
            earbuds_discount = itemView.findViewById(R.id.earbuds_discount);
            cpu_discount = itemView.findViewById(R.id.cpu_discount);
            speakers_discount = itemView.findViewById(R.id.speakers_discount);

            // Database calling 1
            imageView_laptop_img = itemView.findViewById(R.id.laptop_discount_img);
            imageView_laptop_logo = itemView.findViewById(R.id.laptop_discount_img_logo);
            imageView_laptop_label = itemView.findViewById(R.id.laptop_discount_img_label);
            // Database calling 2
            imageView_tv_img = itemView.findViewById(R.id.tv_discount_img);
            imageView_tv_logo = itemView.findViewById(R.id.tv_discount_img_logo);
            imageView_tv_label = itemView.findViewById(R.id.tv_discount_img_label);
            // Database calling 3
            imageView_mobile_img = itemView.findViewById(R.id.mobile_discount_img);
            imageView_mobile_logo = itemView.findViewById(R.id.mobile_discount_img_logo);
            imageView_mobile_label = itemView.findViewById(R.id.mobile_discount_img_label);
            // Database calling 4
            imageView_fridge_img = itemView.findViewById(R.id.frige_discount_img);
            imageView_fridge_logo = itemView.findViewById(R.id.frige_discount_img_logo);
            imageView_fridge_label = itemView.findViewById(R.id.frige_discount_img_label);
            // Database calling 5
            imageView_w_m_img = itemView.findViewById(R.id.w_m_discount_img);
            imageView_w_m_logo = itemView.findViewById(R.id.w_m_discount_img_logo);
            imageView_w_m_label = itemView.findViewById(R.id.w_m_discount_img_label);
            // Database calling 6
            imageView_earbuds_img = itemView.findViewById(R.id.earbuds_discount_img);
            imageView_earbuds_logo = itemView.findViewById(R.id.earbuds_discount_img_logo);
            imageView_earbuds_label = itemView.findViewById(R.id.earbuds_discount_img_label);
            // Database calling 7
            imageView_cpu_img = itemView.findViewById(R.id.cpu_discount_img);
            imageView_cpu_logo = itemView.findViewById(R.id.cpu_discount_img_logo);
            imageView_cpu_label = itemView.findViewById(R.id.cpu_discount_img_label);
            // Database calling 8
            imageView_speaker_img = itemView.findViewById(R.id.speaker_discount_img);
            imageView_speaker_logo = itemView.findViewById(R.id.speaker_discount_img_logo);
            imageView_speaker_label = itemView.findViewById(R.id.speaker_discount_img_label);

        }

        private Runnable sliderItems = new Runnable() {
            @Override
            public void run() {
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        };
    }
    private void updateImageViewWithProgress(ImageView imageView, ProgressBar progressBar, Uri uri) {
        progressBar.setVisibility(View.VISIBLE); // Show ProgressBar

        Picasso.get().load(uri).into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                progressBar.setVisibility(View.GONE); // Hide ProgressBar on success
            }

            @Override
            public void onError(Exception e) {
                progressBar.setVisibility(View.GONE); // Hide ProgressBar on error
            }
        });

    }
}