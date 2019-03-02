package com.samsung.barracudapff.firebaseexample.java.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class Post {

    // TODO: 02.03.2019

    @Exclude
    public Map<String, Object> toMap() {
        // TODO: 02.03.2019
        return null;
    }

}
