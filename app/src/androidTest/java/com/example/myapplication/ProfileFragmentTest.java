package com.example.myapplication;


import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;


public class ProfileFragmentTest {



    @Rule
    public ActivityTestRule<MainActivity> mainActivity = new ActivityTestRule<MainActivity>(MainActivity.class);


    @Test
    public void testLaunch() {
        //check if constraintLayout is empty or not

        ConstraintLayout cLayout = (ConstraintLayout) mainActivity.getActivity().findViewById(R.layout.fragment_profile);
        assert(cLayout != null);

    }


}