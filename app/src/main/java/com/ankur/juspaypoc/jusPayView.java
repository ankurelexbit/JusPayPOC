package com.ankur.juspaypoc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class jusPayView extends ActionBarActivity {

    WebView webView;
    String logger = jusPayView.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jus_pay_view);
        webView = (WebView) findViewById(R.id.webView);
        String url = getIntent().getStringExtra("url");
//        Log.d(logger, url);
        Log.d(logger, "<iframe src=\"https://api.juspay.in/merchant/ipay?order_id=guest_ord_110011&merchant_id=5AB510362A304BD5BF7F52C82F671AB3&mobile=true\" width=\"630\" height=\"400\" style=\"border: 1px solid #CCC;padding: 20px;height: auto;min-height: 300px;\"> </iframe>");
        webView.loadData("<iframe src=\"https://api.juspay.in/merchant/ipay?order_id=guest_ord_110011&merchant_id=5AB510362A304BD5BF7F52C82F671AB3&mobile=true\" width=\"630\" height=\"400\" style=\"border: 1px solid #CCC;padding: 20px;height: auto;min-height: 300px;\"> </iframe>", "text/html", "utf-8");
//        webView.loadUrl(url);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jus_pay_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
