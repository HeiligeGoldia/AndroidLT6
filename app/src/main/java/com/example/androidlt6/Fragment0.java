package com.example.androidlt6;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment0 extends Fragment {

    private EditText inputname;
    private Button btnadd;
    private MainActivity mainActivity;

    public Fragment0() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_0, container, false);

        inputname = (EditText) view.findViewById(R.id.txtName1);
        btnadd = (Button) view.findViewById(R.id.button1);
        btnadd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = inputname.getText().toString();
                mainActivity.showText(name);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity) {
            this.mainActivity = (MainActivity) context;
        }
    }
}