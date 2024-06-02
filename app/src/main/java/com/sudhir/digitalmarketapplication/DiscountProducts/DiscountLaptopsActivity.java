package com.sudhir.digitalmarketapplication.DiscountProducts;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.StrikethroughSpan;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;
import com.sudhir.digitalmarketapplication.R;

public class DiscountLaptopsActivity extends AppCompatActivity {

    TextView strike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_laptops);

        TextView strikeLaptopDiscountTextView = findViewById(R.id.strike_laptop_discount);TextView bulletedTextView = findViewById(R.id.bulletedTextView);

        String bulletList = "<ul>" +
                "<p>"+"<b>Processor: </b>"+"11th Gen Intel Tiger Lake Core i5-1135G7 | Speed: 2.4 GHz (Base) - 4.2 GHz (Max) | 4 Cores | 8MB Cache</p>" +"<br>"+
                "<p>"+"<b>OS and Software: </b>"+"Pre-Loaded Windows 11 Home with Lifetime Validity | MS Office Home and Student 2021 | Xbox GamePass Ultimate 3-month subscription*</p>" + "<br>"+
                "<p>"+"<b>Display:</b>"+" 15.6\" FHD (1920x1080) | Brightness: 300 nits | Anti-Glare | IPS Technology</p>" +"<br>"+
                "<p>"+"<b>Memory, Storage & Graphics: </b>"+"16GB RAM DDR4-3200 | 512 GB SSD | Integrated Intel Iris Xe Graphics</p>" +"<br>"+
                "<p>"+"<b>Design: </b>"+"1.79 cm Thin and 1.66 kg Light | Aluminium Material Top | Backlit Keyboard | Fingerprint Reader</p>" +"<br>"+
                "<p>"+"<b>Camera (Built in) & Audio:</b>"+" HD 720p (1.0MP) Camera | Fixed Focus | Privacy Shutter | Integrated Dual Array Microphone | 2 x 2W Stereo Speakers | HD Audio | Dolby Audio</p>" +"<br>"+
                "<p>"+"<b>Battery Life: </b>"+"8 Hours | 57Wh Battery | Rapid Charge (Up to 80% in 1 Hour)</p>" +"<br>"+
                "<p>"+"<b>Ports:</b>"+" 2 USB 3.2 Gen 1, 1 USB 3.2 Type-C Gen 1, Headphone/Mic combo jack, HDMI 1.4b, 4-in-1 media reader (MMC, SD, SDHC, SDXC)</p>" +"<br>"+
                "<p>"+"<b>Warranty : </b>"+"1 Year Warranty, 1 Year Premium Care, 1 Year Accidental Damage Protection</p>" +"<br>"+
                "<p>"+"<b>Manufacturer: </b>"+"Lenovo, One of the below: Hefei Bitland Information Technology Co.,Ltd - No.4088 Jiuxiu Road National Hefei economic & technology development area Hefei Anhui China LCFC（Hefei) Electronics Technology Co., Ltd. - NO.1-3188,YUNGU ROAD, HEFEI EXPORT PROCESSING ZONE. ANHUI PROVINCE,CHINA  Tech-Com(Shanghai) Computer Co Ltd</p>" + "<br>"+
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