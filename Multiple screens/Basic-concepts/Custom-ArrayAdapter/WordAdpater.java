package com.mycompany.state;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{
	int totalT=0;
	public WordAdapter(Activity context, ArrayList<Word> words) {
		super(context, 0, words);
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View listItemView = convertView;
		if (listItemView ==null) {
			listItemView = LayoutInflater.from(getContext()).inflate(
				R.layout.list_item,parent, false);
		}
		System.out.println("getView " + position+" "+convertView);
		Word currentWord = getItem(position);
		TextView nameTextView = (TextView) listItemView.findViewById(R.id.punjabiText);
		nameTextView.setText(currentWord.getPunjabiText());
		TextView numberTextView = (TextView) listItemView.findViewById(R.id.englishText);
		numberTextView.setText(currentWord.getEnglishText());
		return listItemView;
		}
}
