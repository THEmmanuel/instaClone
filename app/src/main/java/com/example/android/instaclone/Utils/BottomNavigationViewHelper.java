package com.example.android.instaclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.android.instaclone.Likes.LikesActivity;
import com.example.android.instaclone.Home.MainActivity;
import com.example.android.instaclone.Profile.ProfileActivity;
import com.example.android.instaclone.R;
import com.example.android.instaclone.Search.SearchActivity;
import com.example.android.instaclone.Share.ShareActivity;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setUpBottomNavigationView(BottomNavigationView bottomNavigationView){
    }

    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent homeIntent = new Intent(context, MainActivity.class);
                        context.startActivity(homeIntent);
                        break;

                    case R.id.ic_search:
                        Intent searchIntent = new Intent(context, SearchActivity.class);
                        context.startActivity(searchIntent);
                        break;

                    case R.id.ic_circle:
                        Intent shareIntent = new Intent(context, ShareActivity.class);
                        context.startActivity(shareIntent);
                        break;

                    case R.id.ic_alert:
                        Intent likesIntent = new Intent(context, LikesActivity.class);
                        context.startActivity(likesIntent);
                        break;

                    case R.id.ic_profile:
                        Intent profileIntent = new Intent(context, ProfileActivity.class);
                        context.startActivity(profileIntent);
                        break;
                }

                return false;
            }
        });


    }
}
