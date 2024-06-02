package com.sudhir.digitalmarketapplication.DiscountProducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

import com.sudhir.digitalmarketapplication.R;

public class DiscountWMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_wmactivity);
        TextView strikeLaptopDiscountTextView = findViewById(R.id.strike_w_m_discount);TextView bulletedTextView = findViewById(R.id.bulletedTextView);

        String bulletList = "<ul>" +
                "<p>"+"<b>Fully-automatic front load washing machine: </b>"+" Best Wash Quality, Energy and Water efficient</p>" +"<br>"+
                "<p>"+"<b>Capacity 8 kg: </b>"+"Suitable for large families</p>" + "<br>"+
                "<p>"+"<b>Energy Rating 5 Star: </b>"+"Best in class efficiency</p>" +"<br>"+
                "<p>"+"<b>Manufacturer Warranty: </b>"+"2 years on product, 10 years on motor (T&C)</p>" +"<br>"+
                "<p>"+"<b>10 washing programs: </b>"+"Cotton, Cotton Large, Mix, Easy Care, Baby Care, Sports Wear, Delicate, Wool, Quick 30, Rinse+Spin, Steam Cycle</p>" +"<br>"+
                "<p>"+"<b>LG Inverter Direct Drive Technology: </b>"+"The drum and motor are connected directly which leads to less noise & vibration and, more durability</p>" +"<br>"+
                "<p>"+"<b>Key Features: </b>"+"6 Motion DD technology provides optimized motion combinations for each fabric type, Hygiene Steam Wash, Tub Clean, Smart Diagnosis System: fast and easy way to troubleshoot issues, Touch Panel</p>" +"<br>"+
                "<p>"+"<b>Special Features: </b>"+"Temperature Range - Cold/20/30/40/60/95ᵒC, Remaining Time Delay, Remaining Time Display, Fuzzy Logic, Child Lock , Crease Care, Shock Proof, Silent operation</p>" +"<br>"+
                "<p>"+"<b>Included In The Box: </b>"+"1 unit of Washing machine, 1 Unit of Inlet Hose, 1 Unit of Spanner, 1 Unit Owner's Manual</p>" +"<br>"+
                "<p>"+"<b>Manufacturer: </b>"+"LG Electronics India Pvt. Ltd., Plot no. A-5, MIDC, Ranjangaon, Tal-Shirur Udyog Vihar, Pune (Maharashtra) PIN- 412220 | serviceindia@lge.com | TEL (TOLL FREE) : 1800 315 9999 / 1800 180 9999, WhatsApp : 9711709999</p>" +"<br>"+
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