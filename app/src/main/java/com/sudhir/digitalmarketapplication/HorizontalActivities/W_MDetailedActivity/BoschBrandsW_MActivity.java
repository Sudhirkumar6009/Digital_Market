package com.sudhir.digitalmarketapplication.HorizontalActivities.W_MDetailedActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.sudhir.digitalmarketapplication.R;

public class BoschBrandsW_MActivity extends AppCompatActivity {


    private ImageView bosch_w_m_brand_db_load;
    private ImageView bosch_w_m_brand_db_load_2;
    private ImageView bosch_w_m_brand_db_load_3;
    private ImageView bosch_w_m_brand_db_load_4;
    private TextView bosch_w_m_brand_price_db_load,bosch_w_m_brand_sym_db_load,bosch_w_m_brand_content_db_load;
    private TextView bosch_w_m_brand_price_db_load_2,bosch_w_m_brand_sym_db_load_2,bosch_w_m_brand_content_db_load_2;
    private TextView bosch_w_m_brand_price_db_load_3,bosch_w_m_brand_sym_db_load_3,bosch_w_m_brand_content_db_load_3;
    private TextView bosch_w_m_brand_price_db_load_4,bosch_w_m_brand_sym_db_load_4,bosch_w_m_brand_content_db_load_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosch_brands_wmactivity);

        bosch_w_m_brand_db_load = findViewById(R.id.bosch_w_m_brand_db_load);
        bosch_w_m_brand_price_db_load = findViewById(R.id.bosch_w_m_brand_price_db_load);
        bosch_w_m_brand_sym_db_load = findViewById(R.id.bosch_w_m_brand_sym_db_load);
        bosch_w_m_brand_content_db_load = findViewById(R.id.bosch_w_m_brand_content_db_load);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/W_M_Products/Bosch_Brand_Products/Product1");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_description").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    bosch_w_m_brand_content_db_load.setText(text1);
                    bosch_w_m_brand_price_db_load.setText(text2);
                    bosch_w_m_brand_sym_db_load.setText(text3);
                    Picasso.get().load(img).into(bosch_w_m_brand_db_load);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //Product1
        //Product2
        bosch_w_m_brand_db_load_2 = findViewById(R.id.bosch_w_m_brand_db_load_2);
        bosch_w_m_brand_price_db_load_2 = findViewById(R.id.bosch_w_m_brand_price_db_load_2);
        bosch_w_m_brand_sym_db_load_2 = findViewById(R.id.bosch_w_m_brand_sym_db_load_2);
        bosch_w_m_brand_content_db_load_2 = findViewById(R.id.bosch_w_m_brand_content_db_load_2);

        DatabaseReference databaseReference2 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/W_M_Products/Bosch_Brand_Products/Product2");

        databaseReference2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_description").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    bosch_w_m_brand_content_db_load_2.setText(text1);
                    bosch_w_m_brand_price_db_load_2.setText(text2);
                    bosch_w_m_brand_sym_db_load_2.setText(text3);
                    Picasso.get().load(img).into(bosch_w_m_brand_db_load_2);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //Product2
        //Product3
        bosch_w_m_brand_db_load_3 = findViewById(R.id.bosch_w_m_brand_db_load_3);
        bosch_w_m_brand_price_db_load_3 = findViewById(R.id.bosch_w_m_brand_price_db_load_3);
        bosch_w_m_brand_sym_db_load_3 = findViewById(R.id.bosch_w_m_brand_sym_db_load_3);
        bosch_w_m_brand_content_db_load_3 = findViewById(R.id.bosch_w_m_brand_content_db_load_3);

        DatabaseReference databaseReference3 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/W_M_Products/Bosch_Brand_Products/Product3");

        databaseReference3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_description").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    bosch_w_m_brand_content_db_load_3.setText(text1);
                    bosch_w_m_brand_price_db_load_3.setText(text2);
                    bosch_w_m_brand_sym_db_load_3.setText(text3);
                    Picasso.get().load(img).into(bosch_w_m_brand_db_load_3);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //Product3
        //Product4
        bosch_w_m_brand_db_load_4 = findViewById(R.id.bosch_w_m_brand_db_load_4);
        bosch_w_m_brand_price_db_load_4 = findViewById(R.id.bosch_w_m_brand_price_db_load_4);
        bosch_w_m_brand_sym_db_load_4 = findViewById(R.id.bosch_w_m_brand_sym_db_load_4);
        bosch_w_m_brand_content_db_load_4 = findViewById(R.id.bosch_w_m_brand_content_db_load_4);

        DatabaseReference databaseReference4 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/W_M_Products/Bosch_Brand_Products/Product4");

        databaseReference4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_description").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    bosch_w_m_brand_content_db_load_4.setText(text1);
                    bosch_w_m_brand_price_db_load_4.setText(text2);
                    bosch_w_m_brand_sym_db_load_4.setText(text3);
                    Picasso.get().load(img).into(bosch_w_m_brand_db_load_4);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //Product4
    }
}