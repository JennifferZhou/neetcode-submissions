class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Have a hashmap where the <row/col/box number> is the key and 
        //  the value is all the seen numbers
        HashMap <Integer, Set<Character>> rows = new HashMap<>();
        HashMap <Integer, Set<Character>> cols = new HashMap<>();
        HashMap <Integer, Set<Character>> boxes = new HashMap<>();
        for (int i = 0; i < board.length; i++) { // traverse through rows
            for (int j = 0; j < board[0].length; j++) { // traverse through cols
                if (board[i][j] == '.') continue;
                Set<Character> s; 
                s = rows.get(i);
                if (s != null) {
                    System.out.println(rows);
                    if(!s.add(board[i][j])) {
                        return false;
                    }
                } 
                else {
                   rows.put(i, new HashSet<Character> ());
                   rows.get(i).add(board[i][j]);
                }
                s = cols.get(j);
                if (s!= null) {
                    System.out.println(cols);
                    if(!s.add(board[i][j])) {
                        return false;
                    }
                } 
                else {
                   cols.put(j, new HashSet<Character> ());
                   cols.get(j).add(board[i][j]);
                }
                s = boxes.get(i/3 * 3 + (j/3));
                if (s != null) {
                    if(!s.add(board[i][j])) {
                        return false;
                    }
                } 
                else {
                    boxes.put((i/3 * 3 + (j/3)), new HashSet<Character> ());
                    boxes.get(i/3 * 3 + (j/3)).add(board[i][j]);
                }
            }
        }
        return true;
    }
}
