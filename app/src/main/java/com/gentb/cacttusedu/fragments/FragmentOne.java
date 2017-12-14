package com.gentb.cacttusedu.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gentb.cacttusedu.R;
import com.gentb.cacttusedu.activities.FragmentHolderStatic;

/**
 * Created by gentberani on 12/11/17.
 */

public class FragmentOne extends Fragment {

    //private FragmentHolderStatic fragmentHolder;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //fragmentHolder = (FragmentHolderStatic) context;
        System.out.println("Lifecycle: onAttach");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Lifecycle: onCreate");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        System.out.println("Lifecycle: onCreateView");

        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        System.out.println("Lifecycle: onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("Lifecycle: onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("Lifecycle: onResume");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("Lifecycle: onSaveInstanceState");

    }

    ////////


    @Override
    public void onStop() {
        super.onStop();
        System.out.println("Lifecycle: onStop");

    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("Lifecycle: onPause");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("Lifecycle: onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("Lifecycle: onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("Lifecycle: onDetach");
    }
}
