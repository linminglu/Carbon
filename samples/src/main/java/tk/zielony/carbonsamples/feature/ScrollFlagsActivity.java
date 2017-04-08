package tk.zielony.carbonsamples.feature;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import carbon.widget.RecyclerView;
import tk.zielony.carbonsamples.R;
import tk.zielony.carbonsamples.SamplesActivity;

public class ScrollFlagsActivity extends SamplesActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollflags);

        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        /*RowListAdapter<AvatarTextListItemActivity.SampleItem> adapter = new RowListAdapter<>(AvatarTextListItemActivity.SampleItem.class, AvatarTextRow::new);
        recycler.setAdapter(adapter);
        adapter.setItems(Stream.generate(AvatarTextListItemActivity.SampleItem::new).limit(10).collect(Collectors.toList()));
*/
    }
}
