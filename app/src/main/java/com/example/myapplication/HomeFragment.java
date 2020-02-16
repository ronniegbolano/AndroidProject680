package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getActivity().setTitle("Home");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button searchButton = (Button) v.findViewById(R.id.homeSearch);
        Button storyButton = (Button) v.findViewById(R.id.homeStory);
        Button profileButton = (Button) v.findViewById(R.id.homeProfile);

        storyButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.viewStoryFragment));

        searchButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.searchBarFragment));

        profileButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.profileFragment));



        return v;
    }

    @Override
    public void onClick(View view) {

    }
}
