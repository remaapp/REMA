package com.ngenderic.rema;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;


/**
 * A simple {@link Fragment} subclass.
 */
public class Mapragment extends Fragment {
      public static final int ERROR_DIALOG_REQUEST=9001;

    public Mapragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);

        return inflater.inflate(R.layout.fragment_mapragment, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (isServiceOk()){
            initialiseMap();
        }
    }

    public void initialiseMap(){
        Button btn=(Button) getView().findViewById(R.id.buttonshowmap);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fullmap=new Intent(getContext(),MapActivity.class);
                startActivity(fullmap);
            }
        });

    }
    public boolean isServiceOk(){
        int availbale= GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getContext());
        if (availbale== ConnectionResult.SUCCESS){
            //everything fine
            return true;
        }
        else if(GoogleApiAvailability.getInstance().isUserResolvableError(availbale)){
            //resolvable error
            Dialog dial=GoogleApiAvailability.getInstance().getErrorDialog((Activity) getContext(),availbale,ERROR_DIALOG_REQUEST);
            dial.show();
        }
        else{
            Toast.makeText(getContext(),"Map not Available",Toast.LENGTH_LONG).show();
        }
        return false;
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.map_menu, menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.map_menus) {
            Toast.makeText(getActivity(), "Clicked on " + item.getTitle(), Toast.LENGTH_SHORT)
                    .show();
        }

        return true;
    }

}
