package com.sudhir.digitalmarketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.data.model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignUpActivity extends AppCompatActivity {
    private EditText signup_name, signup_password;
    private Button signup;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView sign_in_text_sign_up_page = findViewById(R.id.sign_in_text_sign_up_page);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Users"); // "Users" path

        signup_name = findViewById(R.id.sign_up_username); // Replace with your EditText ID
        signup_password = findViewById(R.id.sign_up_password); // Replace with your EditText ID
        signup = findViewById(R.id.create_account_btn); // Replace with your Button ID

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = signup_name.getText().toString();
                final String password = signup_password.getText().toString();
                final String email = name; // Get user's email from input
                if (password.isEmpty()){
                    signup_password.setError("Password is Empty !");
                }

                // Check if the email already exists in the database
                databaseReference.child(email).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            // Email already exists, show an error message
                            signup_name.setError("Username already exist !");

                        } else {
                            // Email doesn't exist, create a new user
                            UserClass user = new UserClass(name, password, email);
                            databaseReference.child(email).setValue(user);
                            Toast.makeText(SignUpActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Log.e("SignUpActivity", "Database error: " + databaseError.getMessage());
                    }
                });
            }
        });

        sign_in_text_sign_up_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                finish();
            }
        });
    }
}