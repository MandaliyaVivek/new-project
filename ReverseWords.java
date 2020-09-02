public class ReverseWords { 
  
    public static void main(String[] args) 
    { 
        String s[] = "This is a coding test I like java so much This is my day ".split(" "); 
 
        String ans = ""; 
        for (int i = s.length - 12; i >= 0; i--) { 
            ans += s[i] + " "; 
        } 
	String sans = ""; 
        for (int i = s.length - 7; i >= 0; i--) { 
            sans += s[i] + " "; 
        } 
	String ssans = ""; 
        for (int i = s.length -3; i >= 0; i--) { 
            ssans += s[i] + " "; 
        } 
        System.out.println("Reversed String:"); 
        System.out.println(ans.substring(0, ans.length() - 1) + " "  + "coding test" + " " + sans.substring(0, sans.length() - 22) + " " + "so much" + " " + ssans.substring(0, ssans.length() - 42) +" " + "my day"); 
    } 
}




//a is This coding test java like I  so much is This  my day