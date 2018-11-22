package com.example.placefinder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.AutoText;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private AutoCompleteTextView at,atd;
	public Button b,d;
	String s,s1;
	private String[] places={"Rajshahi","Dhaka","Saidpur","Khulna","Chittagong","Sylhet","Jessore","Barisal","Mymensingh","Dinajpur","Chadpur"};
	private String[] places1={"Rajshahi","Dhaka","Saidpur","Khulna","Chittagong","Sylhet","Jessore","Barisal","Mymensingh","Dinajpur","Chadpur"};
	ArrayAdapter<String>adapter;
	ArrayAdapter<String>adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        at=(AutoCompleteTextView)findViewById(R.id.atv);
        atd=(AutoCompleteTextView)findViewById(R.id.atv2);
        b=(Button)findViewById(R.id.b1);
        d=(Button)findViewById(R.id.button1);
        adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, places);
        at.setAdapter(adapter);
        adapter1=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, places1);
        atd.setAdapter(adapter1);
       
   
				
			b.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					String s=at.getText().toString();
					Intent i=new Intent(MainActivity.this,place.class);
					i.putExtra("S", s);
				    startActivity(i);
					
				}
			});
			d.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					String s=at.getText().toString();
					String s1=atd.getText().toString();
					Intent i=new Intent(MainActivity.this,distance.class);
					i.putExtra("S", s);
					Bundle extras=new Bundle();
					extras.putString("D",s1);
					i.putExtras(extras);
				    startActivity(i);
				
				}
			});
}
			
			
			

	
    
    
   

		


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
