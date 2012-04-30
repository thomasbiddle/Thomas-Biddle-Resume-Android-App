package com.thomasbiddle.resume;

import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class ThomasBiddleResumeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void show_About(View v) {
    	TextView tv = (TextView) findViewById(R.id.text_About);
    	if (tv.getVisibility() == 0)
    		tv.setVisibility(8);
    	else tv.setVisibility(0);
    }
    public void show_WorkHistory(View v) {
    	TextView tv = (TextView) findViewById(R.id.text_WorkHistory);
    	if (tv.getVisibility() == 0)
    		tv.setVisibility(8);
    	else tv.setVisibility(0);;
    }
    public void show_Education(View v) {
    	TextView tv = (TextView) findViewById(R.id.text_Education);
    	if (tv.getVisibility() == 0)
    		tv.setVisibility(8);
    	else tv.setVisibility(0);
    }
    public void show_Portfolio(View v) {
    	TextView tv = (TextView) findViewById(R.id.text_Portfolio);
    	if (tv.getVisibility() == 0)
    		tv.setVisibility(8);
    	else {
    		tv.setVisibility(0);
    		Pattern linkPattern = Pattern.compile("http://www.ThomasBiddle.com/#work");
    		String linkURL = "http://www.ThomasBiddle.com/#work";
    		Linkify.addLinks(tv, linkPattern, linkURL);
    	}
    }
    public void show_Recommendations(View v) {
    	TextView tv = (TextView) findViewById(R.id.text_Recommendations);
    	if (tv.getVisibility() == 0)
    		tv.setVisibility(8);
    	else tv.setVisibility(0);
    }
    public void show_Facebook(View v) {
    	String url = "https://www.facebook.com/ThomasJBiddle";
    	Intent i = new Intent(Intent.ACTION_VIEW);
    	i.setData(Uri.parse(url));
    	startActivity(i);
    }
    public void show_Twitter(View v) {
    	String url = "https://twitter.com/#!/thomasjbiddle";
    	Intent i = new Intent(Intent.ACTION_VIEW);
    	i.setData(Uri.parse(url));
    	startActivity(i);
    }
    public void show_LinkedIn(View v) {
    	String url = "http://www.linkedin.com/in/thomasbiddle";
    	Intent i = new Intent(Intent.ACTION_VIEW);
    	i.setData(Uri.parse(url));
    	startActivity(i);
    }
    public void show_Website(View v) {
    	String url = "http://www.ThomasBiddle.com";
    	Intent i = new Intent(Intent.ACTION_VIEW);
    	i.setData(Uri.parse(url));
    	startActivity(i);
    }
}