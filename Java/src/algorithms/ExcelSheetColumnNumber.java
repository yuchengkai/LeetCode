package algorithms;

/**
 * @author yuchengkai
 *
 * @time   2016年6月2日
 *
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int res=0;
        for(int i=0,l=s.length();i<l;i++){
            res=res*26+(s.charAt(i)-'A'+1);
        }
        return res;
    }
}

