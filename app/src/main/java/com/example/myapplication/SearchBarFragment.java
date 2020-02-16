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
public class SearchBarFragment extends Fragment implements View.OnClickListener{


    public SearchBarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Search");

        View v = inflater.inflate(R.layout.fragment_search_bar, container, false);

        Button homeButton = (Button) v.findViewById(R.id.searchHome);
        Button storyButton = (Button) v.findViewById(R.id.searchStory);
        Button profileButton = (Button) v.findViewById(R.id.searchProfile);




        homeButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.homeFragment));
        storyButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.viewStoryFragment));
        profileButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.profileFragment));

        return v;
    }

    @Override
    public void onClick(View view) {

    }
}
