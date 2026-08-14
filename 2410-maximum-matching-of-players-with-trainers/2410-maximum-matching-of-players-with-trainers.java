import java.util.Arrays;
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
    int count=0;
    int j=0;
    Arrays.sort(players); 
    Arrays.sort(trainers);
    for(int i=0;i<players.length;i++){
        while(j<trainers.length){
            if(players[i]<=trainers[j]){
                count++;
                j++;
                break;
            }
            j++;
        }
    }
    return count; 

    }
}