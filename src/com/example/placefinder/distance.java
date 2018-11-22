package com.example.placefinder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class distance extends Activity {
	
	TextView dt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dis);
		dt=(TextView)findViewById(R.id.di);
		String m=getIntent().getStringExtra("S");
		String n=getIntent().getExtras().getString("D");
		if((m.equals("Saidpur") && n.equals("Rajshahi")) ||(m.equals("Rajshahi") && n.equals("Saidpur")) )
		{
			dt.setText(m+" to "+n+ " is\n208.6 km (4 h 27 min )");
		}
		else if((m.equals("Saidpur") && n.equals("Dhaka")) ||(m.equals("Dhaka") && n.equals("Saidpur")) )
		{
			dt.setText(m+" to "+n+ " is\n331.5 km (7 h 9 min)");
		}
		
		
	}

}
