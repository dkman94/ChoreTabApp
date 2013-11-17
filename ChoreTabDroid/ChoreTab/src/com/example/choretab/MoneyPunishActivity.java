package com.example.choretab;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MoneyPunishActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_money_punish);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.money_punish, menu);
		return true;
	}

}
