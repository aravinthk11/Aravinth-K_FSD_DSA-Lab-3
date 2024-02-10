package binarySearchTree;

public class BST {

Node root;
	
	public Node getRoot() {
		return root;
	}
	
	void insert(int value) {
		
		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
		}else {
			
			NodeInsertion nodeDetails 
				= constructNodeDetails(value);
			
			
			Node parentNode = nodeDetails.getParentNode();
			
			String direction = nodeDetails.getDirection();
			
			if (direction.equals("LEFT")) {
				
				parentNode.setLeft(newNode);
			}else if (direction.equals("RIGHT")) {
				parentNode.setRight(newNode);
			}
		}
		
	}
	
	NodeInsertion constructNodeDetails(Integer data){
		
		NodeInsertion nid = new NodeInsertion();
		
		traverseTree(root, data, nid);
		
		return nid;
	}
	
	void traverseTree(Node aNode, Integer data, 
			NodeInsertion details){
	
		
		if (data <= aNode.getData()) {
			
			Node leftNode = aNode.getLeft();
			
			if (leftNode != null) {
				traverseTree(leftNode, data, details);
			}else {
				details.setParentNode(aNode);
				details.setDirection("LEFT");
			}			
		}else {
			
			Node rightNode = aNode.getRight();
			
			if (rightNode != null) {
				traverseTree(rightNode, data, details);
			}else {
				
				details.setParentNode(aNode);
				details.setDirection("RIGHT");
			}
		}
	}
}
