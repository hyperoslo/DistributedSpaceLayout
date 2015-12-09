package no.hyper.distributedspacelayout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;

/**
 * Created by jean on 09/12/15.
 */
public class DistributedSpaceLayout extends LinearLayout {

    private Context context;
    private int spaceInserted = 0;

    public DistributedSpaceLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    protected void onFinishInflate ()
    {
        super.onFinishInflate();
        insertSpaceView();
    }

    private void insertSpaceView() {
        int children = this.getChildCount();
        for (int i = 0 ; i <= children ; i++) {
            this.addView(getNewSpace(), i*2);
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
