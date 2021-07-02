import java.util.Map;
import java.util.TreeMap;

public class Samsung {

	public static void main(String[] args) {
		  
		String str = "samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916,samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995,samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK',29981,samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000,samsung,'Samsung DC97-16991A Assembly Filter',13000";
		
		Map<Integer, String> map = new TreeMap<>();
		String[] arrOfStr = str.split("samsung", 0);
		int strLength = arrOfStr.length;
		int price = 0;
		
		for (int i = 1; i < strLength; i++) {
			arrOfStr[i] = (charRemoveAt(arrOfStr[i], arrOfStr[i].length()-1)).trim();  
			
			for(int j=arrOfStr[i].length()-1 ;j>=0;j--)
			{
				boolean flag = false;
				if(arrOfStr[i].charAt(j)==',')
				{
					price = Integer.parseInt(arrOfStr[i].substring(j+1).trim());
					map.put(price, "samsung"+arrOfStr[i]);
					flag = true;
				}
				if(flag)
				{
					break;
				}
			}
		}
		for (Map.Entry<Integer,String> entry : map.entrySet()) {
		     System.out.println( entry.getValue());
		}      
	}
	public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     }  
}
