// Last updated: 8/16/2026, 10:28:45 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i=0;
        int j=0;
        int ans=0;
        while(i< players.length && j< trainers.length){
            if(players[i]<=trainers[j]) {
                //one match, so move forward
                ans++;
                i++;
                j++;
            }else{
                j++;
                //only increase trainer
            }
        }
        return ans;
    }
}