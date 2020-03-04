package com.example.test_news.ScaricaCalendarioPremier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.ScaricaCalendarioSerieA.DownloadServiceCalendarioSerieA;

import java.io.File;

public class ScaricaCalendarioPremierActivity extends AppCompatActivity {

    private Context context;
    private TextView tv;
    private String pdfUrl = "http://fratelliminichillows.altervista.org/calendarioPremier.pdf";

    private NotificationCompat.Builder notificationBuilder;
    private static final int MY_NOTIFICATION_ID = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scarica_calendario_premier);

        requestAppPermissions();

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        context = this;
        tv = (TextView) findViewById(R.id.txtmessage);
        Button btDownload = (Button) findViewById(R.id.btdownload);
        btDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent newIntent = new Intent(context, DownloadServiceCalendarioSerieA.class);
                newIntent.setAction(DownloadServiceCalendarioPremier.ACTION_DOWNLOAD);
                newIntent.putExtra(DownloadServiceCalendarioPremier.EXTRA_URL, pdfUrl);
                // Start Download Service
                tv.setText("Downloading...");
                context.startService(newIntent);

            }
        });

    }

    @TargetApi(Build.VERSION_CODES.O)
    private void notifyDownloadComplete() {

        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        String CHANNEL_ID = "my_channel_01";
        CharSequence name = "my_channel";
        String Description = "This is my channel";
        int importance = NotificationManager.IMPORTANCE_HIGH;
        NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, importance);
        mChannel.setDescription(Description);
        mChannel.enableLights(true);
        mChannel.enableVibration(true);
        mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
        mChannel.setShowBadge(false);
        notificationManager.createNotificationChannel(mChannel);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Calendario Scaricato!")
                .setContentText("Premi su questa notifica per visualizzarlo!");


        File file = new File(Environment.getExternalStorageDirectory() + "/calendarioPremier.pdf");

        Intent resultIntent = null;

        if (file.exists()) {
            Uri path = Uri.fromFile(file);
            resultIntent = new Intent(Intent.ACTION_VIEW);
            resultIntent.setDataAndType(path, "application/pdf");
            resultIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(ScaricaCalendarioPremierActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(resultPendingIntent);

        notificationManager.notify(MY_NOTIFICATION_ID, builder.build());

    }

    private BroadcastReceiver DownloadReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            // Display message from DownloadService
            Bundle b = intent.getExtras();
            if (b != null) {

                tv.setText(b.getString(DownloadServiceCalendarioSerieA.EXTRA_MESSAGE));
                notifyDownloadComplete();

            }
        }
    };

    protected void onResume() {
        super.onResume();
        // Register receiver to get message from DownloadService
        registerReceiver(DownloadReceiver, new IntentFilter(DownloadServiceCalendarioPremier.ACTION_DOWNLOAD));


    }

    protected void onPause() {
        super.onPause();
        // Unregister the receiver
        unregisterReceiver(DownloadReceiver);

    }

    private void requestAppPermissions() {
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            return;
        }

        if (hasReadPermissions() && hasWritePermissions()) {
            return;
        }

        ActivityCompat.requestPermissions(this,
                new String[] {
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                }, 0);
    }

    private boolean hasReadPermissions() {
        return (ContextCompat.checkSelfPermission(getBaseContext(), Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
    }

    private boolean hasWritePermissions() {
        return (ContextCompat.checkSelfPermission(getBaseContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
    }
}
