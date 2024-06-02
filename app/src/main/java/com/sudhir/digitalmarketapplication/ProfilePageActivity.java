package com.sudhir.digitalmarketapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class ProfilePageActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    Button edit_button;
    ImageView imageView_profile;

    private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        ShapeableImageView image_user = findViewById(R.id.profile_img);

        Button logout = findViewById(R.id.logout_button);
        TextView username_profile_page = findViewById(R.id.username_profile_page);
        TextView email_id_profile_page = findViewById(R.id.email_id_profile_page);
        TextView mobile_no_profile_page = findViewById(R.id.mobile_no_profile_page);
        TextView address_profile_page = findViewById(R.id.address_profile_page);
        ImageView back_profile = findViewById(R.id.back_profile_activity);

        DatabaseReference databaseReference_profile = FirebaseDatabase.getInstance().getReference().child("Users/sudhir");

        databaseReference_profile.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String img = dataSnapshot.child("user_img").getValue(String.class);

                    Picasso.get().load(img).into(image_user);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        back_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfilePageActivity.this, MainPageActivity.class));
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

//
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Users");

        sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);

        String username = sharedPreferences.getString("username", "Not Provided.");
        String mobile_no = sharedPreferences.getString("Mobile", "Not Provided.");
        String email_id = sharedPreferences.getString("email", "Not Provided.");
        String address = sharedPreferences.getString("Address", "Not Provided.");

        username_profile_page.setText(username);
        mobile_no_profile_page.setText(mobile_no);
        email_id_profile_page.setText(email_id);
        address_profile_page.setText(address);


        edit_button = findViewById(R.id.edit_btn_profile);
        imageView_profile = findViewById(R.id.profile_img);
        edit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilePageActivity.this, ProfileEditActivity.class);
                startActivity(intent);
                finish();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("is_logged_in", false);
                editor.apply();

                Intent intent = new Intent(ProfilePageActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            Uri uri = data.getData();
            imageView_profile.setImageURI(uri);
        }
    }
}