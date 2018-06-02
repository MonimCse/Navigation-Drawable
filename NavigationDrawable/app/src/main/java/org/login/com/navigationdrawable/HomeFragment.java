package org.login.com.navigationdrawable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    TextView mTvName;
    static  String mName ;
    public static HomeFragment newInstant(String name)
    {
        HomeFragment homeFragment = new HomeFragment();
        mName= name;
        return homeFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle)
    {
        return  inflater.inflate(R.layout.fragment_home,container,false);
    }
}
