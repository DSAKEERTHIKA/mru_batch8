package com.mru.oops;

class Parent12{
	public void dbConn() {
		System.out.println("data from oracle soon....!");
	}
}

class Child12 extends Parent12{
	public void dbConn() {
		System.out.println("data from mongodb soon....!");
	}
}
public class OOPS5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child12 obj = new Child12();
		obj.dbConn();

	}

}
