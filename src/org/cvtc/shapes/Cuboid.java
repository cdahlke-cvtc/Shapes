package org.cvtc.shapes;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Cuboid extends Shape {
	
	//Constructor 
	public Cuboid(float width, float height, float depth) {
		this.width = Math.abs(width);
		this.height = Math.abs(height);
		this.depth = Math.abs(depth);
	}
	
	//Fields
	private float width = 0.0f; //Width variable
	private float height = 0.0f; //Height variable
	private float depth = 0.0f; //Depth variable
	
	//Methods
	public float getWidth() { //Method for getting width
		return width;
	}
	private void setWidth(float width) { //Method for setting width
		this.width = width;
	}
	
	public float getHeight() { //Method for getting height
		return height;
	}
	private void setHeight(float height) { //Method for setting height
		this.height = height;
	}
	
	public float getDepth() { //Method for getting depth
		return depth;
	}
	private void setDepth(float depth) { //Method for setting depth
		this.depth = depth;
	}
	
	@Override
	public float surfaceArea() { //Method for calculation of surface area
		return 2*((depth*width) + (width*height) + (height*depth));
	}
	@Override
	public float volume() { //Method for calculation of volume
		return (depth*width*height);
	}
	@Override
	public void render() { //Render method for displaying message box with the dimensions, surface area, and volume of the object
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "Width: " + width + "\nHeight: " + height + "\nDepth: " + depth + "\nSurface Area: " + this.surfaceArea() + "\nVolume: " + this.volume(), "Cuboid", 1);
	}
	
}
