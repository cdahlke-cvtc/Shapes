package org.cvtc.shapes;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Cylinder extends Shape {
	
	//Constructor
	public Cylinder(float radius, float height) {
		this.radius = Math.abs(radius);
		this.height = Math.abs(height);
	}
	
	//Fields
	private float radius = 0.0f; //Radius variable
	private float height = 0.0f; //Height variable
	
	//Methods 
	public float getRadius() { //Method for getting radius
		return radius;
	}
	private void setRadius(float radius) { //Method for setting radius
		this.radius = radius;
	}
	
	public float getHeight() { //Method for getting height
		return height;
	}
	private void setHeight(float height) { //Method for setting height
		this.height = height;
	}
	
	@Override
	public float surfaceArea() { //Method for calculation of surface area
		return (float) ((2*Math.PI*radius * height) + (2* Math.PI * Math.pow(radius, 2)));
	}
	@Override
	public float volume() { //Method for calculation of volume
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}
	@Override
	public void render() { //Render method for displaying message box with the dimensions, surface area, and volume of the object
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "Radius: " + radius + "\nHeight: " + height + "\nSurface Area: " + this.surfaceArea() + "\nVolume: " + this.volume(), "Cylinder", 1);
		
	}
	
}
