package com.example.android.instaclone.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.instaclone.R;

import java.util.ArrayList;

public class AccountSettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);
        setupSettingsList();

        ImageView backArrow = (ImageView) findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AccountSettingsActivity.this.finish();
            }
        });
    }
    public void setupSettingsList(){
        ListView listView = (ListView) findViewById(R.id.LvAccountSettings);
        ArrayList<String>options = new ArrayList<>();
        options.add(getString(R.string.Edit_Profile));
        options.add(getString(R.string.Sign_Out));

        ArrayAdapter adapter = new ArrayAdapter(AccountSettingsActivity.this, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(adapter);
    }
}
