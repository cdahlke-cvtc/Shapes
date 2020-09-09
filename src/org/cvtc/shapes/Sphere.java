package org.cvtc.shapes;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Sphere extends Shape{
	
	//Constructor
	public Sphere(float radius) {
		this.radius = Math.abs(radius);
	}
	
	//Fields
	private float radius = 0.0f; //Radius variable
	
	//Methods
	public float getRadius() { //Method for getting radius
		return radius;
	}
	private void setRadius(float radius) { //Method for setting radius
		this.radius = radius;
	}
	
	@Override
	public float surfaceArea() { //Method for calculation of surface area
		return (float) (4* Math.PI * Math.pow(radius, 2));
	}
	@Override
	public float volume() { //Method for calculation of volume
		return (float) ((4/3) * Math.PI * Math.pow(radius, 3));
	}
	@Override
	public void render() { //Render method for displaying message box with the dimensions, surface area, and volume of the object
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "Radius: " + radius +"\nSurface Area: " + this.surfaceArea() + "\nVolume: " + this.volume(), "Sphere", 1);
	}
}
