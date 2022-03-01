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
		LinearLayout rootView =  (LinearLayout) findViewById(R.id.rootLayout);
		ArrayList<String> texts = new ArrayList<String>();
		texts.add(0, "ekk");
		texts.add(1, "do");
		texts.add(2, "tin");
		texts.add(3, "char");
		texts.add(4, "panj");
		int index=0;
/*
🔴note: while & for loop ਦੋਵਾਂ ਦੇ ਵਿੱਚ index <than ਹੋਣਾ ਚਾਹੀਦਾ 
 Array/ArrayList ਦੇ size ਤੋ। ਨਹੀ ਤਾਂ error ਹੈ & 
 app crash ਹੋ ਜਾਊਗਾ।
for loop ਨਾਲ code ਇਸ ਤਰੀਕੇ ਨਾਲ।
		for (int index=0;index < texts.size();index++) {
			TextView textView = new TextView(this);
			textView.setText(texts.get(index));
			rootView.addView(textView);
		}
*/
//while loop ਨਾਲ code ਇਸ ਤਰੀਕੇ ਨਾਲ।
		while (index < texts.size()) {
			TextView textView = new TextView(this);
			textView.setText(texts.get(index) + "its size is: ");
			rootView.addView(textView);
			index++;
		}
	}
}
