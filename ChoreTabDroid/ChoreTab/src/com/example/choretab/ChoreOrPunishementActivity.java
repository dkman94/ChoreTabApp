package com.example.choretab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ChoreOrPunishementActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chore_or_punishement);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chore_or_punishement, menu);
		return true;
	}
	
	public void toAddChore(View view)
	{
		Intent intent = new Intent(this, AddChoreActivity.class);
        startActivity(intent);
	}
	
	public void toAddPunishment(View view)
	{
		Intent intent = new Intent(this, AddPunishmentActivity.class);
		startActivity(intent);
	}

}
