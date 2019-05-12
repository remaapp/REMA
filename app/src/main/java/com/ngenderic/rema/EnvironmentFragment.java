package com.ngenderic.rema;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EnvironmentFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private MainEnvAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public EnvironmentFragment() {
        // Required empty public constructor
    }
    private void changeItem(int p,String c){
        Toast.makeText(getContext(), p + "item " + c,Toast.LENGTH_LONG).show();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);

        return inflater.inflate(R.layout.fragment_environment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<MainEnv> exampleList = new ArrayList<MainEnv>();
        exampleList.add(new MainEnv(R.drawable.sun, "Lake", "Line 2"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Forest", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "River", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.location, "Park", "Line 6"));
        exampleList.add(new MainEnv(R.drawable.location, "Air", "Line 6"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Animals", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "People", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Trees", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Ocean", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Land", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Sea", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Mining Zone", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Mountain", "Line 4"));
        exampleList.add(new MainEnv(R.drawable.umbrera, "Swamp", "Line 4"));


        mRecyclerView = view.findViewById(R.id.recyclerViewEnv);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(view.getContext());
        mAdapter = new MainEnvAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new MainEnvAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String cl= "Clicked";
                changeItem(position, cl);
                Intent send=new Intent(getContext(),ViewEnvironment.class);
                startActivity(send);
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.envir_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.envi_notif) {
            Toast.makeText(getActivity(), "Clicked on " + item.getTitle(), Toast.LENGTH_SHORT)
                    .show();
        }
        return true;
    }
}
