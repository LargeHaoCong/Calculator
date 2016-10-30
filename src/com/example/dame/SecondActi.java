package com.example.dame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActi extends Activity {
private Button bt;
private String content="Hello,我又跳过来了";
	@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.layout3);
	bt=(Button)findViewById(R.id.button1);
	bt.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent data = new Intent();
			data.putExtra("data", content);
			setResult(2, data);
			finish();
		}
	});
	}
}
