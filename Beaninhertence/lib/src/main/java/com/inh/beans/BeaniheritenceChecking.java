package com.inh.beans;

public class BeaniheritenceChecking {
 private int x,y,z,l,m,w,k;

public BeaniheritenceChecking(int x, int y, int z, int l, int m, int w, int k) {
	super();
	this.x = x;
	this.y = y;
	this.z = z;
	this.l = l;
	this.m = m;
	this.w = w;
	this.k = k;
}

@Override
public String toString() {
	return "BeaniheritenceChecking [x=" + x + ", y=" + y + ", z=" + z + ", l=" + l + ", m=" + m + ", w=" + w + ", k="
			+ k + "]";
}



}
