package com.example.egittutorialandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * 
 * @author Ishant
 *
 * Welcome to android development 123
 */

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}  
