package com.hcl.boxing;

public class OverLoadDemo {
	public void show(int x){
		System.out.println("Show method w.r.t to integer " +x);
	}
	public void show(String x){
		System.out.println("Show method w.r.t to String " +x);
	}
	public void show(boolean x){
		System.out.println("Show method w.r.t to boolean " +x);
	}
	public void show(double x){
		System.out.println("Show method w.r.t to Double " +x);
	}
	public static void main(String[] args) {
		OverLoadDemo obj=new OverLoadDemo();
		obj.show(12);
		obj.show(true);
		obj.show(12.5);
		obj.show("HCL");
	}
}
