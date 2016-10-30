package com.example.dame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstActi extends Activity {
	private Button bt1;
	private Button bt2;
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout2);
	bt1=(Button)findViewById(R.id.button1_first);
	tv=(TextView)findViewById(R.id.textView1);
	bt1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(FirstActi.this, SecondActi.class);
			startActivity(intent);
		}
	});
	bt2=(Button)findViewById(R.id.button2_second);
	bt2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(FirstActi.this, SecondActi.class);
			startActivityForResult(intent, 1);
		}
	});
			}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	if(requestCode==1&&resultCode==2){
		String content=data.getStringExtra("data");
		tv.setText(content);
	}
	}
}
