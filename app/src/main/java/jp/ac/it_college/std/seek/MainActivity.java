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

    private int[] itemResNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridItemData gridItemData = new GridItemData();
        itemResNumbers = gridItemData.getItemResNumbers();

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GridItemAdapter(this));
        gridView.setOnItemClickListener(this);

        Random random = new Random();
        ImageView imageView = (ImageView) findViewById(R.id.imgView_seek);
        imageView.setImageResource(
                itemResNumbers[random.nextInt(itemResNumbers.length)]);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, itemResNumbers[position], Toast.LENGTH_SHORT).show();
    }
}
