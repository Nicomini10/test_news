package com.example.test_news.ScaricaCalendarioBundesLiga;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;
import android.os.StrictMode;

import com.example.test_news.ScaricaCalendarioSerieA.DownloadServiceCalendarioSerieA;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadServiceCalendarioBundesLiga extends IntentService {

    public static final String ACTION_DOWNLOAD = "DOWNLOAD";

    public static final String EXTRA_URL = "URL";
    public static final String EXTRA_MESSAGE = "MESSAGE";

    public DownloadServiceCalendarioBundesLiga() {
        super("DownloadService");
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_DOWNLOAD.equals(action)) {
                final String url = intent.getStringExtra(EXTRA_URL);
                downloadFile(url);
            }
        }
    }

    private void downloadFile(String urlStr){
        FileOutputStream fos=null;
        InputStream is=null;
        String message="Download fallito!";
        try {
            // Get InputStream from the url
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            is=connection.getInputStream();
            String fileName = urlStr.substring(urlStr.lastIndexOf('/') + 1);
            fos=new FileOutputStream(Environment.getExternalStorageDirectory()+"/"+fileName);
            byte[] buffer=new byte[1024];
            int count;
            while((count=is.read(buffer))>0){
                fos.write(buffer,0,count);
            }
            fos.flush();
            message="Download completato!";


        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {

            if(fos!=null){
                try {
                    fos.close();

                }catch(IOException e){}

            }
            if(is!=null){
                try {
                    is.close();

                }catch(IOException e){}

            }

            Intent backIntent=new Intent(DownloadServiceCalendarioBundesLiga.ACTION_DOWNLOAD);
            backIntent.putExtra(DownloadServiceCalendarioBundesLiga.EXTRA_MESSAGE, message);
            sendBroadcast(backIntent);
        }
    }

}
