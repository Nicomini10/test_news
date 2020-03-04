package com.example.test_news;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.test_news.Campionati_activity.BundeligaActivity;
import com.example.test_news.Campionati_activity.LigaActivity;
import com.example.test_news.Campionati_activity.Ligue1Activity;
import com.example.test_news.Campionati_activity.PremierActivity;
import com.example.test_news.Campionati_activity.SerieaActivity;
import com.example.test_news.Contatti.ContattiActivity;
import com.example.test_news.Info.InfoActivity;
import com.example.test_news.LiveScore.LiveScoreActivity;
import com.example.test_news.News.DetailsActivity;
import com.example.test_news.News.Function;
import com.example.test_news.Statistiche_SerieA.StatisticheActivity;
import com.example.test_news.Video.VideoActivity;
import com.google.android.material.navigation.NavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;

    String API_KEY = "8190df9eb51445228e397e4185311a66"; // ### YOUE NEWS API HERE ###
    String NEWS_SOURCE = "football-italia"; // Other news source code at: https://newsapi.org/sources
    ListView listNews;
    ProgressBar loader;

    ArrayList<HashMap<String, String>> dataList = new ArrayList<>();
    static final String KEY_AUTHOR = "author";
    static final String KEY_TITLE = "title";
    static final String KEY_DESCRIPTION = "description";
    static final String KEY_URL = "url";
    static final String KEY_URLTOIMAGE = "urlToImage";
    static final String KEY_PUBLISHEDAT = "publishedAt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        listNews = findViewById(R.id.listNews);
        loader = findViewById(R.id.loader);
        listNews.setEmptyView(loader);



        if (Function.isNetworkAvailable(getApplicationContext())) {
            DownloadNews newsTask = new DownloadNews();
            newsTask.execute();
        } else {
            Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_LONG).show();
        }


        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }




    class DownloadNews extends AsyncTask<String, Void, String> {
        @Override
        protected void onPreExecute() { super.onPreExecute(); }

        protected String doInBackground(String... args) {
            String xml = Function.excuteGet("https://newsapi.org/v1/articles?source=" + NEWS_SOURCE + "&sortBy=top&apiKey=" + API_KEY);
            return xml;
        }

        @Override
        protected void onPostExecute(String xml) {

            if (xml.length() > 10) { // Just checking if not empty

                try {
                    JSONObject jsonResponse = new JSONObject(xml);
                    JSONArray jsonArray = jsonResponse.optJSONArray("articles");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        HashMap<String, String> map = new HashMap<>();
                        map.put(KEY_AUTHOR, jsonObject.optString(KEY_AUTHOR));
                        map.put(KEY_TITLE, jsonObject.optString(KEY_TITLE));
                        map.put(KEY_DESCRIPTION, jsonObject.optString(KEY_DESCRIPTION));
                        map.put(KEY_URL, jsonObject.optString(KEY_URL));
                        map.put(KEY_URLTOIMAGE, jsonObject.optString(KEY_URLTOIMAGE));
                        map.put(KEY_PUBLISHEDAT, jsonObject.optString(KEY_PUBLISHEDAT));
                        dataList.add(map);
                    }
                } catch (JSONException e) {
                    Toast.makeText(getApplicationContext(), "Unexpected error", Toast.LENGTH_SHORT).show();
                }

                ListNewsAdapter adapter = new ListNewsAdapter(MainActivity.this, dataList);
                listNews.setAdapter(adapter);

                listNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        Intent i = new Intent(MainActivity.this, DetailsActivity.class);
                        i.putExtra("url", dataList.get(+position).get(KEY_URL));
                        startActivity(i);
                    }
                });

            } else {
                Toast.makeText(getApplicationContext(), "No news found", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_seriea) {

            Intent intent = new Intent(getApplicationContext(), SerieaActivity.class);
            startActivity(intent);


        } else if (id == R.id.nav_Premier) {

            Intent intent = new Intent(getApplicationContext(), PremierActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_liga) {

            Intent intent = new Intent(getApplicationContext(), LigaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_bundeliga) {

            Intent intent = new Intent(getApplicationContext(), BundeligaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_ligue_1) {

            Intent intent = new Intent(getApplicationContext(), Ligue1Activity.class);
            startActivity(intent);

        }else if (id == R.id.nav_live_match) {

            Intent intent = new Intent(getApplicationContext(), LiveScoreActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_video_match) {

            Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_statistiche) {

            Intent intent = new Intent(getApplicationContext(), StatisticheActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_contatti) {

            Intent intent = new Intent(getApplicationContext(), ContattiActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_info) {

            Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
            startActivity(intent);
        }

        return true;
    }


}