package android.com.drawertab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.ViewHolder> {
    private String mNavTitles[];

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View itemView,int ViewType) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.rowText);

            itemView.setOnClickListener(MainActivity.drawerItemClickListener);
        }
    }

    public DrawerAdapter(String[] titles) {
        mNavTitles = titles;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.drawer_item_row, parent, false);
        ViewHolder vhItem = new ViewHolder(v, viewType);

        return vhItem;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(mNavTitles[position]);
    }

    @Override
    public int getItemCount() {
        return mNavTitles.length;
    }
}