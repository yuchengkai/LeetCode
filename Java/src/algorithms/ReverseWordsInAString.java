package algorithms;

public class ReverseWordsInAString {
	
	/**
	 * split the string with space.
	 * concatenate every words with space in reverse order.
	 * */
    public String reverseWords(String s) {
        String []str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String t:str){
            if(t.length()>0){
                sb.insert(0," ");
                sb.insert(0,t);
            }
        }
        return sb.toString().trim();
    }
}