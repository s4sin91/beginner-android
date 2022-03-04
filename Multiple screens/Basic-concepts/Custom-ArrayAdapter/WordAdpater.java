package com.b4brar.puntrans;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.b4brar.puntrans.Akkhar;
import java.util.ArrayList;

public class AkkharAdapter extends ArrayAdapter<Akkhar>{
	AkkharAdapter(Activity context, ArrayList<Akkhar> akkhar){
		super(context,0,akkhar);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View listItemView = convertView;
		if(listItemView==null){
			listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
		}
		Akkhar currentAkkhar = getItem(position);
		TextView punTextView = (TextView)listItemView.findViewById(R.id.punjabiText);
		punTextView.setText(currentAkkhar.getEnglish());
		TextView engTextView = (TextView)listItemView.findViewById(R.id.englishText);
	    engTextView.setText(currentAkkhar.getPunjabi());
		return listItemView;
	}
    
}
//****/
