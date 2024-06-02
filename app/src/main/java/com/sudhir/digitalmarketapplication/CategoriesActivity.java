package com.sudhir.digitalmarketapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.sudhir.digitalmarketapplication.HorizontalActivities.AccessoriesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.FridgeActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.LaptopsActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.MobilesActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.TelevisionActivity;
import com.sudhir.digitalmarketapplication.HorizontalActivities.W_MActivity;

public class CategoriesActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        swipeRefreshLayout = findViewById(R.id.RefreshLayout_categories);
        ImageView back_img = findViewById(R.id.back_laptops_activity);

        ProgressBar laptops_progressbar = findViewById(R.id.laptops_progressbar);
        ProgressBar tv_progressbar = findViewById(R.id.tv_progressbar);
        ProgressBar mobile_progressbar = findViewById(R.id.mobile_progressbar);
        ProgressBar frige_progressbar = findViewById(R.id.frige_progressbar);
        ProgressBar w_m_progressbar= findViewById(R.id.w_m_progressbar);
        ProgressBar accessories_progressbar= findViewById(R.id.accessories_progressbar);

        CardView laptops_cate = findViewById(R.id.laptops_cate);
        CardView tv_cate = findViewById(R.id.tv_cate);
        CardView mobiles_cate = findViewById(R.id.mobiles_cate);
        CardView frige_cate = findViewById(R.id.frige_cate);
        CardView w_m_cate = findViewById(R.id.w_m_cate);
        CardView accessories_cate = findViewById(R.id.accessories_cate);

        TextView laptop_text = findViewById(R.id.laptops_txt);
        TextView tv_text = findViewById(R.id.tv_txt);
        TextView mobiles_text = findViewById(R.id.mobiles_txt);
        TextView frige_text = findViewById(R.id.frige_txt);
        TextView w_m_text = findViewById(R.id.w_m_txt);
        TextView accessories_txt = findViewById(R.id.accessories_txt);

        final ImageView Img_products1 = findViewById(R.id.laptops_img_databs_load);
        final ImageView Img_products2 = findViewById(R.id.tv_img_databs_load);
        final ImageView Img_products3 = findViewById(R.id.mobiles_img_databs_load);
        final ImageView Img_products4 = findViewById(R.id.frige_img_databs_load);
        final ImageView Img_products5 = findViewById(R.id.w_m_img_databs_load);
        final ImageView Img_products6 = findViewById(R.id.accessories_img_databs_load);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Categories/Laptop");
        DatabaseReference databaseReference2 = FirebaseDatabase.getInstance().getReference().child("Categories/Tv");
        DatabaseReference databaseReference3 = FirebaseDatabase.getInstance().getReference().child("Categories/Mobiles");
        DatabaseReference databaseReference4 = FirebaseDatabase.getInstance().getReference().child("Categories/Frige");
        DatabaseReference databaseReference5 = FirebaseDatabase.getInstance().getReference().child("Categories/W_M");
        DatabaseReference databaseReference6 = FirebaseDatabase.getInstance().getReference().child("Categories/Accessories");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text = dataSnapshot.child("name").getValue(String.class);
                    String img = dataSnapshot.child("img").getValue(String.class);

                    laptop_text.setText(text);
                    Picasso.get().load(img).into(Img_products1);
                    laptops_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        databaseReference2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text = dataSnapshot.child("name").getValue(String.class);
                    String img = dataSnapshot.child("img").getValue(String.class);

                    tv_text.setText(text);
                    Picasso.get().load(img).into(Img_products2);
                    tv_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        databaseReference3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text = dataSnapshot.child("name").getValue(String.class);
                    String img = dataSnapshot.child("img").getValue(String.class);

                    mobiles_text.setText(text);
                    Picasso.get().load(img).into(Img_products3);
                    mobile_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        databaseReference4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text = dataSnapshot.child("name").getValue(String.class);
                    String img = dataSnapshot.child("img").getValue(String.class);

                    frige_text.setText(text);
                    Picasso.get().load(img).into(Img_products4);
                    frige_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        databaseReference5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text = dataSnapshot.child("name").getValue(String.class);
                    String img = dataSnapshot.child("img").getValue(String.class);

                    w_m_text.setText(text);
                    Picasso.get().load(img).into(Img_products5);
                    w_m_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        databaseReference6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text = dataSnapshot.child("name").getValue(String.class);
                    String img = dataSnapshot.child("img").getValue(String.class);

                    accessories_txt.setText(text);
                    Picasso.get().load(img).into(Img_products6);
                    accessories_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });


        laptops_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoriesActivity.this, LaptopsActivity.class));
            }
        });
        tv_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoriesActivity.this, TelevisionActivity.class));
            }
        });
        mobiles_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoriesActivity.this, MobilesActivity.class));
            }
        });
        frige_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoriesActivity.this, FridgeActivity.class));
            }
        });
        w_m_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoriesActivity.this, W_MActivity.class));
            }
        });
        accessories_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoriesActivity.this, AccessoriesActivity.class));
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshContent();
            }
        });
        back_img.setOnClickListener(new View.OnClickListener() {
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