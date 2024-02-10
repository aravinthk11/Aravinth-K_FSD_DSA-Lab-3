package binarySearchTree;

public class BSTPairfindertest {
	
public static void main(String[] args) {
		
		BST bst = BSTUtils.sampleBST();
		
		BSTPairfinder pairFinder = 
			new BSTPairfinder(bst, 50);
		
		pairFinder.findPairs();
		
		
	}

}
