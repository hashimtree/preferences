package com.pref.my;
import android.content.SharedPreferences; 
import android.content.Intent; 
import android.app.Activity; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.TextView; 
 public class name extends Activity { 	 
  Button button; 
	    TextView textView; 
	 
	    @Override 
	    protected void onCreate(Bundle savedInstanceState) { 
	        super.onCreate(savedInstanceState); 
	        setContentView(R.layout.activity_1); 
	        button = (Button) findViewById(R.id.button); 
	        textView = (TextView) findViewById(R.id.textView); 
	        String name = getIntent().getStringExtra("name"); 
	        textView.setText("Hello "+name+name); 
   } 
    public void onClick(View view) { 
  
  
    Intent intent = new Intent(name.this, MainActivity.class); 
   
   startActivity(intent); 
	    } }