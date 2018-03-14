package irfan.allapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Seven extends Fragment {


    public Seven() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_seven, container, false);
        WebView myWebView = (WebView) view.findViewById(R.id.webview);
        myWebView.loadUrl("https://www.google.co.in/maps");
        return view;
    }

}
