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
//ਇਹ Array ਹੈ ਪਰ ਆਪਾ ਅੱਗੇ ਜਾਕੇ ArrayList ਦਾ use ਕਰਾਗੇ ArrayAdapter ਦੇ ਨਾਲ।
//because array fixed size ਦੀ ਹੁੰਦੀ ਹੈ ਤੇ array ਨੂੰ ਆਪਾ change ਨਹੀ ਕਰ ਸਕਦੇ। 
// ArrayList ਦਾ ਕੋਈ fixed size ਨਹੀ ਹੁੰਦਾ। 
		String[] words = new String[5];
		words[0] = "One";
		words[1] = "Two";
		words[2] = "Three";
		words[3] = "Four";
		words[4] = "Five";
	    //rootView xml ਦੇ ਵਿੱਚ coded ਹੈ ਜੋ LinearLayout ਹੈ।
		final LinearLayout rootView = (LinearLayout)findViewById(R.id.rootLayout);
		int index=0;
		while (index <= 4) {
			//java ਦੇ ਵਿੱਚ TextView code ਕੀਤਾ। 
			TextView wordsView = new TextView(this);
			wordsView.setText(words[index]);
			//wordsView ਨੂੰ addView ਦੀ help ਨਾਲ rootView ਦੇ ਵਿੱਚ add ਕੀਤਾ।
			rootView.addView(wordsView);
			index++;
		}
	}
}
