package jp.ac.it_college.std.seek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

public class MainActivity extends Activity
        implements AdapterView.OnItemClickListener{

    private List<Integer> itemResNumbers;
    private GridView gridView;
    private ImageView seekImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridItemData gridItemData = new GridItemData();
        itemResNumbers = gridItemData.getItemResNumbers();

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GridItemAdapter(this));
        gridView.setOnItemClickListener(this);

        int position = new Random().nextInt(itemResNumbers.size());
        seekImageView = (ImageView) findViewById(R.id.imgView_seek);
        seekImageView.setImageResource(itemResNumbers.get(position));
        seekImageView.setTag(position);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if ((int) seekImageView.getTag() == position) {
            Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
        }
    }
}
