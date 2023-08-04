package Day22.연습문제;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTest {
	 public static void main(String[] args) {
		 String numeral="";
		 String s= "112223";
		 //String s = "112223aa";
		 
		 String[] strArr= {"012a","123","123ab","ab123" };
		 String patternStr = "^[0-9]*$";   //숫자 패턴으로 지정
		 Pattern pattern= Pattern.compile(patternStr);
		 Matcher matcher = null;
		 matcher = pattern.matcher(s);
		 while(matcher.find()) {
			 numeral += matcher.group(0);
		 }
		 
		 if(numeral != null && !(numeral.length()==0)) {
			 System.out.println(s+"는 숫자입니다.");
		 }else {
			 System.out.println(s+"는 숫자가 아닙니다.");
		 }
		 numeral="";
	 
		 for (String str: strArr) {
			matcher = pattern.matcher(str);
			while(matcher.find()) {
				numeral+=matcher.group(0);
			}
			
			if(numeral!=null && !(numeral.length()==0)) {
				System.out.println(str+"는 숫자입니다");
			}else {
			System.out.println(str+"는 숫자가 아닙니다");
		}
			numeral="";
			}

		 }//end for
	 }
