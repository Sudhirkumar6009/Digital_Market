package com.sudhir.digitalmarketapplication.DiscountProducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

import com.sudhir.digitalmarketapplication.R;

public class DiscountTvActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_tv);
        TextView strikeLaptopDiscountTextView = findViewById(R.id.strike_tv_discount);TextView bulletedTextView = findViewById(R.id.bulletedTextView2);

        String bulletList = "<ul>" +
                "<p>"+"<b>Resolution: </b>"+"4K Ultra HD (3840 x 2160) | Refresh Rate : 50 Hertz | LED Panel</p>" +"<br>"+
                "<p>"+"<b>Connectivity: </b>"+" 3 HDMI ports to connect set top box, Blu-ray speakers or a gaming console | 2 USB ports to connect hard drives or other USB devices</p>" + "<br>"+
                "<p>"+"<b>Smart TV Features: </b>"+"  Mobile to TV - Mirroring, DLNA | Tap View | Auto Game Mode (ALLM) | HGiG | WiFi Direct | Bluetooth Low Energy</p>" +"<br>"+
                "<p>"+"<b>Sound: </b>"+"20 Watts Output - 2 Ch| Powerful Speakers with Dolby Digital Plus | Adaptive Sound</p>" +"<br>"+
                "<p>"+"<b>Display: </b>"+"Ultra HD (4k) LED Panel | Certified HDR 10+ | Motion Xcelerator | One Billion Color |HLG | Dynamic Crystal Color | UHD Dimming</p>" +"<br>"+
                "<p>"+"<b>Warranty Information: </b>"+"1 Year Comprehensive Warranty and 1 year additional on panel</p>" +"<br>"+
                "<p>"+"<b>Installation: </b>"+"For requesting installation/wall mounting/demo of this product once delivered, please directly call Samsung support (Please visit brand website for tollfree numbers) and provide product's model name as well as seller's details mentioned on the invoice</p>" +"<br>"+
                "<p>"+"<b>Easy returns: </b>"+" This product is eligible for replacement within 10 days of delivery in case of any product defects, damage or features not matching the description provided</p>" +"<br>"+
                "<p>"+"<b>Manufacturer: </b>"+"Samsung India Pvt Ltd, SAMSUNG INDIA ELECTRONICS PVT. LTD. Plot No.P1,SIPCOT Industrial Park Phase-2, Walajahbad Road , Sunguvarchatram Post Sriperumbudur Taluk , Kancheepuram District TamilNadu - 602 106.</p>" +"<br>"+
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