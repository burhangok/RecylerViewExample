package ismek.com.attilalhan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PoetryAdapter extends RecyclerView.Adapter<PoetryAdapter.PoetryHolder> {

List<PoetryItem> poetryItemList = new ArrayList<>();
LayoutInflater layoutInflater;

    public PoetryAdapter(Activity activity,List<PoetryItem> poetryItemList) {
        this.poetryItemList = poetryItemList;
        this.layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public PoetryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View rowView;

        rowView = layoutInflater.inflate(R.layout.poetry_row_layout,null);
        PoetryHolder poetryHolder = new PoetryHolder(rowView);
        return poetryHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final PoetryHolder poetryHolder, int i) {


        final PoetryItem poetryItem = poetryItemList.get(i);

        poetryHolder.titleT.setText(poetryItem.getTitle());
        poetryHolder.subtitleT.setText(poetryItem.getSubTitle());

        poetryHolder.titleT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDetail = new Intent(poetryHolder.itemView.getContext(),PoetryDetailActivity.class);
                toDetail.putExtra("TITLE",poetryItem.getTitle());
                toDetail.putExtra("POETRY",poetryItem.getPoetry());

                poetryHolder.itemView.getContext().startActivity(toDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return poetryItemList.size();
    }

    class PoetryHolder extends RecyclerView.ViewHolder {

TextView titleT,subtitleT;

        public PoetryHolder(@NonNull View itemView) {
            super(itemView);
            titleT = itemView.findViewById(R.id.title);
            subtitleT= itemView.findViewById(R.id.subtitle);

        }
    }



}
