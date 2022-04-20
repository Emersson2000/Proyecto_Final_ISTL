package com.wikitude.wikitudestudioandroidapptemplate;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Docentes extends Fragment {

    Button btnCamera;
    View vista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_docentes, container, false);
        btnCamera = vista.findViewById(R.id.botonCamara);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new RuntimePermissionRequestActivity();
                // Obtener el administrador de fragmentos a través de la actividad
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                // Definir una transacción
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // Remplazar el contenido principal por el fragmento
                fragmentTransaction.replace(R.id.Institucion, fragment);
                fragmentTransaction.addToBackStack(null);
                // Cambiar
                fragmentTransaction.commit();
            }
        });
        return vista;

    }

}