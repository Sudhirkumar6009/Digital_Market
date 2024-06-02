package com.sudhir.digitalmarketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ContactUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        ImageView back_btn = findViewById(R.id.back_contact_us_activity);
        EditText name_input = findViewById(R.id.name_input_contact);
        EditText email_input = findViewById(R.id.email_input_contact);
        EditText message_input = findViewById(R.id.message_input_contact);
        Button send_message_btn = findViewById(R.id.send_message_btn_contact);


        send_message_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String recipientEmail = "sudhir.kuchara@gmail.com";
                String email = "Email from " + email_input.getText().toString();
                String subject = "Message from " + name_input.getText().toString();
                String message = "Name : " +name_input.getText().toString()+"\nEmail address : "+email_input.getText().toString()+"\nMessage : "+message_input.getText().toString();

                composeEmail(recipientEmail,email, subject, message);
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void composeEmail(String recipient,String email, String subject, String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{recipient});
        intent.putExtra(Intent.EXTRA_EMAIL, email);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}