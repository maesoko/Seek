package jp.ac.it_college.std.seek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity
        implements AdapterView.OnItemClickListener{

    private String[] itemNames;
    private int[] itemResIdNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridItemData gridItemData = new GridItemData();
        itemNames = gridItemData.getItemNames();
        itemResIdNumbers = gridItemData.getItemResNumbers();

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GridItemAdapter(this));
        gridView.setOnItemClickListener(this);

        Random random = new Random();
        ImageView imageView = (ImageView) findViewById(R.id.imgView_seek);
        imageView.setImageResource(
                itemResIdNumbers[random.nextInt(itemResIdNumbers.length)]);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, itemNames[position], Toast.LENGTH_SHORT).show();
    }
}
