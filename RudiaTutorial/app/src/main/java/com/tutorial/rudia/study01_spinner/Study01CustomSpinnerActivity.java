package com.tutorial.rudia.study01_spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.tutorial.rudia.R;
import com.tutorial.rudia.study01_spinner.adapter.Study01CountryAdapter;
import com.tutorial.rudia.study01_spinner.vo.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * id::spinner_basic 선택과 누를 떄 스타일이 다른거 적용시 사용
 * tutorial url : https://androiddvlpr.com/custom-spinner-android/#Android_Spinner_selected_Item_Background
 *
 * id::spinner_countries adapter 형태에 커스텀으로 이미지 글자 이런게 포함될 때 사용
 * tutorial url : https://codinginflow.com/tutorials/android/custom-spinner
 */
public class Study01CustomSpinnerActivity extends AppCompatActivity {
    private List<Country> mCountryList;
    private Study01CountryAdapter mCountryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study01_custom_spinner);

        String[] data = {"Java", "Python", "C++", "C#", "Angular", "Go"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.study01_item_spinner, data);
        adapter.setDropDownViewResource(R.layout.study01_item_spinner_drop_down);

        Spinner spinner = findViewById(R.id.spinner_basic);
        spinner.setAdapter(adapter);
        spinner.setSelection(3);//선택된 데이터 초기값
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Study01CustomSpinnerActivity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        initCountries();

        Spinner spinnerCountries = findViewById(R.id.spinner_countries);
        Study01CountryAdapter countryAdapter = new Study01CountryAdapter(this, mCountryList);
        spinnerCountries.setAdapter(countryAdapter);
        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Country clickedItem = (Country) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getCountryName();
                Toast.makeText(Study01CustomSpinnerActivity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private void initCountries(){
        mCountryList = new ArrayList<>();
        mCountryList.add(new Country("스위스", R.drawable.study01_swise));
        mCountryList.add(new Country("India", R.drawable.study01_india));
    }
}
