package com.sudhir.digitalmarketapplication.DiscountProducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

import com.sudhir.digitalmarketapplication.R;

public class DiscountFridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_fridge);
        TextView strikeLaptopDiscountTextView = findViewById(R.id.strike_fridge_discount);TextView bulletedTextView = findViewById(R.id.bulletedTextView);

        String bulletList = "<ul>" +
                "<p>"+"<b>The star rating changes are as per BEE guidelines on or before 1st Jan 2023.</b></p>" +"<br>"+
                "<p>"+"<b>Frost Free Refrigerator :</b>"+" Auto defrost function to prevent ice-build up</p>" +"<br>"+
                "<p>"+"<b>Capacity 224 litres :</b>"+" Suitable for families with 2 to 3 members</p>" +"<br>"+
                "<p>"+"<b>Energy rating:</b>"+" 3 Star- High energy efficiency ;</p>" +"<br>"+
                "<p>"+"<b>Manufacturer warranty:</b>"+" 1 year warranty for the product; 10 years for the compressor</p>" +"<br>"+
                "<p>"+"<b>Inverfter Compressor:</b>"+" The refrigerator comes with Inverter compressor for greater efficiency, durability and silent operation</p>" +"<br>"+
                "<p>"+"<b>Shel type:</b>"+" toughened glass shelves</p>" +"<br>"+
                "<p>"+"<b>Patented Cool Shower Technology:</b>"+" In built air vents placed directly above the food ensure 360 degree superior cooling</p>" +"<br>"+
                "<p>"+"<b>Key Features:</b>"+" Toughened glass shelves: Made with toughened glass, each shelf has the strength to hold weight up to 120 kg.| Cool balance technology: With moisture control technology in the vegetable tray, it ensures up to 30 days of farm freshness for fruits and vegetables | Farm fresh: The refrigerator can retain the farm freshness of your produce for up to 30 days.</p>" +"<br>"+
                "<p>"+"<b>Special Features :</b>"+"Multi Inverter Technology, Intelligent Ambient Sensing Technology, Intelligent Performance, 27L Largest Vegetable Tray, 2.75 inch Thickest Insulation for better cooling retention, Bright LED Lighting with Prism Lens, Long Lasting Freshness with Honeycomb Crisper Technology</p>" +"<br>"+
                "<p>"+"<b>Manufacturer:</b>"+" Godrej & Boyce MFG Co Ltd, Godrej & Boyce Mfg. Co. Ltd., Pirojshanagar, Vikhroli (W), Mumbai - 400 079 Contact: 18002095511 (toll free) Or text ‘Hi’ to 9321665511 on WhatsApp</p>" +"<br>"+
                "<p>"+"<b>Item weight:</b>"+" 47 kg 500 g</p>" +"<br>"+
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