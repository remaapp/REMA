package com.ngenderic.rema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewEnvironment extends AppCompatActivity {
          TextView usagedesc,treat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_environment);
        usagedesc=(TextView) findViewById(R.id.importantdesc);
        treat= (TextView) findViewById(R.id.treatementdesc);
        usagedesc.setText("This is the software product that come in true time it will be used buy all type of retailer and shopkeeper to help them preventing losses comes from forgetting the date the purchase their customer forgetting whom they give loan and do not get it back. This software will be for mobile platform that are easy for retailer and shopkeeper to use it.\n" +
                "How it will do it?\n" +
                "Once the retailer and shopkeeper purchase a new product packets he will need to mention the list of product that made on a particular date and corresponding expired date so that SRA software will remind him or her before being expired. It will suggest some action to like sell it immediately at price nearest to cost and others then retailer and shopkeeper take action.\n" +
                "In Addition he will require to mention the sold product to be removed from the list once product took to long in shop and frequently reach to nearest expiration date it will suggest him to let not sell it in his shop  this software will  be useful to the shop will high capital and much product .\n" +
                "Also this app will give place to retailer and shopkeeper to register the customer with debit date that they took it and amount this software will remind him the customer that have never paid him in week go and those who will mostly late to pay they debit\nv");
        treat.setText("Maintaining goodwill with the public is an important long-term strategy for both small and large companies. A variety of public relations tactics are used to reach out to customers through unpaid-for media messages. Press releases are one of the most common and routine PR tactics. This is when a we will sends an overview of a major change or event, product launch or other news to various media outlets. Press conferences, features news reports" +
                " and newsletters are other common PR tools. A general objective of PR is to keep your brand in front of people even beyond paid ads. ");
    }

}
