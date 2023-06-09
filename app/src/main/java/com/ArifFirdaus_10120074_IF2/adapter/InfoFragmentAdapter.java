package com.ArifFirdaus_10120074_IF2.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * NAMA    : Arif Firdaus
 * NIM     : 10120074
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */
public class InfoFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    public InfoFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {

        return fragmentList.size();
    }
}

/**
 * NAMA    : Arif Firdaus
 * NIM     : 10120074
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */