// Last updated: 6/8/2025, 11:07:31 pm
class Solution {
    public int numberOfWays(String corridor) {
        int ts = 0;
		int seat = 0;
		int plant=0;
		long ans=1;
		int mod = 1000_000_007;
		boolean c=false;
		for(int i=0;i<corridor.length();i++) {
			if(corridor.charAt(i)=='S') {
				ts++;
				seat++;
			}else if(seat==0) {
				plant++;
			}
			if(seat==2) {
				if(c==false) {
					c=true;
				}else {
					ans= (ans*(plant+1))%mod;
				}
				seat=0;
				plant=0;
			}
		}
		if((ts&1)==1 || ts==0) {
			return 0;
		}
		return (int)(ans);
    }
    
}