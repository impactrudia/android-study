package com.tutorial.rudia.study01_spinner.vo;

public class Country {
    private String mCountryName;
    private int mFlgImage;

    public Country(String countryName, int flagImage){
        mCountryName = countryName;
        mFlgImage = flagImage;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public int getFlgImage() {
        return mFlgImage;
    }
}
