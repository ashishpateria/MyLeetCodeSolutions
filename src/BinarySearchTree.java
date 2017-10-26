
public class BinarySearchTree {

	public TreeNode root;

	public void insert(int key) {
		root = helper(root, key);

	}

	private TreeNode helper(TreeNode node, int key) {
		if (node == null)
			return new TreeNode(key);

		else if (node.data < key) {
			node.right = helper(node.right, key);
			return node;
		} else {
			node.left = helper(node.left, key);
			return node;
		}
		// return node;

	}

	public void delete(int key) {
		root = delete(root, key);
	}

	public TreeNode delete(TreeNode node, int key) {

		return node;
	}

	public void inorder(TreeNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(6);
		tree.insert(4);
		tree.insert(8);
		tree.insert(2);
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.inorder(tree.root);
	}

}
