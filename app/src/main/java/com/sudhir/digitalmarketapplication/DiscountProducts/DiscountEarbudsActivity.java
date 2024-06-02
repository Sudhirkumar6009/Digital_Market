package com.sudhir.digitalmarketapplication.DiscountProducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

import com.sudhir.digitalmarketapplication.R;

public class DiscountEarbudsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_earbuds);
        TextView strikeLaptopDiscountTextView = findViewById(R.id.strike_earbuds_discount);TextView bulletedTextView = findViewById(R.id.bulletedTextView);

        String bulletList = "<ul>" +
                "<p>"+"<b>Playback: </b>"+"Airdopes Atom 81 offer a total playtime of up to 50HRS, including up to 10HRS of playtime per earbud.</p>" +"<br>"+
                "<p>"+"<b>Clear Voice Calls: </b>"+"Be heard clear across voice calls without those usual interruptions, with the Quad Mics ENx Tech enabled Airdopes Atom 81, that cancels out unwanted background noises during calls.</p>" + "<br>"+
                "<p>"+"<b>Drivers: </b>"+"Delve into the boAt immersive auditory experience on Airdopes Atom 81 TWS earbuds courtesy its 13mm audio drivers. Frequency - 20Hz-20KHz</p>" +"<br>"+
                "<p>"+"<b>Super Low Latency: </b>"+"Enjoy a lag less entertainment experience with BEAST Mode for low latency(50ms) so that your gaming sessions always stay smooth.</p>" +"<br>"+
                "<p>"+"<b>ASAP Charge: </b>"+"Courtesy our ASAP Charge tech, the earbuds can garner up to 60Min of playtime in just 5Min of charging.</p>" +"<br>"+
                "<p>"+"<b>Bluetooth Version: </b>"+"Its quipped with the latest Bluetooth v5.3 for faster connectivity.</p>" +"<br>"+
                "<p>"+"<b>Instant Connect: </b>"+"The IWP tech makes it easier to power on the earbuds which occurs as soon as you open the case lid when the earbuds are being kept inside.</p>" +"<br>"+
                "<p>"+"<b>IP Rating:</b>"+"The earbuds are marked with IPX5 water resistance for a carefree listening time wherever you go.</p>" +"<br>"+
                "<p>"+"<b>Touch Controls and Voice Assistant: </b>"+" Its smooth touch control lets one command playback, hands-free voice calls and activate voice assistant with ease.</p>" +"<br>"+
                "<p>"+"<b> Its smooth touch control lets one command playback, hands-free voice calls and activate voice assistant with ease.</b></p>" +"<br>"+
                "</ul>";

        bulletedTextView.setText(Html.fromHtml(bulletList, Html.FROM_HTML_MODE_COMPACT));




// Get the existing text from the TextView
        CharSequence originalText = strikeLaptopDiscountTextView.getText();

// Apply strikethrough formatting to the existing text
        SpannableString spannableString = new SpannableString(originalText);
        spannableString.setSpan(new StrikethroughSpan(), 0, originalText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

// Set the modified SpannableString back to the TextView
        strikeLaptopDiscountTextView.setText(spannableString);
    }
}