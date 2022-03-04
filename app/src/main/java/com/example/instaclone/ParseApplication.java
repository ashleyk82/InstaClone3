package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MNxcHgDMtsPSlSJC32pAhqmcfa6bwYbUgfoac7KA")
                .clientKey("j03RQuMi8fSPDutayEw8JRpbyDySiIwZdOs8q9Et")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
