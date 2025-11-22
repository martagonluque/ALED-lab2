package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;


public class Segment {
	private double length;
	private double angle;
	private List<Segment> children;
	
	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<Segment>();
	}
	
	//Método que al llamarlo me da la longitud
	public double getLength() {
		return length;
	}
	
	//Método que al llamarlo me da la longitud
	public double getAngle() {
		return angle;
	}
	
	//Método que estable el ángulo de los segmentos
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	//Método que al llamarlo me da una lista con todos los hijos 
	public List<Segment> getChildren() {
		return children;
	}
	
	//Método que al llamarlo me añade a la lista de hijos un nuevo hijo, si este no está añadido aún
	public void addChild(Segment child) {
		if(!children.contains(child))
			children.add(child);
	}
	
}


