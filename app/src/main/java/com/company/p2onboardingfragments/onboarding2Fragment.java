package com.company.p2onboardingfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.p2onboardingfragments.databinding.FragmentOnboarding2Binding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link onboarding2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class onboarding2Fragment extends Fragment {

    NavController navController;

    private FragmentOnboarding2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnboarding2Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_onboarding2Fragment_to_onboarding3Fragment);
            }
        });

        binding.botonSaltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_onboarding2Fragment_to_homeFragment);
            }
        });
    }
}