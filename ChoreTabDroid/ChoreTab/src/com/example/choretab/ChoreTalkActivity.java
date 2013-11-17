package com.example.choretab;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ChoreTalkActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chore_talk);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chore_talk, menu);
		return true;
	}

}
