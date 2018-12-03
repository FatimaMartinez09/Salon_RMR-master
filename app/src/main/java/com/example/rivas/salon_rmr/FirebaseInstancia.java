package com.example.rivas.salon_rmr;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;

public class FirebaseInstancia extends FirebaseInstanceIdService {

    private static final String TAG = "NOTIFICACION";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        FirebaseMessaging.getInstance().subscribeToTopic("salon");
        Log.d(TAG, "onTokenRefresh: "+token);
    }
}