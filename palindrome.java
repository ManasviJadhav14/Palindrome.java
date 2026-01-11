class Solution {

    public boolean isPalindrome(int x) {

        // Agar number negative hai or last digit 0 hai (except 0), toh palindrome nahi 
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;  

        while (x > reversedHalf) {

            int lastDigit = x % 10;          
            reversedHalf = reversedHalf * 10 + lastDigit;  
            x = x / 10;                     
        }
        // Agar even length ka number hai to x == reversedHalf
        // Agar odd length ka number hai to middle digit ignore karo aur yeh follow karo: reversedHalf/10
        return (x == reversedHalf || x == reversedHalf / 10);
    }
        
   
}

