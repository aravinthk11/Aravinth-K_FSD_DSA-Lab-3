package binarySearchTree;

public class BSTtest {
	
public static void main(String[] args) {
		
		BST bst 
			= BSTUtils.sampleBST();

		// 70
		Node root = bst.getRoot();
		
		System.out.println(root);
		
		// 60
		Node _60 = root.getLeft().getRight();
		
		System.out.println(_60);

		// 20
		Node _20 = root.getLeft().getLeft().getLeft();		
		System.out.println(_20);

	}

}
