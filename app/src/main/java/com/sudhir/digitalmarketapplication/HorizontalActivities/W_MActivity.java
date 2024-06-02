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
import com.sudhir.digitalmarketapplication.HorizontalActivities.W_MDetailedActivity.BoschBrandsW_MActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.W_MDetailedActivity.HaierBrandsW_MActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.W_MDetailedActivity.LgBrandsW_MActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.W_MDetailedActivity.SamsungBrandsW_MActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.W_MDetailedActivity.WhirlpoolBrandsW_MActivity;
import com.sudhir.digitalmarketapplication.MainPageActivity;
import com.sudhir.digitalmarketapplication.R;

public class W_MActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wmactivity);
        ImageView back_w_m = findViewById(R.id.back_w_m_activity);
        swipeRefreshLayout = findViewById(R.id.RefreshLayout);

        //ProgressBar
        ProgressBar w_m_samsung_progressbar = findViewById(R.id.w_m_samsung_progressbar);
        ProgressBar w_m_lg_progressbar = findViewById(R.id.w_m_lg_progressbar);
        ProgressBar w_m_whirlpool_progressbar = findViewById(R.id.w_m_whirlpool_progressbar);
        ProgressBar w_m_haier_progressbar = findViewById(R.id.w_m_haier_progressbar);
        ProgressBar w_m_bosch_progressbar = findViewById(R.id.w_m_bosch_progressbar);
        //ProgressBar
        
        CardView samsung_product_w_m = findViewById(R.id.samsung_product_w_m);
        CardView lg_product_w_m = findViewById(R.id.lg_product_w_m);
        CardView whirlpool_product_w_m = findViewById(R.id.whirlpool_product_w_m);
        CardView haier_product_w_m = findViewById(R.id.haier_product_w_m);
        CardView bosch_product_w_m = findViewById(R.id.bosch_product_w_m);
        
        StorageReference storageReference = FirebaseStorage.getInstance().getReference();
        final ImageView w_m_ImageView = findViewById(R.id.samsung_img_databs_load);
        final ImageView w_m_ImageView2 = findViewById(R.id.lg_img_databs_load);
        final ImageView w_m_ImageView3 = findViewById(R.id.whirlpool_img_databs_load);
        final ImageView w_m_ImageView4 = findViewById(R.id.haier_img_databs_load);
        final ImageView w_m_ImageView5 = findViewById(R.id.bosch_img_databs_load);

        StorageReference imageRef = storageReference.child("Washing_Machine_Logos/samsung_logo.png");
        StorageReference imageRef2 = storageReference.child("Washing_Machine_Logos/lg_vertical_bg_less.png");
        StorageReference imageRef3 = storageReference.child("Washing_Machine_Logos/whirlpool_logo.png");
        StorageReference imageRef4 = storageReference.child("Washing_Machine_Logos/haier_logo.png");
        StorageReference imageRef5 = storageReference.child("Washing_Machine_Logos/bosch_logo.png");

        // Get the download URL of the image
        imageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(w_m_ImageView);
                w_m_samsung_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(w_m_ImageView2);
                w_m_lg_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(w_m_ImageView3);
                w_m_whirlpool_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(w_m_ImageView4);
                w_m_haier_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Load the image into the ImageView using Picasso
                Picasso.get().load(uri).into(w_m_ImageView5);
                w_m_bosch_progressbar.setVisibility(View.GONE);
            }
        });
        samsung_product_w_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(W_MActivity.this, SamsungBrandsW_MActivity.class));
            }
        });
        lg_product_w_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(W_MActivity.this, LgBrandsW_MActivity.class));
            }
        });
        whirlpool_product_w_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(W_MActivity.this, WhirlpoolBrandsW_MActivity.class));
            }
        });
        haier_product_w_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(W_MActivity.this, HaierBrandsW_MActivity.class));
            }
        });
        bosch_product_w_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(W_MActivity.this, BoschBrandsW_MActivity.class));
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshContent();
            }
        });
        back_w_m.setOnClickListener(new View.OnClickListener() {
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