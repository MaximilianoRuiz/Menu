package com.example.maxi.menu;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseManager {

    private FirebaseDatabase database;
    private DatabaseReference myRef;

    public FirebaseManager() {
        database = FirebaseDatabase.getInstance();
    }

    public DatabaseReference getUserReference() {
        myRef = database.getReference("users/fygVktGx11VzyoZpbN8LKM75tQM2");
        return myRef;
    }


}
