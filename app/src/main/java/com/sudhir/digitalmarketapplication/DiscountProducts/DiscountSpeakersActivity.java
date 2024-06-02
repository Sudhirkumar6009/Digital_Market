package com.sudhir.digitalmarketapplication.DiscountProducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

import com.sudhir.digitalmarketapplication.R;

public class DiscountSpeakersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_speakers);
        TextView strikeLaptopDiscountTextView = findViewById(R.id.strike_speakers_discount);TextView bulletedTextView = findViewById(R.id.bulletedTextView);

        String bulletList = "<ul>" +
                "<p><b>Dolby Atmos. Multidimensional audio experience</b></p><br>"+
                "<p><b>HDMI eARC for the latest surround sound formats</b></p><br>"+
                "<p><b>Chromecast, Apple AirPlay 2, Bluetooth, optical</b></p><br>"+
                "<p><b>Up-firing speakers. Heightens the excitement</b></p><br>"+
                "<p><b>3.1.2 channels. 330 W RMS. 660 W max (10% THD)</b></p><br>"+
                "<p><b>Dedicated center channel. Crystal-clear dialogue</b></p><br>"+
                "<p><b>4K pass-through. Dual HDMI inputs</b></p><br>"+
                "<p><b>Easily connect to your favorite sources</b></p><br>"+
                "<p><b>Smart soundbar. Use with your favorite AI voice assistant</b></p><br>"+
                "<p><b>Distinctive geometric design. Easy placement</b></p><br>"+
                "<p><b>Mounting Hardware: </b>1N Wireless Subwoofer, 2N AAA Battery, 1N Wall mount kit (Wall Brackets x2, Screws x2, Dowels x2), 1N Soundbar, 1N Safety Sheet, 1N Power Cord, 1N Warranty card, 1N Remote Control</p><br>"+
                "<p><b>Manufacturer: </b>Philips Audio, TPV Display Technology(Xiamen) Co., Ltd. no.1.Xianghai road,Xiamen Torch Hi - Tech Industrial Development Zone, Xiamen City, China</p><br>"+
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