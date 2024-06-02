package com.sudhir.digitalmarketapplication.DiscountProducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

import com.sudhir.digitalmarketapplication.R;

public class DiscountMobileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_mobile);
        TextView strikeLaptopDiscountTextView = findViewById(R.id.strike_mobile_discount);TextView bulletedTextView = findViewById(R.id.bulletedTextView);

        String bulletList = "<ul>" +
                "<p>"+"<b>OS: </b>"+"Android 13.0</p>" +"<br>"+
                "<p>"+"<b>RAM and ROM Capacities: </b>"+"<br>1). 8 GB + 128 GB</p><p>2). 8 GB + 256 GB</p>" + "<br>"+
                "<p>"+"<b>Resolution Details: </b>"+" FHD+ (2412x1080) 120Hz | 1.07 billion hues (10 bit) | 394PPI Pixel Dencity | 3D AMOLED (Flexible)</p>" +"<br>"+
                "<p>"+"<b>Standard maximum brightness: </b>"+"500nits (Typical) Maximum brightness under sunlight: 800nits Up to 950 nits for displaying HDR photos and HDR10+ content</p>" +"<br>"+
                "<p>"+"<b>Product Dimension: </b>"+" 16.24 x 7.42 x 0.8 cm; 540 Grams</p>" +"<br>"+
                "<p>"+"<b>Wireless Communication Technologies: </b>"+"Cellular</p>" +"<br>"+
                "<p>"+"<b>Connectivity Technologies: </b>"+"Bluetooth, Wi-Fi, USB</p>" +"<br>"+
                "<p>"+"<b>Special Features:</b>"+"Touchscreen, Front Camera, USB, Primary Camera, Dual_Sim, Camera, Hybrid Sim Slot</p>" +"<br>"+
                "<p>"+"<b>Other display features: </b>"+"Wireless</p>" +"<br>"+
                "<p>"+"<b>Ports:</b>"+" 2 USB 3.2 Gen 1, 1 USB 3.2 Type-C Gen 1, Headphone/Mic combo jack, HDMI 1.4b, 4-in-1 media reader (MMC, SD, SDHC, SDXC)</p>" +"<br>"+
                "<p>"+"<b>Warranty : </b>"+"1 Year Warranty, 1 Year Premium Care, 1 Year Accidental Damage Protection</p>" +"<br>"+
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