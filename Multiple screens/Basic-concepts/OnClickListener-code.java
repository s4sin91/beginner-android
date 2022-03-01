package com.mycompany.state;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends Activity { 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//ਇਹ code onClickListener ਦਾ ਹੈ।
		final TextView textView = (TextView)findViewById(R.id.textView);
		Button button = (Button)findViewById(R.id.btnB);
		button.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View view) {
					Toast.makeText(MainActivity.this, "text changed done!!!", Toast.LENGTH_LONG).show();
					textView.setText("new text assigned");
				}
			});

	}
}
