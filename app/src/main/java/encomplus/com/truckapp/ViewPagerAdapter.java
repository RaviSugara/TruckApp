package encomplus.com.truckapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new _Search();
        } else if (position == 1) {
            return new Live_Requests();
        } else return new My_Orders();
    }

    @Override
    public int getCount() {
        return 3;
    }
}