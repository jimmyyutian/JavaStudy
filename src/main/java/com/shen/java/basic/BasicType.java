package com.shen.java.basic;

public class BasicType {

	private byte byteType;
	private short shortType;
	private int intType;
	private long longType;
	private float floatType;
	private double doubleType;
	private boolean booleanType;
	private char charType;
	
	/**
	 * @return the byteType
	 */
	public byte getByteType() {
		return byteType;
	}
	/**
	 * @return the shortType
	 */
	public short getShortType() {
		return shortType;
	}
	/**
	 * @return the intType
	 */
	public int getIntType() {
		return intType;
	}
	/**
	 * @return the longType
	 */
	public long getLongType() {
		return longType;
	}
	/**
	 * @return the floatType
	 */
	public float getFloatType() {
		return floatType;
	}
	/**
	 * @return the doubleType
	 */
	public double getDoubleType() {
		return doubleType;
	}
	/**
	 * @return the booleanType
	 */
	public boolean isBooleanType() {
		return booleanType;
	}
	/**
	 * @return the charType
	 */
	public char getCharType() {
		return charType;
	}
	/**
	 * @param byteType the byteType to set
	 */
	public void setByteType(byte byteType) {
		this.byteType = byteType;
	}
	/**
	 * @param shortType the shortType to set
	 */
	public void setShortType(short shortType) {
		this.shortType = shortType;
	}
	/**
	 * @param intType the intType to set
	 */
	public void setIntType(int intType) {
		this.intType = intType;
	}
	/**
	 * @param longType the longType to set
	 */
	public void setLongType(long longType) {
		this.longType = longType;
	}
	/**
	 * @param floatType the floatType to set
	 */
	public void setFloatType(float floatType) {
		this.floatType = floatType;
	}
	/**
	 * @param doubleType the doubleType to set
	 */
	public void setDoubleType(double doubleType) {
		this.doubleType = doubleType;
	}
	/**
	 * @param booleanType the booleanType to set
	 */
	public void setBooleanType(boolean booleanType) {
		this.booleanType = booleanType;
	}
	/**
	 * @param charType the charType to set
	 */
	public void setCharType(char charType) {
		this.charType = charType;
	}
	
	/**
	 * 
	 */
    public void showBasicTypeInfo() {  
        // byte  
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("包装类：java.lang.Byte");  
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("包装类：java.lang.Short");  
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("包装类：java.lang.Float");  
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }  
}
