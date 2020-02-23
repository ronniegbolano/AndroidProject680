package com.example.myapplication;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewStoryFragment extends Fragment {


    public ViewStoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Story");

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_view_story, container, false);

        String[] images = getFiles();
        //initalize GridView

        GridView gv = v.findViewById(R.id.gridView);

        gv.setAdapter(new ImageAdapter(getContext(),images));
        
        Button homeButton = (Button) v.findViewById(R.id.storyHome);
        Button searchButton = (Button) v.findViewById(R.id.storySearch);
        Button profileButton = (Button) v.findViewById(R.id.storyProfile);

        homeButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.homeFragment));
        searchButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.searchBarFragment));
        profileButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.profileFragment));
        return v;
    }

    public String[] getFiles(){
        String[] files = null;
        try {
            String path = Environment.getRootDirectory().toString()+"/assets";

            AssetManager assetManager = getResources().getAssets();
            files = assetManager.list("");


        } catch (IOException e) {
            e.printStackTrace();
        }
        return files;
    }




}
