package jp.ac.it_college.std.seek;

public class GridItemData {
    private int[] itemResNumbers = {
            R.drawable.akuma, R.drawable.bat, R.drawable.farao_white
            , R.drawable.goburin, R.drawable.harpy, R.drawable.sraim
    };

    private String[] itemNames = {
            "akuma", "bat", "farao", "goburin", "harpy"
            ,"sraim"
    };

    public int[] getItemResNumbers() {
        return itemResNumbers;
    }

    public String[] getItemNames() {
        return itemNames;
    }
}
