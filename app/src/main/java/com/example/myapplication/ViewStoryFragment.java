package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


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

        Button homeButton = (Button) v.findViewById(R.id.storyHome);
        Button searchButton = (Button) v.findViewById(R.id.storySearch);
        Button profileButton = (Button) v.findViewById(R.id.storyProfile);




        homeButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.homeFragment));
        searchButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.searchBarFragment));
        profileButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.profileFragment));


        return v;
    }

}
