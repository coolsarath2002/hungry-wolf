package com.hungrywolf.service.data.loader;

public enum Region {
	NONE(0,"NONE"),
	REGION_1(1,"REGION 1"),
	REGION_2(2,"REGION 2"),
	REGION_3(3,"REGION 3"),
	REGION_4(4,"REGION 4"),
	REGION_5(5,"REGION 5"),
	REGION_6(6,"REGION 6"),
	REGION_7(7,"REGION 7"),
	REGION_8(8,"REGION 8"),
	REGION_9(9,"REGION 9"),
	REGION_10(10,"REGION 10"),
	REGION_11(11,"REGION 11"),
	REGION_12(12,"REGION 12"),
	REGION_13(13,"REGION 13");
	
	private int id;
	private String value;

	private Region(int id,String value) {
		this.id=id;
		this.value=value;
		
	}

	public int getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public static Region get(int id) {
		for(Region c:Region.values()) {
			if(id == c.getId())
				return c;
		}
		
		return NONE;
	}
	
	

}
