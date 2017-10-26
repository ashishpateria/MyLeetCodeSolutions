import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class QItem {
	TreeNode node;
	int hd;

	public QItem(TreeNode n, int dist) {
		node = n;
		hd = dist;
	}

}

public class Topview {

	TreeNode root;

	public Topview() {
		root = null;

	}

	public Topview(TreeNode n) {
		root = n;
	}

	public void printTopView() {
		if (root == null) {
			return;
		}
		HashSet<Integer> set= new HashSet<>();
		Queue<QItem> q= new LinkedList<>();
		q.add(new QItem(root, 0) );
		while(!q.isEmpty()){
			QItem qi=q.remove();
			int hd=qi.hd;
			System.out.println("Horizontal distance of "+qi.node.data+" "+qi.hd);
			TreeNode n=qi.node;
			if(!set.contains(hd)){
				set.add(hd);
				System.out.print(n.data +" ");
			}
			if (n.left != null)
                q.add(new QItem(n.left, hd-1));
            if (n.right != null)
                q.add(new QItem(n.right, hd+1));
		}
	}


	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
        Topview t = new Topview(root);
        System.out.println("Following are nodes in top view of Binary Tree");
        t.printTopView();

	}

}
