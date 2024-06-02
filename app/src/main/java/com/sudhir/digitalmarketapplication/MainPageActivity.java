package com.sudhir.digitalmarketapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class MainPageActivity extends AppCompatActivity {

    private TextView username2;
    private SharedPreferences sharedPreferences;
    RecyclerView recyclerView;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<ChildModelClass> favoriteList;
    ArrayList<ChildModelClass> recently;

    ArrayList<ChildModelClass> latest;
    ParentAdapter parentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        TextView welcome = findViewById(R.id.textView);
        TextView side_navigation_name = findViewById(R.id.username_side_navigation);
        TextView side_navigation_email = findViewById(R.id.email_id_side_navigation);

        ImageView imageViewDrawerTrigger = findViewById(R.id.imageView_drawer_trigger);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);

        LinearLayout home_side = findViewById(R.id.home_side_navigate);
        LinearLayout categories_side = findViewById(R.id.categories_side_navigate);
        LinearLayout settings_side = findViewById(R.id.settings_side_navigate);
        LinearLayout contact_us_side = findViewById(R.id.contact_us_side_navigate);
        LinearLayout about_us_side = findViewById(R.id.about_us_side_navigate);

        Button loginButton = findViewById(R.id.login_button);

        ExtendedFloatingActionButton fab_named = findViewById(R.id.named_fab_main_page);
        username2 = findViewById(R.id.textView2);

        sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);

        String user_name_side = sharedPreferences.getString("username", "user");
        String email_id_side = sharedPreferences.getString("email", "");
        side_navigation_name.setText(user_name_side);
        side_navigation_email.setText(email_id_side);
        username2.setText(user_name_side);


        recyclerView = findViewById(R.id.rv_parent);
        childModelClassArrayList = new ArrayList<>();
        favoriteList = new ArrayList<>();
        recently = new ArrayList<>();
        latest = new ArrayList<>();
        parentModelClassArrayList = new ArrayList<>();

        latest.add(new ChildModelClass(R.drawable.img_13, "Laptops"));
        latest.add(new ChildModelClass(R.drawable.img_16, "Televisions"));
        latest.add(new ChildModelClass(R.drawable.img_17, "Mobiles"));
        latest.add(new ChildModelClass(R.drawable.img_5, "Refrigerators"));
        latest.add(new ChildModelClass(R.drawable.img_4, "Washing machine"));
        latest.add(new ChildModelClass(R.drawable.img_22, "Accessories"));

        parentModelClassArrayList.add(new ParentModelClass("Top Products", latest));

        parentAdapter = new ParentAdapter(parentModelClassArrayList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);

        sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean("is_logged_in", false);

        ImageView imageView = findViewById(R.id.imageView_person);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference Ref = firebaseDatabase.getReference("Users/sudhir/name");
        DatabaseReference imgRef = firebaseDatabase.getReference("Users/sudhir/user_img");
        imgRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    String profileImageUrl = snapshot.getValue(String.class);
                    Picasso.get().load(profileImageUrl).into(imageView);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Handle error
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isLoggedIn) {
                    // User is logged in, open ProfilePageActivity
                    Intent intent = new Intent(MainPageActivity.this, ProfilePageActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(MainPageActivity.this, SignInActivity.class);
                    startActivity(intent);
                }
            }
        });
        fab_named.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, CategoriesActivity.class));
            }
        });
        imageViewDrawerTrigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        home_side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, MainPageActivity.class));
            }
        });
        categories_side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, CategoriesActivity.class));
            }
        });
        contact_us_side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, ContactUsActivity.class));
            }
        });
        about_us_side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, AboutUsActivity.class));
            }
        });
        if (!isLoggedIn) {
            // User is not logged in, show the login button
            loginButton.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);
            username2.setVisibility(View.GONE);
            welcome.setVisibility(View.GONE);

            // Set click listener for the login button
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Open SignInActivity when login button is clicked
                    Intent intent = new Intent(MainPageActivity.this, SignInActivity.class);
                    startActivity(intent);
                }
            });
        } else {
            // User is logged in, hide the login button
            loginButton.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            username2.setVisibility(View.VISIBLE);
            welcome.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onBackPressed() {
        // Show an alert dialog before exiting
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainPageActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }


    private void refreshContent(){
        parentModelClassArrayList.clear();
        // Load data again...
        loadData();

    }

    private void loadData() {
        // Load your data and populate the lists here...
        // For example, you can add items to your parentModelClassArrayList and childModelClassArrayList.

        // Once data is loaded, update the adapter and UI
        parentAdapter.notifyDataSetChanged();
    }
    private void updateUIWithUsername(String username) {
        TextView usernameTextView = findViewById(R.id.textView2); // Replace with your TextView ID
        usernameTextView.setText("Mr. "+username);
    }
}