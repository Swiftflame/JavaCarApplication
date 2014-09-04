/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author Rico
 */
public class Car {
	private String brand;
	private String type;
	private String color;
	private String fuel;
	private int doors;
	private int speed;
	private int currentGear;
	
	public Car() {
		brand = "BMW";
		type = "Z3";
		color = "Black";
		fuel = "Gas";
		doors = 5;
		speed = 0;
		currentGear = 1;
	}
	
	public void setBrand(String aBrand){
		brand = aBrand;
	}
	
	// Hiermee kan de waarde uitgelezen worden
	public String getBrand() {
		return brand;
	}
	
		public void setType(String aType){
		type = aType;
	}
	
	// Hiermee kan de waarde uitgelezen worden
	public String getType() {
		return type;
	}
	
		public void setColor(String aColor){
		color = aColor;
	}
	
	// Hiermee kan de waarde uitgelezen worden
	public String getColor() {
		return color;
	}
	
		public void setFuel(String aFuel){
		fuel = aFuel;
	}
	
	// Hiermee kan de waarde uitgelezen worden
	public String getFuel() {
		return fuel;
	}
	
		public void setDoors(int aDoors){
		doors = aDoors;
	}
	
	// Hiermee kan de waarde uitgelezen worden
	public int getDoors() {
		return doors;
	}
	
	public int getCurrentGear() {
		return currentGear;
	}
	
	// Hiermee kan de waarde uitgelezen worden
	public int getSpeed() {
		return speed;
	}
	
	// Actie
	public void accelerate() {
		speed += 2;
	}
	
	public void brake() {
		if(speed > 0){
		speed -= 2;
		}
	}

	public void gearUp() {
		if(currentGear < 5){
			currentGear ++;
		}
	}
	
	public void gearDown () {
		if(currentGear > 0){
			currentGear --;
		}
	}
}
