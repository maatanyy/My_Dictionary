package org.maatanyy.janggon.mydictionary;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NaverFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_naver, container, false);
        WebView webView = view.findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());

        Bundle bundle = getArguments();
        String text2 = bundle.getString("text");

        Toast.makeText(getActivity(),text2,Toast.LENGTH_SHORT).show();

     //   String urlString = "https://en.dict.naver.com/#/search?query="+text;
        webView.loadUrl("https://en.dict.naver.com/#/search?query="+text2+"");

        //="+text2+""
        return view;
    }
}