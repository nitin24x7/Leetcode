class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int a= source[0]+source[1];
        int b= target[0]+target[1];
        if(source[0]==target[0] && source[1]==target[1]) return 0;
        else if(a==b) return 1;
        else if(source[0]==target[0] || source[1]==target[1]) return 1;
        else if(source[0]==target[1] || source[1]==target[0]) return 1;
        return 2;   
    }
}