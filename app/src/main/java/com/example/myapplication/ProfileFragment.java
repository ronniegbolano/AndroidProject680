package com.example.myapplication;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


public class ProfileFragment extends Fragment{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Profile");

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        Button homeButton = (Button) v.findViewById(R.id.profileHome);
        Button searchButton = (Button) v.findViewById(R.id.profileSearch);
        Button storyButton = (Button) v.findViewById(R.id.profileStory);



        homeButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.homeFragment));
        searchButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.searchBarFragment));
        storyButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.viewStoryFragment));

        TextView textView = v.findViewById(R.id.bankOfAmerica);
        textView.setText(Html.fromHtml("This page takes you to <a href=\"http://www.bankofamerica.com\">Bank of America</a>"));
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView2 = v.findViewById(R.id.bankOfAmerica2);
        textView2.setText(Html.fromHtml("This page takes you to <a href=\"http://www.bankofamerica.com\">Bank of America</a>"));
        textView2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.bankOfAmericaWebView));

        return v;
    }



}
