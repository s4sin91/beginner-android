package com.mycompany.state;

public class Word {
	private String mPunjabi;
	private String mEnglish;
	Word(String punjabi, String english){
		mPunjabi = punjabi;
		mEnglish = english;
	}
	public String getPunjabiText(){
		return mPunjabi;
	}
    public String getEnglishText(){
		return mEnglish;
	}
}
