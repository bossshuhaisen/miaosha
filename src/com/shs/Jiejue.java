package com.shs;

public class Jiejue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution =new Solution();
		
				
	}

}

class Solution {
    public int lengthOfLastWord(String s) {
        if (s==null||"".equals(s))	return 0;
        int count=0;
        for (int i=s.length()-1;i>=0;i--) {
        	if (s.charAt(i)!=' ') count++;
        	break;
        }
        return count;
    }
    
}
