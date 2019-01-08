
			
			}
			
			String selectedCarName="";
			int selectedCarReqCount=0;
			double selectedCarPrice=0.0;
			
			for (int i=0;i<p;i++) {
				String currCarName=br.readLine();
				st=new StringTokenizer(br.readLine());
				double currCarPrice=Double.parseDouble(st.nextToken());
				int currCarReqCount=Integer.parseInt(st.nextToken());
				for (int i2=0;i2<currCarReqCount;i2++) {
					br.readLine();
					
				}
				if (currCarReqCount>selectedCarReqCount || (currCarReqCount==selectedCarReqCount && selectedCarPrice>currCarPrice)) {
					selectedCarName=currCarName;
					selectedCarReqCount=currCarReqCount;
					selectedCarPrice=currCarPrice;
				}
			}
			
			if (testCase > 1) {
				System.out.println();
			}
			
			System.out.println("RFP #"+(testCase++)+"\n"+selectedCarName);
		}
	}
}
