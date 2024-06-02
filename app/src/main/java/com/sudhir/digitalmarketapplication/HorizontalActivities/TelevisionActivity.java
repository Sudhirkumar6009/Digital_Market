package com.sudhir.digitalmarketapplication.HorizontalActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionDetailedActivity.HisenseBrandsTvActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionDetailedActivity.LgBrandsTvActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionDetailedActivity.PanasonicBrandsTvActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionDetailedActivity.PhilipsBrandsTvActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionDetailedActivity.SamsungBrandsTvActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionDetailedActivity.SonyBrandsTvActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionDetailedActivity.TclBrandsTvActivity;
import com.sudhir.digitalmarketapplication.MainPageActivity;
import com.sudhir.digitalmarketapplication.R;
public class TelevisionActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television);
        ImageView back_television = findViewById(R.id.back_television_activity);
        swipeRefreshLayout = findViewById(R.id.RefreshLayout);

        //ProgressBar
        ProgressBar tv_samsung_progressbar = findViewById(R.id.tv_samsung_progressbar);
        ProgressBar tv_sony_progressbar = findViewById(R.id.tv_sony_progressbar);
        ProgressBar tv_lg_progressbar = findViewById(R.id.tv_lg_progressbar);
        ProgressBar tv_tcl_progressbar = findViewById(R.id.tv_tcl_progressbar);
        ProgressBar tv_panasonic_progressbar = findViewById(R.id.tv_panasonic_progressbar);
        ProgressBar tv_philips_progressbar = findViewById(R.id.tv_philips_progressbar);
        ProgressBar tv_hisense_progressbar = findViewById(R.id.tv_hisense_progressbar);
        //ProgressBar

        CardView samsung_product_tv = findViewById(R.id.samsung_product_tv);
        CardView sony_product_tv = findViewById(R.id.sony_product_tv);
        CardView lg_product_tv = findViewById(R.id.lg_product_tv);
        CardView tcl_product_tv = findViewById(R.id.tcl_product_tv);
        CardView panasonic_product_tv = findViewById(R.id.panasonic_product_tv);
        CardView philips_product_tv = findViewById(R.id.philips_product_tv);
        CardView hisense_product_tv = findViewById(R.id.hisense_product_tv);

        StorageReference storageReference = FirebaseStorage.getInstance().getReference();

        final ImageView tvImageView = findViewById(R.id.samsung_img_databs_load);
        final ImageView tvImageView2 = findViewById(R.id.sony_img_databs_load);
        final ImageView tvImageView3 = findViewById(R.id.lg_img_databs_load);
        final ImageView tvImageView4 = findViewById(R.id.panasonic_img_databs_load);
        final ImageView tvImageView5 = findViewById(R.id.tcl_img_databs_load);
        final ImageView tvImageView6 = findViewById(R.id.hisense_img_databs_load);
        final ImageView tvImageView7 = findViewById(R.id.philips_img_databs_load);


        // Initialize Firebase Storage reference

        // Construct the reference to the image
        StorageReference imageRef = storageReference.child("Tv_Logos/samsung_logo.png");
        StorageReference imageRef2 = storageReference.child("Tv_Logos/sony_logo_bg_less.png");
        StorageReference imageRef3 = storageReference.child("Tv_Logos/lg_vertical_bg_less.png");
        StorageReference imageRef4 = storageReference.child("Tv_Logos/panasonic_logo_bg_less.png");
        StorageReference imageRef5 = storageReference.child("Tv_Logos/tcl_logo.PNG");
        StorageReference imageRef6 = storageReference.child("Tv_Logos/hisense_logo.png");
        StorageReference imageRef7 = storageReference.child("Tv_Logos/philips_logo.png");

        // Get the download URL of the image
        imageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(tvImageView);
                tv_samsung_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(tvImageView2);
                tv_lg_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(tvImageView3);
                tv_panasonic_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(tvImageView4);
                tv_tcl_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(tvImageView5);
                tv_hisense_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef6.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(tvImageView6);
                tv_philips_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef7.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(tvImageView7);
                tv_sony_progressbar.setVisibility(View.GONE);
            }
        });

        samsung_product_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelevisionActivity.this, SamsungBrandsTvActivity.class));
            }
        });
        sony_product_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelevisionActivity.this, SonyBrandsTvActivity.class));
            }
        });
        lg_product_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelevisionActivity.this, LgBrandsTvActivity.class));
            }
        });
        tcl_product_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelevisionActivity.this, TclBrandsTvActivity.class));
            }
        });
        panasonic_product_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelevisionActivity.this, PanasonicBrandsTvActivity.class));
            }
        });
        philips_product_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelevisionActivity.this, PhilipsBrandsTvActivity.class));
            }
        });
        hisense_product_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelevisionActivity.this, HisenseBrandsTvActivity.class));
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshContent();
            }
        });
        back_television.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void refreshContent() {
        // Simulate data refresh here if needed
        // For example, you can clear and reload your data lists.
        // And then update the adapter and UI.

        // Recreate the activity to simulate a refresh
        recreate();

        // Finish the swipe refresh animation
        swipeRefreshLayout.setRefreshing(false);
    }
}