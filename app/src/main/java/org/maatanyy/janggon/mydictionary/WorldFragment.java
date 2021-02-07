package org.maatanyy.janggon.mydictionary;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class WorldFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View view= inflater.inflate(R.layout.fragment_world, container, false);
        WebView webView = view.findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);

        webView.setWebChromeClient(new WebChromeClient());

        Bundle bundle4 = getArguments();
        String text2 = bundle4.getString("text");

        Toast.makeText(getActivity(),text2,Toast.LENGTH_SHORT).show();
        webView.loadUrl("https://papago.naver.com/?sk=en&tk=ko&hn=0&st="+text2+"");

        return view;
    }
}