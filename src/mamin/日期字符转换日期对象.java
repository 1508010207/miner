/**
 * 
 */
package mamin;

/**
 * @author miner
 *@package_name:chenchen
*@file_name:日期字符串转换成日期对象.java
*@date-time:2017年11月14日下午2:35:28
*@location:https://github.com/1508010207/miner.git
 */
import java.util.Date;
public class 日期字符转换日期对象 {
public static void main(String[] args)
{
	System.out.println("当前时刻：");
	System.out.println(new Date().toString());
	System.out.println("转换显示格式后：");
	System.out.println(convertCommonDateStr(new Date().toString()));}
public static String convertCommonDateStr(String commonDateStr)
{
StringBuffer result=new StringBuffer(" ");
String arrStr[]=commonDateStr.split(" ");
result.append(arrStr[5]).append("-");
result.append(convertMonthStr(arrStr[1],true)).append("-");
result.append(arrStr[2]).append(" ");
result.append(arrStr[3]);
return result.toString();
}
public static String convertMonthStr(String monthStr,boolean isWithZero)
{
	String monthResult="";
	if("jan".equals(monthStr))
		monthResult="01";
	else if("feb".equals(monthStr))
		monthResult="02";
	else if("mar".equals(monthStr))
		monthResult="03";
	else if("apr".equals(monthStr))
		monthResult="04";
	else if("may".equals(monthStr))
		monthResult="05";
	else if("jun".equals(monthStr))
		monthResult="06";
	else if("jul".equals(monthStr))
		monthResult="07";
	else if("aug".equals(monthStr))
		monthResult="08";
	else if("sep".equals(monthStr))
		monthResult="09";
	else if("oct".equals(monthStr))
		monthResult="10";
	else if("nov".equals(monthStr))
		monthResult="11";
	else if("dec".equals(monthStr))
		monthResult="12";
		if(!isWithZero){
			if(monthResult.startsWith("0"))
				monthResult=monthResult.substring(1,2);
		}
		return monthResult;
}
}
