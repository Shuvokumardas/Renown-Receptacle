package com.example.placefinder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class place extends Activity {
	
	TextView t;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find);
		t=(TextView)findViewById(R.id.t);
		String m=getIntent().getStringExtra("S");
		
		if(m.equals("Saidpur"))
		{
			t.setText("Saidpur is a Upazilla located in Rangpur Divison Under Nilphamari Zilla.Saidpur is Famous For Railway Factory, Airport, Cantonment etc. Saidpur is also called Educational City. You Can Travel To Saidpur By Bus, Plane and Train.");
		}
		else if(m.equals("Dhaka"))
		{
			t.setText("Dhaka is Capital Of Bangladesh");
		}
		else if(m.equals("Khulna"))
		{
			t.setText("Khulna is One Of The Most Top Division Of Bangladesh.");
		}
		else if(m.equals("Rajshahi"))
		{
			t.setText("Rajshahi Is The Worst City OF Bangladesh. Don't Come Here. :P");
		}
		else if(m.equals("Chittagong"))
		{
			t.setText("Chittagong is City OF Port");
		}
		else if(m.equals("Dinajpur"))
		{
			t.setText("Dinajpur is Located in Rangpur Division.");
		}
		else
		{
			t.setText("\n\n\n           Sorry!!Your Searched Location\n                     Is Not Available");
		}
		
		
	
		
		
	}
	

}
