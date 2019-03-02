package com.samsung.barracudapff.firebaseexample.java.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyTopPostsFragment extends PostListFragment {

    public MyTopPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        return databaseReference
                .child("user-posts")
                .child(getUid())
                .orderByChild("starCount");
    }
}
