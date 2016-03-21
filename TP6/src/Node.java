public class Node {
	private Node filsGauche;
	private Node filsDroit;
	private String name;
	
	public Node(String name) {
		this.name = name;
	}
	
	public Node(String name, String leftName, String rightName) {
		this.name = name;
		this.setFilsGauche(leftName);
		this.setFilsDroit(rightName);
	}
	
	
	public Node getFilsGauche() {
		return this.filsGauche;
	}
	
	public Node setFilsGauche(String name) {
		this.filsGauche = new Node(name);
		return this;
	}
	
	public Node setFilsGauche(String name, String leftName, String rightName) {
		this.filsGauche = new Node(name, leftName, rightName);
		return this;
	}
	
	public Node getFilsDroit() {
		return this.filsDroit;
	}
	
	public Node setFilsDroit(String name) {
		this.filsDroit = new Node(name);
		return this;
	}
	
	public Node setFilsDroit(String name, String leftName, String rightName) {
		this.filsDroit = new Node(name, leftName, rightName);
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Node setName(String name) {
		this.name = name;
		return this;
	}
	
	public Node setFils(String nameG, String nameD) {
		this.setFilsGauche(nameG);
		this.setFilsDroit(nameD);
		return this;
	}
}