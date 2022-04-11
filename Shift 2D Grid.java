class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for(;k>0;k--){
            int previous = grid[grid.length - 1][grid[0].length - 1];
            for(int row=0;row<grid.length;row++){
                for(int col=0;col< grid[0].length;col++){
                    int temp = grid[row][col];
                    grid[row][col] = previous;
                    previous = temp;
                }
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for(int[] row: grid){
            List<Integer> listRow = new ArrayList<>();
            result.add(listRow);
            for(int v:row) listRow.add(v);
        }
        
        return result;
    }
}
// Runtime: 5 ms, faster than 92.64% of Java online submissions for Shift 2D Grid.
// Memory Usage: 43 MB, less than 84.88% of Java online submissions for Shift 2D Grid.
