package com.dietapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class LogInfo extends Activity {
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.loginfo);
	    TextView tv = (TextView) findViewById(R.id.logInfoFinal);
	    tv.setText("You were 200 calories over your goal.");
	    
	}

}
