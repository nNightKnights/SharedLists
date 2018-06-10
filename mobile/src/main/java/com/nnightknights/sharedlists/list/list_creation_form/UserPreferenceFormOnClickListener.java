package com.nnightknights.sharedlists.list.list_creation_form;

import android.view.View;
import android.widget.TextView;

import com.nnightknights.sharedlists.CreateList;

public class UserPreferenceFormOnClickListener implements View.OnClickListener{
    private TextView favoriteTextView;
    private TextView pinnedTextView;
    private ClickEventHandler clickEventHandler;

    public UserPreferenceFormOnClickListener(TextView favoriteTextView, TextView pinnedTextView, ClickEventHandler clickEventHandler){
        this.favoriteTextView = favoriteTextView;
        this.pinnedTextView = pinnedTextView;
        this.clickEventHandler = clickEventHandler;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == favoriteTextView.getId()){
            clickEventHandler.toggleFavorite();
        }
        if (v.getId() == pinnedTextView.getId()){
            clickEventHandler.togglePinned();
        }
    }

    public interface ClickEventHandler{
        void toggleFavorite();
        void togglePinned();
    }
}
