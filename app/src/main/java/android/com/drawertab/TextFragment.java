package android.com.drawertab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dare on 3/29/15.
 */
public class TextFragment extends Fragment {

    public static Fragment newInstance() {
        TextFragment fragment = new TextFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_text, container, false);
    }
}
