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
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.AppleBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.MiBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.OneplusBrandsMobileActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.OppoBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.SamsungBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.VivoBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.R;

public class MobilesActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobiles);
        ImageView back_mobiles = findViewById(R.id.back_mobiles_activity);
        swipeRefreshLayout = findViewById(R.id.RefreshLayout);

        //ProgressBar
        ProgressBar mobile_samsung_progressbar = findViewById(R.id.mobile_samsung_progressbar);
        ProgressBar mobile_oneplus_progressbar = findViewById(R.id.mobile_oneplus_progressbar);
        ProgressBar mobile_oppo_progressbar = findViewById(R.id.mobile_oppo_progressbar);
        ProgressBar mobile_vivo_progressbar = findViewById(R.id.mobile_vivo_progressbar);
        ProgressBar mobile_mi_progressbar = findViewById(R.id.mobile_mi_progressbar);
        ProgressBar mobile_apple_progressbar = findViewById(R.id.mobile_apple_progressbar);
        //ProgressBar
        
        CardView samsung_product_mobile = findViewById(R.id.samsung_product_mobile);
        CardView oneplus_product_mobile = findViewById(R.id.oneplus_product_mobile);
        CardView oppo_product_mobile = findViewById(R.id.oppo_product_mobile);
        CardView vivo_product_mobile = findViewById(R.id.vivo_product_mobile);
        CardView mi_product_mobile = findViewById(R.id.mi_product_mobile);
        CardView apple_product_mobile = findViewById(R.id.apple_product_mobile);
        
        StorageReference storageReference = FirebaseStorage.getInstance().getReference();

        final ImageView mobileImageView = findViewById(R.id.samsung_img_databs_load);
        final ImageView mobileImageView2 = findViewById(R.id.oneplus_img_databs_load);
        final ImageView mobileImageView3 = findViewById(R.id.oppo_img_databs_load);
        final ImageView mobileImageView4 = findViewById(R.id.vivo_img_databs_load);
        final ImageView mobileImageView5 = findViewById(R.id.mi_img_databs_load);
        final ImageView mobileImageView6 = findViewById(R.id.apple_img_databs_load);


        // Initialize Firebase Storage reference

        // Construct the reference to the image
        StorageReference imageRef = storageReference.child("Mobile_Logos/samsung_logo.png");
        StorageReference imageRef2 = storageReference.child("Mobile_Logos/oneplus_logo.png");
        StorageReference imageRef3 = storageReference.child("Mobile_Logos/oppo_logo_bg_less.png");
        StorageReference imageRef4 = storageReference.child("Mobile_Logos/vivo_logo.png");
        StorageReference imageRef5 = storageReference.child("Mobile_Logos/mi_logo_bg_less.png");
        StorageReference imageRef6 = storageReference.child("Mobile_Logos/apple_logo_bg_less.png");

        // Get the download URL of the image
        imageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(mobileImageView);
                mobile_samsung_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(mobileImageView2);
                mobile_oneplus_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(mobileImageView3);
                mobile_oppo_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(mobileImageView4);
                mobile_vivo_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(mobileImageView5);
                mobile_mi_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef6.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(mobileImageView6);
                mobile_apple_progressbar.setVisibility(View.GONE);
            }
        });

        samsung_product_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MobilesActivity.this, SamsungBrandsMobilesActivity.class));
            }
        });
        oneplus_product_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MobilesActivity.this, OneplusBrandsMobileActivity.class));
            }
        });
        oppo_product_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MobilesActivity.this, OppoBrandsMobilesActivity.class));
            }
        });
        vivo_product_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MobilesActivity.this, VivoBrandsMobilesActivity.class));
            }
        });
        mi_product_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MobilesActivity.this, MiBrandsMobilesActivity.class));
            }
        });
        apple_product_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MobilesActivity.this, AppleBrandsMobilesActivity.class));
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshContent();
            }
        });
        back_mobiles.setOnClickListener(new View.OnClickListener() {
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