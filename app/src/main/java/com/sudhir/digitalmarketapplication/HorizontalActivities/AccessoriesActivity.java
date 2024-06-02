package com.sudhir.digitalmarketapplication.HorizontalActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.sudhir.digitalmarketapplication.R;

public class AccessoriesActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);

        swipeRefreshLayout = findViewById(R.id.RefreshLayout);

        ImageView back_accessories = findViewById(R.id.back_accessories_activity);
        //LAPTOPS_ACCESSORIES
        ImageView  laptop_accessories_img = findViewById(R.id.laptop_accessories_img);
        TextView laptop_accessories_price = findViewById(R.id.laptop_accessories_price);
        TextView laptop_accessories_sym = findViewById(R.id.laptop_accessories_sym);
        TextView laptop_accessories_content = findViewById(R.id.laptop_accessories_content);
        ProgressBar laptop_accessories_progressbar = findViewById(R.id.laptop_accessories_progressbar);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Laptops_Accessories/Product1");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    laptop_accessories_content.setText(text1);
                    laptop_accessories_price.setText(text2);
                    laptop_accessories_sym.setText(text3);
                    Picasso.get().load(img).into( laptop_accessories_img);
                    laptop_accessories_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        ImageView  laptop_accessories_img2 = findViewById(R.id.laptop_accessories_img2);
        TextView laptop_accessories_price2 = findViewById(R.id.laptop_accessories_price2);
        TextView laptop_accessories_sym2 = findViewById(R.id.laptop_accessories_sym2);
        TextView laptop_accessories_content2 = findViewById(R.id.laptop_accessories_content2);
        ProgressBar laptop_accessories_progressbar2 = findViewById(R.id.laptop_accessories_progressbar2);

        DatabaseReference databaseReference2 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Laptops_Accessories/Product2");

        databaseReference2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    laptop_accessories_content2.setText(text1);
                    laptop_accessories_price2.setText(text2);
                    laptop_accessories_sym2.setText(text3);
                    Picasso.get().load(img).into( laptop_accessories_img2);
                    laptop_accessories_progressbar2.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        ImageView  laptop_accessories_img3 = findViewById(R.id.laptop_accessories_img3);
        TextView laptop_accessories_price3 = findViewById(R.id.laptop_accessories_price3);
        TextView laptop_accessories_sym3 = findViewById(R.id.laptop_accessories_sym3);
        TextView laptop_accessories_content3 = findViewById(R.id.laptop_accessories_content3);
        ProgressBar laptop_accessories_progressbar3 = findViewById(R.id.laptop_accessories_progressbar3);

        DatabaseReference databaseReference3 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Laptops_Accessories/Product3");

        databaseReference3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    laptop_accessories_content3.setText(text1);
                    laptop_accessories_price3.setText(text2);
                    laptop_accessories_sym3.setText(text3);
                    Picasso.get().load(img).into( laptop_accessories_img3);
                    laptop_accessories_progressbar3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //LAPTOPS_ACCESSORIES

        //TELEVISION_ACCESSORIES
        ImageView television_accessories_img = findViewById(R.id.television_accessories_img);
        TextView television_accessories_price = findViewById(R.id.television_accessories_price);
        TextView television_accessories_sym = findViewById(R.id.television_accessories_sym);
        TextView television_accessories_content = findViewById(R.id.television_accessories_content);
        ProgressBar television_accessories_progressbar = findViewById(R.id.television_accessories_progressbar);

        DatabaseReference databaseReference4 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Televisions_Accessories/Product1");

        databaseReference4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    television_accessories_content.setText(text1);
                    television_accessories_price.setText(text2);
                    television_accessories_sym.setText(text3);
                    Picasso.get().load(img).into( television_accessories_img);
                    television_accessories_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        ImageView  television_accessories_img2 = findViewById(R.id.television_accessories_img2);
        TextView television_accessories_price2 = findViewById(R.id.television_accessories_price2);
        TextView television_accessories_sym2 = findViewById(R.id.television_accessories_sym2);
        TextView television_accessories_content2 = findViewById(R.id.television_accessories_content2);
        ProgressBar television_accessories_progressbar2 = findViewById(R.id.television_accessories_progressbar2);

        DatabaseReference databaseReference5 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Televisions_Accessories/Product2");

        databaseReference5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    television_accessories_content2.setText(text1);
                    television_accessories_price2.setText(text2);
                    television_accessories_sym2.setText(text3);
                    Picasso.get().load(img).into( television_accessories_img2);
                    television_accessories_progressbar2.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        ImageView  television_accessories_img3 = findViewById(R.id.television_accessories_img3);
        TextView television_accessories_price3 = findViewById(R.id.television_accessories_price3);
        TextView television_accessories_sym3 = findViewById(R.id.television_accessories_sym3);
        TextView television_accessories_content3 = findViewById(R.id.television_accessories_content3);
        ProgressBar television_accessories_progressbar3 = findViewById(R.id.television_accessories_progressbar3);

        DatabaseReference databaseReference6 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Televisions_Accessories/Product3");

        databaseReference6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    television_accessories_content3.setText(text1);
                    television_accessories_price3.setText(text2);
                    television_accessories_sym3.setText(text3);
                    Picasso.get().load(img).into( television_accessories_img3);
                    television_accessories_progressbar3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //TELEVISION_ACCESSORIES
        //MOBILE_ACCESSORIES
        ImageView mobiles_accessories_img = findViewById(R.id.mobiles_accessories_img);
        TextView mobiles_accessories_price = findViewById(R.id.mobiles_accessories_price);
        TextView mobiles_accessories_sym = findViewById(R.id.mobiles_accessories_sym);
        TextView mobiles_accessories_content = findViewById(R.id.mobiles_accessories_content);
        ProgressBar mobiles_accessories_progressbar = findViewById(R.id.mobiles_accessories_progressbar);

        DatabaseReference databaseReference7 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Mobiles_Accessories/Product1");

        databaseReference7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    mobiles_accessories_content.setText(text1);
                    mobiles_accessories_price.setText(text2);
                    mobiles_accessories_sym.setText(text3);
                    Picasso.get().load(img).into( mobiles_accessories_img);
                    mobiles_accessories_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        ImageView  mobiles_accessories_img2 = findViewById(R.id.mobiles_accessories_img2);
        TextView mobiles_accessories_price2 = findViewById(R.id.mobiles_accessories_price2);
        TextView mobiles_accessories_sym2 = findViewById(R.id.mobiles_accessories_sym2);
        TextView mobiles_accessories_content2 = findViewById(R.id.mobiles_accessories_content2);
        ProgressBar mobiles_accessories_progressbar2 = findViewById(R.id.mobiles_accessories_progressbar2);

        DatabaseReference databaseReference8 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Mobiles_Accessories/Product2");

        databaseReference8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    mobiles_accessories_content2.setText(text1);
                    mobiles_accessories_price2.setText(text2);
                    mobiles_accessories_sym2.setText(text3);
                    Picasso.get().load(img).into( mobiles_accessories_img2);
                    mobiles_accessories_progressbar2.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        ImageView  mobiles_accessories_img3 = findViewById(R.id.mobiles_accessories_img3);
        TextView mobiles_accessories_price3 = findViewById(R.id.mobiles_accessories_price3);
        TextView mobiles_accessories_sym3 = findViewById(R.id.mobiles_accessories_sym3);
        TextView mobiles_accessories_content3 = findViewById(R.id.mobiles_accessories_content3);
        ProgressBar mobiles_accessories_progressbar3 = findViewById(R.id.mobiles_accessories_progressbar3);

        DatabaseReference databaseReference9 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Mobiles_Accessories/Product3");

        databaseReference9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    mobiles_accessories_content3.setText(text1);
                    mobiles_accessories_price3.setText(text2);
                    mobiles_accessories_sym3.setText(text3);
                    Picasso.get().load(img).into( mobiles_accessories_img3);
                    mobiles_accessories_progressbar3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //MOBILE_ACCESSORIES
        //FRIDGE_ACCESSORIES
        ImageView frige_accessories_img = findViewById(R.id.frige_accessories_img);
        TextView frige_accessories_price = findViewById(R.id.frige_accessories_price);
        TextView frige_accessories_sym = findViewById(R.id.frige_accessories_sym);
        TextView frige_accessories_content = findViewById(R.id.frige_accessories_content);
        ProgressBar frige_accessories_progressbar = findViewById(R.id.frige_accessories_progressbar);

        DatabaseReference databaseReference10 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Frige_Accessories/Product1");

        databaseReference10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    frige_accessories_content.setText(text1);
                    frige_accessories_price.setText(text2);
                    frige_accessories_sym.setText(text3);
                    Picasso.get().load(img).into( frige_accessories_img);
                    frige_accessories_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        ImageView  frige_accessories_img2 = findViewById(R.id.frige_accessories_img2);
        TextView frige_accessories_price2 = findViewById(R.id.frige_accessories_price2);
        TextView frige_accessories_sym2 = findViewById(R.id.frige_accessories_sym2);
        TextView frige_accessories_content2 = findViewById(R.id.frige_accessories_content2);
        ProgressBar frige_accessories_progressbar2 = findViewById(R.id.frige_accessories_progressbar2);

        DatabaseReference databaseReference11 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Frige_Accessories/Product2");

        databaseReference11.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    frige_accessories_content2.setText(text1);
                    frige_accessories_price2.setText(text2);
                    frige_accessories_sym2.setText(text3);
                    Picasso.get().load(img).into( frige_accessories_img2);
                    frige_accessories_progressbar2.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        ImageView  frige_accessories_img3 = findViewById(R.id.frige_accessories_img3);
        TextView frige_accessories_price3 = findViewById(R.id.frige_accessories_price3);
        TextView frige_accessories_sym3 = findViewById(R.id.frige_accessories_sym3);
        TextView frige_accessories_content3 = findViewById(R.id.frige_accessories_content3);
        ProgressBar frige_accessories_progressbar3 = findViewById(R.id.frige_accessories_progressbar3);

        DatabaseReference databaseReference12 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Frige_Accessories/Product3");

        databaseReference12.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    frige_accessories_content3.setText(text1);
                    frige_accessories_price3.setText(text2);
                    frige_accessories_sym3.setText(text3);
                    Picasso.get().load(img).into( frige_accessories_img3);
                    frige_accessories_progressbar3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //FRIDGE_ACCESSORIES
        //WASHING_MACHINE_ACCESSORIES
        ImageView w_m_accessories_img = findViewById(R.id.w_m_accessories_img);
        TextView w_m_accessories_price = findViewById(R.id.w_m_accessories_price);
        TextView w_m_accessories_sym = findViewById(R.id.w_m_accessories_sym);
        TextView w_m_accessories_content = findViewById(R.id.w_m_accessories_content);
        ProgressBar w_m_accessories_progressbar = findViewById(R.id.w_m_accessories_progressbar);

        DatabaseReference databaseReference13 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/W_M_Accessories/Product1");

        databaseReference13.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    w_m_accessories_content.setText(text1);
                    w_m_accessories_price.setText(text2);
                    w_m_accessories_sym.setText(text3);
                    Picasso.get().load(img).into( w_m_accessories_img);
                    w_m_accessories_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        ImageView  w_m_accessories_img2 = findViewById(R.id.w_m_accessories_img2);
        TextView w_m_accessories_price2 = findViewById(R.id.w_m_accessories_price2);
        TextView w_m_accessories_sym2 = findViewById(R.id.w_m_accessories_sym2);
        TextView w_m_accessories_content2 = findViewById(R.id.w_m_accessories_content2);
        ProgressBar w_m_accessories_progressbar2 = findViewById(R.id.w_m_accessories_progressbar2);

        DatabaseReference databaseReference14 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/W_M_Accessories/Product2");

        databaseReference13.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    w_m_accessories_content2.setText(text1);
                    w_m_accessories_price2.setText(text2);
                    w_m_accessories_sym2.setText(text3);
                    Picasso.get().load(img).into( w_m_accessories_img2);
                    w_m_accessories_progressbar2.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        ImageView  w_m_accessories_img3 = findViewById(R.id.w_m_accessories_img3);
        TextView w_m_accessories_price3 = findViewById(R.id.w_m_accessories_price3);
        TextView w_m_accessories_sym3 = findViewById(R.id.w_m_accessories_sym3);
        TextView w_m_accessories_content3 = findViewById(R.id.w_m_accessories_content3);
        ProgressBar w_m_accessories_progressbar3 = findViewById(R.id.w_m_accessories_progressbar3);

        DatabaseReference databaseReference15 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/W_M_Accessories/Product3");

        databaseReference15.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    w_m_accessories_content3.setText(text1);
                    w_m_accessories_price3.setText(text2);
                    w_m_accessories_sym3.setText(text3);
                    Picasso.get().load(img).into( w_m_accessories_img3);
                    w_m_accessories_progressbar3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //FRIDGE_ACCESSORIES
        //OTHERS_ACCESSORIES
        ImageView other_accessories_img = findViewById(R.id.other_accessories_img);
        TextView other_accessories_price = findViewById(R.id.other_accessories_price);
        TextView other_accessories_sym = findViewById(R.id.other_accessories_sym);
        TextView other_accessories_content = findViewById(R.id.other_accessories_content);
        ProgressBar other_accessories_progressbar = findViewById(R.id.other_accessories_progressbar);

        DatabaseReference databaseReference16 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Other_Accessories/Product1");

        databaseReference16.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    other_accessories_content.setText(text1);
                    other_accessories_price.setText(text2);
                    other_accessories_sym.setText(text3);
                    Picasso.get().load(img).into( other_accessories_img);
                    other_accessories_progressbar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        ImageView  other_accessories_img2 = findViewById(R.id.other_accessories_img2);
        TextView other_accessories_price2 = findViewById(R.id.other_accessories_price2);
        TextView other_accessories_sym2 = findViewById(R.id.other_accessories_sym2);
        TextView other_accessories_content2 = findViewById(R.id.other_accessories_content2);
        ProgressBar other_accessories_progressbar2 = findViewById(R.id.other_accessories_progressbar2);

        DatabaseReference databaseReference17 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Other_Accessories/Product2");

        databaseReference17.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    other_accessories_content2.setText(text1);
                    other_accessories_price2.setText(text2);
                    other_accessories_sym2.setText(text3);
                    Picasso.get().load(img).into( other_accessories_img2);
                    other_accessories_progressbar2.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        ImageView  other_accessories_img3 = findViewById(R.id.other_accessories_img3);
        TextView other_accessories_price3 = findViewById(R.id.other_accessories_price3);
        TextView other_accessories_sym3 = findViewById(R.id.other_accessories_sym3);
        TextView other_accessories_content3 = findViewById(R.id.other_accessories_content3);
        ProgressBar other_accessories_progressbar3 = findViewById(R.id.other_accessories_progressbar3);

        DatabaseReference databaseReference18 = FirebaseDatabase.getInstance().getReference().child("Main_Page_Products/Accessories_Products/Other_Accessories/Product3");

        databaseReference18.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String text1 = dataSnapshot.child("P_name").getValue(String.class);
                    String text2 = dataSnapshot.child("P_price").getValue(String.class);
                    String text3 = dataSnapshot.child("P_rupee").getValue(String.class);
                    String img = dataSnapshot.child("P_img").getValue(String.class);

                    other_accessories_content3.setText(text1);
                    other_accessories_price3.setText(text2);
                    other_accessories_sym3.setText(text3);
                    Picasso.get().load(img).into( other_accessories_img3);
                    other_accessories_progressbar3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //OTHERS_ACCESSORIES

        back_accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshContent();
            }
        });
    }
    private void refreshContent() {
        recreate();

        swipeRefreshLayout.setRefreshing(false);
    }
}