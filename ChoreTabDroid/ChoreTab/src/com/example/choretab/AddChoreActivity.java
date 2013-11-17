package com.example.choretab;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddChoreActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_chore);
		//addItemsOnSpinner();
	}

/*	
	public void addItemsOnSpinner() {
		//choreSpinner = (Spinner) findViewById(R.id.choreSpinner);
		List<String> list = new ArrayList<String>();
		list.add("Clean the dishes.");
		list.add("Clean the Bathroom.");
		list.add("Vacuum the living room.");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		choreSpinner.setAdapter(dataAdapter);	 
	}
*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_chore, menu);
		return true;
	}
	
	

}
