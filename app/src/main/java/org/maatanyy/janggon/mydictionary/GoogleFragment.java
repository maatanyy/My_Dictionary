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

public class GoogleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_google, container, false);
        WebView webView = view.findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());

      Bundle bundle3 = getArguments();
      String text2 = bundle3.getString("text");

      Toast.makeText(getActivity(),text2,Toast.LENGTH_LONG).show();

        webView.loadUrl("https://translate.google.co.kr/?hl=ko&sl=auto&tl=ko&text="+text2+"%0A%0A&op=translate");
        // webView.loadUrl("http://translate.google.com");


        return view;
    }
}