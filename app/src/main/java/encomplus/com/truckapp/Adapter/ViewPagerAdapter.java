package encomplus.com.truckapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import encomplus.com.truckapp.My_Orders;
import encomplus.com.truckapp._Search;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new _Search();
        } else if (position == 1) {
            return new ListFragment();
        } else return new My_Orders();
    }

    @Override
    public int getCount() {
        return 3;
    }
}