package no.hyper.distributedspacelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;

public class DistributedSpaceLayout extends LinearLayout {

    private Context context;
    private boolean start;
    private boolean end;

    public DistributedSpaceLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.DistributedSpaceLayout, 0, 0);

        try {
            start = a.getBoolean(R.styleable.DistributedSpaceLayout_start, true);
            end = a.getBoolean(R.styleable.DistributedSpaceLayout_end, true);
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    protected void onFinishInflate () {
        super.onFinishInflate();
        insertSpaceView();
    }

    private void insertSpaceView() {
        int children = this.getChildCount();
        for (int i = 0 ; i <= children ; i++) {
            this.addView(getNewSpace(), i*2);
        }

        if(!start) {
            this.removeView(this.getChildAt(0));
        }

        if(!end) {
            this.removeView(this.getChildAt(this.getChildCount() - 1));
        }
    }

    private Space getNewSpace() {
        Space space = new Space(context);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT, 1.0f);
        space.setLayoutParams(params);
        return space;
    }
}
