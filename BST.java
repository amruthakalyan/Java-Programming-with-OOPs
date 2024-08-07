class Node{
    Node left;
    int data;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
};
public class BST {
    Node root = null;
    void insert(Node temp, int data){
        if(root==null){
            Node n = new Node(data);
            root=n;
        }
        else if(temp.data >= data && temp.left==null){
            temp.left = new Node(data);
        }
        else if(temp.data < data && temp.right==null){
            temp.right = new Node(data);
        }
        else if(temp.data >data){
            insert(temp.left,data);

        }
        else{
            insert(temp.right,data);
        }
    }
    void search(Node temp,int data){
        if(temp==null){
            System.out.println("Key element not found..");
        }
        else if(temp.data > data && temp.left !=null){
            search(temp.left,data);
        }
        else if(temp.data < data && temp.right !=null){
            search(temp.right, data);
        }
        else if(temp.data == data){
            System.out.println("Key is found");
        }
        else{
            System.out.println("Key not found..");
        }
    }
//Inorder
  void inorder(Node temp){
     if(temp.left !=null){
        inorder(temp.left);
     }
     System.out.println(temp.data);//root
     if(temp.right !=null){
     inorder(temp.right);
     }
     
  }
//Pre-order
void preorder(Node temp){
    System.out.println(temp.data);
    if(temp.left !=null){
       preorder(temp.left);
    }
    if(temp.right !=null){
    preorder(temp.right);
    }
    
 }

 //Post order
 void postorder(Node temp){
    if(temp.left !=null){
       postorder(temp.left);
    }
    if(temp.right !=null){
    postorder(temp.right);
    }
    System.out.println(temp.data);
 }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(tree.root, 50);
        tree.insert(tree.root, 25);
        tree.insert(tree.root, 15);
        tree.insert(tree.root, 55);
        tree.insert(tree.root, 45);
        tree.insert(tree.root, 60);
        tree.search(tree.root,55);
        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);
        System.out.println("Postorder traversal:");
        tree.postorder(tree.root);
    }
}
