package com.mycompany.state;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.LinearLayout;

public class MainActivity extends Activity { 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		LinearLayout linearLayout = (LinearLayout)findViewById(R.id.rootView);
		
		final ArrayList<Word> words = new ArrayList<Word>();
		words.add(new Word("ਇੱਕ","One" ));
		words.add(new Word("ਦੋ","Two" ));
		words.add(new Word("ਤਿੰਨ","Three" ));
		words.add(new Word("ਚਾਰ","Four" ));
		words.add(new Word("ਪੰਜ","Five" ));
		words.add(new Word("ਛੇ","Six" ));
		words.add(new Word("ਸੱਤ","Seven" ));
		words.add(new Word("ਅੱਠ","Eight" ));
		words.add(new Word("ਨੋ","Nine" ));
		words.add(new Word("ਦਸ","Ten" ));
		words.add(new Word("ਗਿਆਰਾਂ","Elevene" ));
		words.add(new Word("ਬਾਰ੍ਹਾਂ","Twelove" ));
		words.add(new Word("ਤੇਰ੍ਹਾਂ","Thirteen" ));
		words.add(new Word("ਚੋਦਾ","Fourteen" ));
		words.add(new Word("ਪੰਦਰਾਂ","Fifteen" ));
		words.add(new Word("ਸੋਲ੍ਹਾਂ","Sixteen" ));
		WordAdapter newAdapter = new WordAdapter(this, words);
		ListView listView = (ListView) findViewById(R.id.list);
		listView.setAdapter(newAdapter);
	}
}
