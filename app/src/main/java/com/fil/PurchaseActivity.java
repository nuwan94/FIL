package com.fil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        setTitle("Purchase History");
    }
}
