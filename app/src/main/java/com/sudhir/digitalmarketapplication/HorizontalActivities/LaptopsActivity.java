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
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.AcerBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.AppleBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.AsusBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.DellBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.HpBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.LenovoBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.LgBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.MsiBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.SamsungBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsDetailedActivity.HonorBrandsLaptopsActivity;
import com.sudhir.digitalmarketapplication.R;

public class LaptopsActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptops);

        ImageView back_laptops = findViewById(R.id.back_laptops_activity);
        swipeRefreshLayout = findViewById(R.id.RefreshLayout);

        ProgressBar laptop_lenovo_progressbar = findViewById(R.id.laptop_lenovo_progressbar);
        ProgressBar laptop_samsung_progressbar = findViewById(R.id.laptop_samsung_progressbar);
        ProgressBar laptop_hp_progressbar = findViewById(R.id.laptop_hp_progressbar);
        ProgressBar laptop_dell_progressbar = findViewById(R.id.laptop_dell_progressbar);
        ProgressBar laptop_asus_progressbar = findViewById(R.id.laptop_asus_progressbar);
        ProgressBar laptop_acer_progressbar = findViewById(R.id.laptop_acer_progressbar);
        ProgressBar laptop_apple_progressbar = findViewById(R.id.laptop_apple_progressbar);
        ProgressBar laptop_lg_progressbar = findViewById(R.id.laptop_lg_progressbar);
        ProgressBar laptop_honor_progressbar = findViewById(R.id.laptop_honor_progressbar);
        ProgressBar laptop_msi_progressbar = findViewById(R.id.laptop_msi_progressbar);

        CardView lenovo_product_laptop = findViewById(R.id.lenovo_product_laptop);
        CardView samsung_product_laptop = findViewById(R.id.samsung_product_laptop);
        CardView hp_product_laptop = findViewById(R.id.hp_product_laptop);
        CardView dell_product_laptop = findViewById(R.id.dell_product_laptop);
        CardView asus_product_laptop = findViewById(R.id.asus_product_laptop);
        CardView acer_product_laptop = findViewById(R.id.acer_product_laptop);
        CardView apple_product_laptop = findViewById(R.id.apple_product_laptop);
        CardView lg_product_laptop = findViewById(R.id.lg_product_laptop);
        CardView honor_product_laptop = findViewById(R.id.honor_product_laptop);
        CardView msi_product_laptop = findViewById(R.id.msi_product_laptop);

        StorageReference storageReference = FirebaseStorage.getInstance().getReference();

        final ImageView laptopImageView = findViewById(R.id.lenovo_img_databs_load);
        final ImageView laptopImageView2 = findViewById(R.id.samsung_img_databs_load);
        final ImageView laptopImageView3 = findViewById(R.id.hp_img_databs_load);
        final ImageView laptopImageView4 = findViewById(R.id.dell_img_databs_load);
        final ImageView laptopImageView5 = findViewById(R.id.asus_img_databs_load);
        final ImageView laptopImageView6 = findViewById(R.id.acer_img_databs_load);
        final ImageView laptopImageView7 = findViewById(R.id.apple_img_databs_load);
        final ImageView laptopImageView8 = findViewById(R.id.lg_img_databs_load);
        final ImageView laptopImageView9 = findViewById(R.id.honor_img_databs_load);
        final ImageView laptopImageView10 = findViewById(R.id.msi_img_databs_load);

        StorageReference imageRef = storageReference.child("Laptops_Logos/lenovo_logo_bg_less.png");
        StorageReference imageRef2 = storageReference.child("Laptops_Logos/samsung_logo.png");
        StorageReference imageRef3 = storageReference.child("Laptops_Logos/hp_logo_bg_less.png");
        StorageReference imageRef4 = storageReference.child("Laptops_Logos/dell_logo_bg_less.png");
        StorageReference imageRef5 = storageReference.child("Laptops_Logos/asus_logo_bg_less.png");
        StorageReference imageRef6 = storageReference.child("Laptops_Logos/acer_logo_bg_less.png");
        StorageReference imageRef7 = storageReference.child("Laptops_Logos/apple_logo_bg_less.png");
        StorageReference imageRef8 = storageReference.child("Laptops_Logos/lg_logo_bg_less.png");
        StorageReference imageRef9 = storageReference.child("Laptops_Logos/honor_logo.png");
        StorageReference imageRef10 = storageReference.child("Laptops_Logos/msi_logo_bg_less.png");

        imageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView);
                laptop_lenovo_progressbar.setVisibility(View.GONE);
            }
        });

        imageRef2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView2);
                laptop_samsung_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView3);
                laptop_hp_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView4);
                laptop_dell_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView5);
                laptop_asus_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef6.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView6);
                laptop_acer_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef7.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView7);
                laptop_apple_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef8.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView8);
                laptop_lg_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef9.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView9);
                laptop_honor_progressbar.setVisibility(View.GONE);
            }
        });
        imageRef10.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(laptopImageView10);
                laptop_msi_progressbar.setVisibility(View.GONE);
            }
        });
        lenovo_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, LenovoBrandsLaptopsActivity.class));
            }
        });
        samsung_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, SamsungBrandsLaptopsActivity.class));
            }
        });
        hp_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, HpBrandsLaptopsActivity.class));
            }
        });
        dell_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, DellBrandsLaptopsActivity.class));
            }
        });
        asus_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, AsusBrandsLaptopsActivity.class));
            }
        });
        acer_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, AcerBrandsLaptopsActivity.class));
            }
        });
        apple_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, AppleBrandsLaptopsActivity.class));
            }
        });
        lg_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, LgBrandsLaptopsActivity.class));
            }
        });
        honor_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, HonorBrandsLaptopsActivity.class));
            }
        });
        msi_product_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaptopsActivity.this, MsiBrandsLaptopsActivity.class));
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshContent();
            }
        });
        back_laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void refreshContent() {

        recreate();

        swipeRefreshLayout.setRefreshing(false);
    }
}
