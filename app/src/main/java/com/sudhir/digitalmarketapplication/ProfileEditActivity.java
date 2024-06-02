package com.sudhir.digitalmarketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class ProfileEditActivity extends AppCompatActivity {

    private ImageView imageView_profile,back_btn;
    private EditText editTextUsername, editTextEmail, editTextMobile, editTextAddress;
    private Button buttonLogin;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextMobile = findViewById(R.id.editTextMobile);
        editTextAddress = findViewById(R.id.editTextAddress);
        buttonLogin = findViewById(R.id.buttonLogin);
        back_btn = findViewById(R.id.back_profile_edit_activity);

        sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String email = editTextEmail.getText().toString();
                String mobile = editTextMobile.getText().toString();
                String address = editTextAddress.getText().toString();

                boolean isValid = true; // Initialize to true

                if (username.isEmpty()) { // Check if username is entered
                    editTextUsername.setError("Username is required.");
                    isValid = false;
                }

                if (email.isEmpty()) {
                    // Email is optional, so no need to set an error
                } else if (!email.contains("@")) {
                    editTextEmail.setError("Invalid Email");
                    isValid = false;
                }

                if (mobile.isEmpty()) {
                    // Mobile is optional, so no need to set an error
                } else if (mobile.length() != 10) {
                    editTextMobile.setError("Invalid Mobile number.");
                    isValid = false;
                }

                if (isValid) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", username);
                    editor.putString("email", email);
                    editor.putString("Mobile", mobile);
                    editor.putString("Address", address);
                    editor.apply();

                    Intent intent = new Intent(ProfileEditActivity.this, ProfilePageActivity.class);
                    startActivity(intent);
                    finish(); // Close the login screen
                }
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileEditActivity.this, ProfilePageActivity.class));
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && data != null) {
            Uri imageUri = data.getData();

            // Upload image to Firebase Storage
            StorageReference storageRef = FirebaseStorage.getInstance().getReference().child("profile_images");
            final StorageReference imageRef = storageRef.child("user_" + System.currentTimeMillis() + ".jpg");

            imageRef.putFile(imageUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            // Get download URL of the uploaded image
                            imageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri downloadUri) {
                                    // Save download URL to the Realtime Database
                                    DatabaseReference databaseRef = FirebaseDatabase.getInstance().getReference().child("Users/sudhir");
                                    databaseRef.child("user_img").setValue(downloadUri.toString());

                                    // Update the ImageView with the selected image
                                    imageView_profile.setImageURI(imageUri);
                                }
                            });
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            // Handle upload failure
                        }
                    });
        }
    }

}