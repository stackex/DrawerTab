package android.com.drawertab;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dare on 3/29/15.
 */
public class TabsFragment extends Fragment {

    public static Fragment newInstance() {
        TabsFragment fragment = new TabsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tabs, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPager.setAdapter(new SamplePagerAdapter(getActivity().getSupportFragmentManager(), getActivity().getApplicationContext()));
        SlidingTabLayout mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setViewPager(mViewPager);
    }

    class SamplePagerAdapter extends FragmentPagerAdapter {

        private String[] tabTitles = new String[] {"Tab One", "Tab Two"};
        private Context context;

        public SamplePagerAdapter(FragmentManager fm, Context context) {
            super(fm);
            this.context = context;
        }

        @Override
        public int getCount() {
            return tabTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }


        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            android.support.v4.app.Fragment[] fragment = {TabOneFragment.newInstance(), TabTwoFragment.newInstance()};

            return fragment[position];
        }

    }
}
