package se.jakobkrantz.transit.app.viewholders;/*
 * Created by krantz on 14-11-24.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import se.jakobkrantz.transit.app.R;
import se.jakobkrantz.transit.app.base.ViewHolderClickListener;

public class ViewHolderLoadHeader extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final View v;
    private final ViewHolderClickListener listener;
    public TextView loadMore;

    public ViewHolderLoadHeader(View v, final ViewHolderClickListener listener) {
        super(v);
        this.v = v;
        this.listener = listener;
        loadMore = (TextView) v.findViewById(R.id.res_load_more);
        CardView cw = (CardView) v.findViewById(R.id.resultCardHeader);
        cw.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        listener.onViewClick(v, getPosition());
    }
}