class Solution {
    public boolean isValidSudoku(char[][] board) {
        return down(board) && side(board) && square(board);
    }

    private boolean side(char[][] board){
        Set<Character> bank = new HashSet<>();
        for(int i = 0; i < board.length;i++){
            bank.clear();
            for(int j = 0;j<board[i].length;j++){
                if (board[i][j] == '.') {
                    continue;
                }
                if(bank.contains(board[i][j])){
                    return false;
                }else{
                    bank.add(board[i][j]);
                }
            }
        }
        return true;
    }

    private boolean down(char[][] board){
        Set<Character> bank = new HashSet<>();
        for(int i = 0; i < board.length;i++){
            bank.clear();
            for(int j = 0;j < board[i].length;j++){
                if (board[j][i] == '.') {
                    continue;
                }
                if(bank.contains(board[j][i])){
                    return false;
                }else{
                    bank.add(board[j][i]);
                }
            }
        }
        return true;
    }

    private boolean square(char[][]board){
        Set<Character> bank = new HashSet<>();
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

            bank.clear();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] == '.') {
                            continue;
                        }

                        if (bank.contains(board[i][j])) {
                            return false;
                        } else {
                            bank.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }

}
