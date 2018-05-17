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
        System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Byte");  
        System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("�������ͣ�short ������λ����" + Short.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Short");  
        System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Integer");  
        System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("�������ͣ�long ������λ����" + Long.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Long");  
        System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("�������ͣ�float ������λ����" + Float.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Float");  
        System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("�������ͣ�double ������λ����" + Double.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Double");  
        System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("�������ͣ�char ������λ����" + Character.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Character");  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨  
        System.out.println("��Сֵ��Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨  
        System.out.println("���ֵ��Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }  
}
