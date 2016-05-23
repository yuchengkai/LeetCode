package algorithms;

/**
 * @author yuchengkai
 *
 * @time   2016年3月25日
 *
 */
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
    public static String largestNumber(int[] nums) {
    	int l=nums.length;
    	String []str=new String[l];
    	for(int i=0;i<l;i++)str[i]=""+nums[i];
        Arrays.sort(str,new Comparator<String>(){
        	public int compare(String a,String b){
        		int la=a.length();
        		int lb=b.length();
        		if(la<lb)return -compare(b,a);
        		int i=0;
        		while(i<lb&&a.charAt(i)==b.charAt(i))i++;
        		if(i==lb&&lb==la)return 0;
        		else if(i==lb)return compare(a.substring(lb),b);
        		else return b.charAt(i)-a.charAt(i);
        	}
        });
        StringBuilder sb=new StringBuilder();
        for(String s:str)sb.append(s);
    	return sb.toString();
    }
    public static int compare(String a,String b){
		int la=a.length();
		int lb=b.length();
		if(la<lb)return -compare(b,a);
		int i=0;
		while(i<lb&&a.charAt(i)==b.charAt(i))i++;
		if(i==lb&&lb==la)return 0;
		else if(i==lb)return compare(b,a.substring(lb));
		else return b.charAt(i)-a.charAt(i);
	}
    
    public static int fufn(){
    	Void a;
    	try{
    		System.out.println("try");
    		int b=1/0;
    		System.out.println("try2");
    		return 1;
    	}catch(Exception e){
    		System.out.println("catch");
    		return 2;
    	}finally{
    		System.out.println("final");
    		return 3;
    	}
    	//System.out.println("return");
    	//return ;
    }
    
    
	public static void main(String[] args) throws ParseException {
		System.out.println(fufn());
	}
	
	public static void fun(){
		ObjectMapper map= new ObjectMapper();
		try {
			JsonNode root=map.readTree("[{\"id\":\"id1\",\"value\":\"v1\"},{\"id\":\"id2\",\"value\":\"v2\"},{\"id\":\"id3\",\"value\":\"v3\"}]");
			List<Sub> t=map.readValue("[{\"id\":\"id1\",\"value\":\"v1\"},{\"id\":\"id2\",\"value\":\"v2\"},{\"id\":\"id3\",\"value\":\"v3\"}]",
					new TypeReference<List<Sub>>(){});
			System.out.println(root);
			System.out.println(root.isArray());
			System.out.println(root.get(0));
			System.out.println(root.get(0).get("id").asText());
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getJsonFile()
	  {
	    String strResult = "";
	    ObjectMapper objMapper = new ObjectMapper();

	    try
	    {
	      String strText = "t:/1.json";
	      JsonNode rootNode = objMapper.readTree(new File(strText));
	      
	      Map<String,Object> m=new HashMap<String,Object>();
	      m.put("subject",rootNode);
	      m.put("jfkdf0","fdfd");
	      System.out.println(m);
	      // 获得 json 字符串
	      strResult = rootNode.toString();
	    }
	    catch (JsonProcessingException e)
	    {
	      e.printStackTrace();
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	    return strResult;
	  }
	
	class Sub{
		String id;
		String value;
		public String getId() {
			return id;
		}
		public String getValue() {
			return value;
		}
		public void setId(String id) {
			this.id = id;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
}
