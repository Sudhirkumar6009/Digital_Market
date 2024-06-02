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
import com.sudhir.digitalmarketapplication.HorizontalActivities.FrigeDetailedActivity.GodrejBrandsFrigeActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.FrigeDetailedActivity.HaierBrandsFrigeActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.FrigeDetailedActivity.LgBrandsFrigeActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.FrigeDetailedActivity.SamsungBrandsFrigeActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.FrigeDetailedActivity.WhirlpoolBrandsFrigeActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.MiBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.OneplusBrandsMobileActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.OppoBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.SamsungBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesDetailedActivity.VivoBrandsMobilesActivity;
import com.sudhir.digitalmarketapplication.MainPageActivity;
import com.sudhir.digitalmarketapplication.R;

public class FridgeActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);

        ImageView back_frige = findViewById(R.id.back_frige_activity);
        swipeRefreshLayout = findViewById(R.id.RefreshLayout);

        //ProgressBar
        ProgressBar frige_lg_progressbar = findViewById(R.id.frige_lg_progressbar);
        ProgressBar frige_samsung_progressbar = findViewById(R.id.frige_samsung_progressbar);
        ProgressBar frige_whirlpool_progressbar = findViewById(R.id.frige_whirlpool_progressbar);
        ProgressBar frige_godrej_progressbar = findViewById(R.id.frige_godrej_progressbar);
        ProgressBar frige_haier_progressbar = findViewById(R.id.frige_haier_progressbar);
        //ProgressBar

        CardView lg_product_frige = findViewById(R.id.lg_product_frige);
        CardView whirlpool_product_frige = findViewById(R.id.whirlpool_product_frige);
        CardView samsung_product_frige = findViewById(R.id.samsung_product_frige);
        CardView godrej_product_frige = findViewById(R.id.godrej_product_frige);
        CardView haier_product_mobile = findViewById(R.id.haier_product_frige);

        StorageReference storageReference = FirebaseStorage.getInstance().getReference();
        final ImageView frigeImageView = findViewById(R.id.lg_img_databs_load);
        final ImageView frigeImageView2 = findViewById(R.id.whirlpool_img_databs_load);
        final ImageView frigeImageView3 = findViewById(R.id.samsung_img_databs_load);
        final ImageView frigeImageView4 = findViewById(R.id.godrej_img_databs_load);
        final ImageView frigeImageView5 = findViewById(R.id.haier_img_databs_load);

        StorageReference imageRef = storageReference.child("Frige_Logos/lg_vertical_bg_less.png");
        StorageReference imageRef2 = storageReference.child("Frige_Logos/whirlpool_logo.png");
        StorageReference imageRef3 = storageReference.child("Frige_Logos/samsung_logo.png");
        StorageReference imageRef4 = storageReference.child("Frige_Logos/godrej_logo_bg_less.png");
        StorageReference imageRef5 = storageReference.child("Frige_Logos/haier_logo.png");

        // Get the download URL of the image
        imageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(frigeImageView);
                frige_lg_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(frigeImageView2);
                frige_whirlpool_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(frigeImageView3);
                frige_samsung_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(frigeImageView4);
                frige_godrej_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(frigeImageView5);
                frige_haier_progressbar.setVisibility(View.GONE);
            }
        });

        lg_product_frige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FridgeActivity.this, LgBrandsFrigeActivity.class));
            }
        });
        whirlpool_product_frige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FridgeActivity.this, WhirlpoolBrandsFrigeActivity.class));
            }
        });
        samsung_product_frige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FridgeActivity.this, SamsungBrandsFrigeActivity.class));
            }
        });
        godrej_product_frige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FridgeActivity.this, GodrejBrandsFrigeActivity.class));
            }
        });
        haier_product_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FridgeActivity.this, HaierBrandsFrigeActivity.class));
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshContent();
            }
        });
        back_frige.setOnClickListener(new View.OnClickListener() {
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