package com.asion.test;

public class TestWsp {

	public static void main(String args[]) {
		
		
		//TCString sStartTime=TCTime::Now();
		long startTime=System.currentTimeMillis();
		//printf("start parse \n");
		System.out.println("start parse");
		for(int i=0;i<10000000;i++)
		//for(int i=0;i<100;i++)	
		{
			
			//String sLineCDR = "2014-07-31T22:42:37:298Z,460028816829212,3523890497,P6_-697761065,,,32946,44101,1,0,0,1,183,1,1411,10.211.57.47,10.0.0.172,59445,9201,1,175,1,1403,266,64,,32,MAUI WAP Browser,,http://info.3g.qq.com/g/s?sid=Abk4Gd1eWUrCJBazv4Xm8nac&aid=news_ss&pid=10&id=news_20140731037755&pos=news_jxpic&lpid=1&day=&fr=&icfa=infocenter&iarea=,";
			//TCStringList lMLSFieldList;
			//lMLSFieldList.Clear();
			//lMLSFieldList.CommaText(sLineCDR,',', false);
			//String fileds[] = sLineCDR.split(",");
			
			/*
			String sTime = fileds[0];
			String sImsi = fileds[1];
			String sWspSession = fileds[3];
			
			int nEvent = Integer.parseInt(fileds[4].equals("")?"0":fileds[4]);
			int nLac = Integer.parseInt(fileds[6].equals("")?"0":fileds[6]);
			int nCell = Integer.parseInt(fileds[7].equals("")?"0":fileds[7]);
			int nSubSession = Integer.parseInt(fileds[9].equals("")?"0":fileds[9]);
			int nAppSession = Integer.parseInt(fileds[10].equals("")?"0":fileds[10]);
			
			int nUpByte = Integer.parseInt(fileds[20].equals("")?"0":fileds[20]);
			int nDownByte = Integer.parseInt(fileds[22].equals("")?"0":fileds[22]);
			int nRespondTime = Integer.parseInt(fileds[23].equals("")?"0":fileds[23]); 
			int nMethod = Integer.parseInt(fileds[24].equals("")?"0":fileds[24]); 
			int nWtpAbortReason = Integer.parseInt(fileds[25].equals("")?"0":fileds[25]);
			int nWspResponseStatus = Integer.parseInt(fileds[26].equals("")?"0":fileds[26]);
			//int nMobileType = Integer.parseInt(fileds[27].equals("")?"0":fileds[27]);
			int nMobileMmsFlag = Integer.parseInt(fileds[28].equals("")?"0":fileds[28]);
			
			String sUrl = fileds[29];
			//int nNetType = Integer.parseInt(fileds[30].equals("")?"0":fileds[30]);
			 
			 */
			
			
			
		}
		//printf("end parse\n");
		long endTime=System.currentTimeMillis();
		System.out.println("end parse");
		System.out.println("second="+((endTime-startTime)/1000));
		
		
	}
}
