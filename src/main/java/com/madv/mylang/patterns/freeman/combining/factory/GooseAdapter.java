package com.madv.mylang.patterns.freeman.combining.factory;

public class GooseAdapter implements Quackable {
	Goose goose;
 
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
  
	public void quack() {
		goose.honk();
	}
 
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
