package com.example.choretab;

import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class AddPunishmentActivity extends Activity {


	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_add_punishment);
	    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_punishment, menu);
		return true;
	}
	
	public void onHumilClick(View view)
	{
		Intent intent = new Intent(this, HumiliationDescriptActivity.class);
        startActivity(intent);
	}
	
	public void onMoneyClick(View view)
	{
		Intent intent = new Intent(this, MoneyPunishActivity.class);
		startActivity(intent);
	}

}
