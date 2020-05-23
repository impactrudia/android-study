package com.tutorial.rudia.study01_spinner.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorial.rudia.R;
import com.tutorial.rudia.study01_spinner.vo.Country;

import java.util.List;

public class Study01CountryAdapter extends ArrayAdapter<Country> {
    public Study01CountryAdapter(Context context, List<Country> countries) {
        super(context, 0, countries);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.study01_item_contry, parent, false);
        }

        ImageView imageViewFlag = convertView.findViewById(R.id.image_view_flag);
        TextView textViewName = convertView.findViewById(R.id.text_view_name);

        Country currentItem = getItem(position);

        if(currentItem != null) {
            imageViewFlag.setImageResource(currentItem.getFlgImage());
            textViewName.setText(currentItem.getCountryName());
        }

        return convertView;
    }
}
