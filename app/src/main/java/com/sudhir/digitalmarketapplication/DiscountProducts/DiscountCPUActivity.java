package com.sudhir.digitalmarketapplication.DiscountProducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

import com.sudhir.digitalmarketapplication.R;

public class DiscountCPUActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_cpuactivity);
        TextView strikeLaptopDiscountTextView = findViewById(R.id.strike_cpu_discount);TextView bulletedTextView = findViewById(R.id.bulletedTextView);

        String bulletList = "<ul>" +
                "<p>"+"<b>Processor: </b>"+"Intel Core i5-12400 (up to 4.4 GHz with Intel Turbo Boost Technology, 18 MB L3 cache, 6 cores, 12 threads)</p>" +"<br>"+
                "<p>"+"<b>Memory & Storage: </b>"+"8 GB DDR4-3200 MHz RAM (1 x 8 GB)| 512 GB PCIe NVMe M.2 SSD storage| Expansion Slots: 2 M.2; 1 PCIe x16; 1 PCIe x1</p>" + "<br>"+
                "<p>"+"<b>Operating System & Software: </b>"+"Pre-loaded Windows 11 Home| Microsoft Office Home & Student 2021</p>" +"<br>"+
                "<p>"+"<b>Graphics & Networking: </b>"+"Intel UHD Graphics 730 | Networking : Integrated 10/100/1000 GbE LAN, Realtek RTL8822CE 802.11a/b/g/n/ac (2x2) Wi-Fi and Bluetooth 5 wireless card</p>" +"<br>"+
                "<p>"+"<b>Ports: </b>"+"4 USB Type-A 5Gbps signaling rate; 1 headphone/microphone combo/4 USB 2.0 Type-A; 1 audio-in; 1 audio-out; 1 RJ-45; HP Serial Port Adapter|Expansion slots : 2 M.2; 1 PCIe x16; 1 PCIe x1| Keyboard& Pointing device: HP 125 USB Black Wired Keyboard and Mouse</p>" +"<br>"+
                "<p>"+"<b>Wireless Communication Technologies: </b>"+"Cellular</p>" +"<br>"+
                "<p>"+"<b>Manufacturer : </b>"+"HP, HP India Sales Pvt. Ltd.</p>" +"<br>"+
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