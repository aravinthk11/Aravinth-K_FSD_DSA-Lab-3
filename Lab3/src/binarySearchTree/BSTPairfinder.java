package binarySearchTree;

import java.util.LinkedHashSet;
import java.util.Set;

public class BSTPairfinder {
	
	BST bst;
	Integer sum;
	
	Set<Integer> previouslyVisitedNodes;
	
	
	public BSTPairfinder(BST bst, Integer sum) {
		
		this.bst = bst;
		this.sum = sum;
		
		this.previouslyVisitedNodes = 
			new LinkedHashSet<>();

	}
	
	void findPairs() {
		
		preOrderTraversal();
	}
	
	void preOrderTraversal() {
		
		preOrderTraveralInternal(bst.getRoot());
	}
	
	void preOrderTraveralInternal(Node currentNode) {
		
		if (currentNode == null) {
			return;
		}
		
		
		Integer difference = (sum - currentNode.getData());
		if (previouslyVisitedNodes.contains(difference)) {
			
			System.out.println("Match Identified");
			System.out.printf("[%d, %d]", 
					currentNode.getData(), difference);
			System.out.println();
		}
		

		this.previouslyVisitedNodes.add(currentNode.getData());
		
		
		
		preOrderTraveralInternal(currentNode.getLeft());
		preOrderTraveralInternal(currentNode.getRight());
	}
	

}
