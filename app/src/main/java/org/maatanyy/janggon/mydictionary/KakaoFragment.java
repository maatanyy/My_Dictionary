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

public class KakaoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kakao, container, false);
        WebView webView = view.findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());

        Bundle bundle2 = getArguments();
        String text2 = bundle2.getString("text");

        Toast.makeText(getActivity(),text2,Toast.LENGTH_SHORT).show();

       // webView.loadUrl("https://dic.daum.net/index.do?dic=eng");
       // webView.loadUrl("https://dic.daum.net/index.do?dic=eng");

        webView.loadUrl("https://dic.daum.net/search.do?q="+text2+"&dic=eng");


        return view;
    }
}