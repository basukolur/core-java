package com.xworkz.block;

public class Block {
	public Block() {
		System.out.println(this.getClass().getSimpleName() + " Object is Created");
	}

	static {
		System.out.println("Block 1");
	}
	{
		System.out.println("Block 2");

	}

	public static void main(String[] args) {
		System.out.println("Method is Started");
		Block block = new Block();
		System.out.println(block);
		System.out.println("Method is Ended");
	}

}
