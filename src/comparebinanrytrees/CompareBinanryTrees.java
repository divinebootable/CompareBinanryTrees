/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparebinanrytrees;

/**
 *
 * @author divine
 */
public class CompareBinanryTrees {
    
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    
    }
    
   public Node root;
  

        public Node IdenticalTrees() {
           return root = null;
        }
    
   
   public static boolean areIdenticalTrees(Node root1, Node root2){
       if(root1 == null && root2 ==null)
           return true;
       if(root1 != null && root2 != null){
          return ((root1.data == root2.data) &&(areIdenticalTrees(root1.left,root2.left))&&(areIdenticalTrees(root1.right,root2.right)));
       
       }
       
       return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create an instance of the class and add nodes  to the trees
       CompareBinanryTrees bt1 = new CompareBinanryTrees();
        bt1.root = new Node(1);  
        bt1.root.left = new Node(2);  
        bt1.root.right = new Node(3);  
        bt1.root.left.left = new Node(4);  
        bt1.root.right.left = new Node(5);  
        bt1.root.right.right = new Node(6);
        
        CompareBinanryTrees bt2 = new CompareBinanryTrees();
          bt2.root = new Node(1);  
          bt2.root.left = new Node(2);  
          bt2.root.right = new Node(3);  
          bt2.root.left.left = new Node(4);  
          bt2.root.right.left = new Node(5);  
          bt2.root.right.right = new Node(7); 
       
          if(areIdenticalTrees(bt1.root,bt2.root)){
             System.out.println("Both the binary trees are identical");
          }else{
             System.out.println("Both the binary trees are not identical");
          }
    }

   
    
}
