package com.example.ck_nivetha.edit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText serach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serach = (EditText) findViewById(R.id.searchtxt);
        hide();
    }

    public void hide() {

        serach.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    serach.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.ic_cross), null);

                } else {
                    serach.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.ic_action_name), null);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        serach.setOnTouchListener(new DrawableClickListener.LeftDrawableClickListener(serach) {

            public boolean onDrawableClick() {

                serach.setText("");
                // TODO : insert code to perform on clicking of the LEFT drawable image...

                return true;
            }
        });
        serach.setOnTouchListener(new DrawableClickListener.RightDrawableClickListener(serach) {

            public boolean onDrawableClick() {
                // TODO : insert code to perform on clicking of the RIGHT drawable image...

                serach.setText("");
                return true;
            }

        });

    }
}

