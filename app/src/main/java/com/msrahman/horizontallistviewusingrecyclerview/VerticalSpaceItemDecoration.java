package com.msrahman.horizontallistviewusingrecyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by pg3 on 9/25/2017.
 */

public class VerticalSpaceItemDecoration  extends RecyclerView.ItemDecoration {
    private int space;

    public VerticalSpaceItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.top = space;
        outRect.right = space;
        outRect.bottom = space;

        // Add top margin only for the first item to avoid double space between items
        if(parent.getChildAdapterPosition(view) == 0) {
            outRect.left = space;
        }else {
            outRect.left = 0;
        }
    }
}