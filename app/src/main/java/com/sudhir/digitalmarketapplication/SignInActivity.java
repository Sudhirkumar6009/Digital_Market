package com.sudhir.digitalmarketapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class SignInActivity extends AppCompatActivity {

    EditText login_name,login_password;
    Button login_btn;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        login_name = findViewById(R.id.login_username);
        login_password = findViewById(R.id.login_password);
        login_btn = findViewById(R.id.login_btn);

        TextView sign_up_here = findViewById(R.id.sign_up_text_sign_in_page);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validateUsername() | !validatePassword()){

                } else {
                    checkUser();
                }
            }
        });

        sign_up_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
                finish();
            }
        });
    }
    public  Boolean validateUsername() {
        String val = login_name.getText().toString();
        if (val.isEmpty()) {
            login_name.setError("Username cannot be empty");
            return false;
        } else {
            login_name.setError(null);
            return true;
        }
    }
    public  Boolean validatePassword() {
        String val = login_password.getText().toString();
        if (val.isEmpty()) {
            login_password.setError("Password cannot be empty");
            return false;
        } else {
            login_password.setError(null);
            return true;
        }
    }
    public void checkUser(){
        String  User_username = login_name.getText().toString().trim();
        String  User_password = login_password.getText().toString().trim();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
        Query checkUserDatabase = reference.orderByChild("name").equalTo(User_username);

        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    login_name.setError(null);
                    String passwordFromDB = snapshot.child(User_username).child("password").getValue(String.class);

                    if (Objects.equals(passwordFromDB, User_password)) {
                        login_password.setError(null);

                        sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean("is_logged_in", true);
                        editor.apply();

                        Intent intent = new Intent(SignInActivity.this, ProfilePageActivity.class);
                        intent.putExtra("username", User_username);
                        editor.putString("saved_username", User_username);
                        editor.apply();

                        startActivity(intent);
                        finish();
                    } else {
                        login_password.setError("Invalid Credentials");
                        login_password.requestFocus();
                    }
                } else {
                    login_password.setError("User not exist");
                    login_password.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Handle error if needed
            }
        });

    }
}