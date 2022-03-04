package com.*.*;
 
import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity { 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		ArrayList<Akkhar> akkhar = new ArrayList<Akkhar>();
		akkhar.add(new Akkhar("ਇੱਕ","One" ));
		akkhar.add(new Akkhar("ਦੋ","Two" ));
		akkhar.add(new Akkhar("ਤਿੰਨ","Three" ));
		akkhar.add(new Akkhar("ਚਾਰ","Four" ));
		akkhar.add(new Akkhar("ਪੰਜ","Five" ));
		akkhar.add(new Akkhar("ਛੇ","Six" ));
		akkhar.add(new Akkhar("ਸੱਤ","Seven" ));
		akkhar.add(new Akkhar("ਅੱਠ","Eight" ));
		akkhar.add(new Akkhar("ਨੋ","Nine" ));
		akkhar.add(new Akkhar("ਦਸ","Ten" ));
		akkhar.add(new Akkhar("ਗਿਆਰਾਂ","Elevene" ));
		akkhar.add(new Akkhar("ਬਾਰ੍ਹਾਂ","Twelove" ));
		akkhar.add(new Akkhar("ਤੇਰ੍ਹਾਂ","Thirteen" ));
		akkhar.add(new Akkhar("ਚੋਦਾ","Fourteen" ));
		akkhar.add(new Akkhar("ਪੰਦਰਾਂ","Fifteen" ));
		akkhar.add(new Akkhar("ਸੋਲ੍ਹਾਂ","Sixteen" ));
		AkkharAdapter Adapter = new AkkharAdapter(this, akkhar);
		ListView listView = (ListView)findViewById(R.id.listView);
		listView.setAdapter(Adapter);
	}
}
