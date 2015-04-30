package jp.ac.it_college.std.seek;

import java.util.Arrays;
import java.util.List;

public class GridItemData {
    private List<Integer> itemResNumbers = Arrays.asList(
            R.drawable.akuma, R.drawable.bat, R.drawable.farao_white
            ,R.drawable.goburin, R.drawable.harpy, R.drawable.sraim
            ,R.drawable.ahriman, R.drawable.alraune, R.drawable.devildoll_bk
            ,R.drawable.earth_worm, R.drawable.katana, R.drawable.kinoko
            ,R.drawable.knight, R.drawable.moai, R.drawable.mummy
            ,R.drawable.seed, R.drawable.tarantula, R.drawable.yadokari
    );

    public List<Integer> getItemResNumbers() {
        return itemResNumbers;
    }

}
