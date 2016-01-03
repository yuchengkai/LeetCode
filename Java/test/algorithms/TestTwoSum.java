package algorithms;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
/**
 * @author yuchengkai
 *
 * @time   2015年12月20日
 *
 */
public class TestTwoSum {
	
	TwoSum twosum;
	@Before
	public void setUp(){
		this.twosum=new TwoSum();
	}
	
	@Test
	public void mainTest(){
		int nums[]={2,7,11,15};
		int r[]=twosum.twoSum(nums, 9);
		Assert.assertArrayEquals("error", new int[]{1,2}, r);
	}
	
}
