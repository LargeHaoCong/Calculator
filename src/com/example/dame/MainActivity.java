package com.example.dame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	private AutoCompleteTextView acTextView;
	private String[]res={"CG1","CG2","CG3","CC1","cc2"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		acTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, res);
		acTextView.setAdapter(adapter);		
	}
}
