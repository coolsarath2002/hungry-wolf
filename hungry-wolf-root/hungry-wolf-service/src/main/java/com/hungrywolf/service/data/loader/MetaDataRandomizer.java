package com.hungrywolf.service.data.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MetaDataRandomizer {
	private static final String INDIAN_DISHES = "dishes.txt";
	private static final List<String> preferenceList = new ArrayList<String>();
	private static Random rndm=new Random();
	private static final int MIN_REGION_CD = 1;
	private static final int MAX_REGION_CD = 13;
	static {
		if(preferenceList.isEmpty())
			init();
	}
	
	enum CUISINE {
		SOUTHINDIAN("south-indian"),
		NORTHINDIAN("north-indian"),
		OTHER("other");
		
		public String name;
		
		private CUISINE(String name) {
			this.name=name;
		}
		
		public String getName() {
			return this.name;
		}
	}
	
	public enum FEEDWHEN {
		BREAKFAST("BF","BreakFast"),
		BRUNCH("BR","Brunch"),
		LUNCH("LU","Lunch"),
		SNACK("SN","Snack"),
		DINNER("DN","Dinner");
		
		private String value;
		private String desc;
		
		private FEEDWHEN(String value,String desc) {
			this.value=value;
		}
		public String getDesc() {
			return this.desc;
		}
		
		public String getValue() {
			return this.value;
		}
	}

	public static void init() {
		fromFile();
	}
	/*** Read from a file line by line
	 * @return
	 */	
	public static void fromFile() {
		if(preferenceList.isEmpty()) {
			try {
				ClassLoader classLoader = MetaDataRandomizer.class.getClassLoader();
				InputStreamReader inSource = new InputStreamReader(classLoader.getResourceAsStream(INDIAN_DISHES));
				BufferedReader br = new BufferedReader(inSource);
				String addWrd = br.readLine(); 
				while(addWrd!=null && !addWrd.isEmpty()) {
					preferenceList.add(addWrd);
					addWrd=br.readLine();
				}
				br.close();
			}catch(IOException  ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
	/**
	 * Generate the getCuisine based on random #
	 * @return
	 */
	public static String getCuisine() {
		String gender = rndm.nextInt(100) % 2 == 0 ? CUISINE.SOUTHINDIAN.getName() : CUISINE.NORTHINDIAN.getName();
		return gender;
	}
	
	/**
	 * Generate the getCuisine based on random #
	 * @return
	 */
	public static boolean isMainCourse() {
		boolean ismainCourse = rndm.nextInt(100) % 2 == 0 ? true : false;
		return ismainCourse;
	}
	
	/**	 * Generate the random int by a specific range.
	 * @return
	 */
	private static int randomizeIntbyRange(int maxRegionCd, int minRegionCd) {
		Random random = new Random(Double.doubleToLongBits(Math.random()));
		return random.nextInt((maxRegionCd-maxRegionCd) + 1) + maxRegionCd;
	}
	
	/**
	 * Generate a Region Country
	 * @return
	 */
	public static Region getRegion() {
		int countryId = randomizeIntbyRange(MAX_REGION_CD,MIN_REGION_CD);
		Region cnty = Region.get(countryId);
		return cnty;
	}
	
	/**
	 * Generate the random word from file loaded during start-up
	 * @return
	 */
	public static Set<String> getWords(int count, String cuisine,String region) {
		Set<String> rdmWord = new TreeSet<String>();
		if(count==0) {
			return rdmWord;
		}
		rdmWord.add(cuisine);
		rdmWord.add(region);
		for(int i=2;i<=count;i++) {
			rdmWord.add(getWord());
		}
		return rdmWord;
	}
	
	/**
	 * Generate the random word from file loaded during start-up
	 * @return
	 */
	private static String getWord() {
		return preferenceList.get(rndm.nextInt(preferenceList.size()));
	}
}
