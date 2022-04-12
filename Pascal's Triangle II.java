class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            ans.add(getNum(rowIndex,i));
        }
        return ans;
    }
    
    private int getNum(int row,int col){
        if(row == 0 || col == 0 || row == col){
            return 1;
        }
        
        return getNum(row-1,col-1) + getNum(row-1,col);
    }
}
// Time Limit exceeded.

class Solution {
  private final class RowCol {
    private int row, col;

    public RowCol(int row, int col) {
      this.row = row;
      this.col = col;
    }

    @Override
    public int hashCode() {
      int result = (int) (row ^ (row >>> 32));
      return (result << 5) - 1 + (int) (col ^ (col >>> 32)); // 31 * result == (result << 5) - 1
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null) return false;
      if (this.getClass() != o.getClass()) return false;

      RowCol rowCol = (RowCol) o;
      return row == rowCol.row && col == rowCol.col;
    }
  }

  private Map<RowCol, Integer> cache = new HashMap<>();

  private int getNum(int row, int col) {
    RowCol rowCol = new RowCol(row, col);

    if (cache.containsKey(rowCol)) {
      return cache.get(rowCol);
    }

    int computedVal =
        (row == 0 || col == 0 || row == col) ? 1 : getNum(row - 1, col - 1) + getNum(row - 1, col);

    cache.put(rowCol, computedVal);

    return computedVal;
  }

  public List<Integer> getRow(int rowIndex) {
    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i <= rowIndex; i++) {
      ans.add(getNum(rowIndex, i));
    }

    return ans;
  }
}
// Runtime: 108 ms, faster than 5.32% of Java online submissions for Pascal's Triangle II.
// Memory Usage: 42.9 MB, less than 5.28% of Java online submissions for Pascal's Triangle II.

class Solution {
  public List<Integer> getRow(int n) {
    List<Integer> row =
        new ArrayList<>() {
          {
            add(1);
          }
        };

    for (int k = 1; k <= n; k++) {
      row.add((int) ((row.get(row.size() - 1) * (long) (n - k + 1)) / k));
    }

    return row;
  }
}
// Runtime: 1 ms, faster than 88.77% of Java online submissions for Pascal's Triangle II.
// Memory Usage: 41.3 MB, less than 78.58% of Java online submissions for Pascal's Triangle II.
