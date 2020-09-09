package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		
		//Objects
		Cuboid cuboid = new Cuboid(5, 5, 5); //Cuboid Object 
		Cylinder cylinder = new Cylinder(2, 4); //Cylinder object
		Sphere sphere = new Sphere(10); //Sphere object
		
		//Calling render method to display information of the objects
		cuboid.render();
		cylinder.render();
		sphere.render();

	}

}
