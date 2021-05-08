/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

import automation.test.soundboxfrance.activity.MainActivity;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String token) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener( new OnSuccessListener<InstanceIdResult>() {
                    @Override
                    public void onSuccess(InstanceIdResult instanceIdResult) {
                        String newToken = instanceIdResult.getToken();
                        Log.e("newToken", newToken);
                    }
                });
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this,"E5R1ERZ");
        notificationBuilder.setContentTitle("SOUNDBOX FRANCE NOTIFICATION");
        notificationBuilder.setContentText(Objects.requireNonNull(remoteMessage.getNotification()).getBody());
        notificationBuilder.setAutoCancel(true);
        notificationBuilder.setSmallIcon(R.mipmap.ic_launcher);
        notificationBuilder.setContentIntent(pendingIntent);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0,notificationBuilder.build());
    }
}
