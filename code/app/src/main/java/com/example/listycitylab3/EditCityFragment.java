package com.example.listycitylab3;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class EditCityFragment extends DialogFragment {
    interface  EditCityDialogListener {
        void editCity(City city);
    }

    private EditCityDialogListener listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
}
