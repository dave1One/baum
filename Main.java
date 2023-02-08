
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    
    BinaryTree<String> wurzel = new BinaryTree<String>();
    BinarySearchTree<Entry> BST = new BinarySearchTree();
    BinarySearchTree<CharacterEntry> CBST = new BinarySearchTree();
    
    public Main()
    {
        BST.insert(new Entry(8));
        BST.insert(new Entry(6));
        BST.insert(new Entry(1));
        BST.insert(new Entry(7));
        BST.insert(new Entry(9));
        BST.insert(new Entry(8));
        //comment
        CBST.insert(new CharacterEntry("J"));
        CBST.insert(new CharacterEntry("A"));
        CBST.insert(new CharacterEntry("N"));
        
        wurzel.setContent("+");
        BinaryTree<String> wuli = new BinaryTree<String>("a");
        BinaryTree<String> wure = new BinaryTree<String>("b");
        wurzel.setLeftTree(wuli);
        wurzel.setRightTree(wure);
        BinaryTree<String> wurere = new BinaryTree<String>("-");
        BinaryTree<String> wurerere = new BinaryTree<String>("c");
        wurere.setRightTree(wurerere);
        wure.setRightTree(wurere);
        System.out.println();
        preorder(CBST);
      
    }
    
    
    public void preorder(BinarySearchTree<CharacterEntry> pBST){
        if(pBST.isEmpty()){
            return;
        }
        System.out.print(pBST.getContent().getWert() + " ");
        preorder(pBST.getLeftTree());
        
        preorder(pBST.getRightTree());
        
        
    }
    
        // public void preorder(BinaryTree<String> pBST){
        // if(pBST.isEmpty()){
            // return;
        // }
        // System.out.print(pBST.getContent() + " ");
        // preorder(pBST.getLeftTree());

        // preorder(pBST.getRightTree());
        
        
    // }
    
      public void postorder(BinaryTree<String> pBST){
        if(pBST.isEmpty()){
            return;
        }
   
        postorder(pBST.getLeftTree());

        postorder(pBST.getRightTree());
        System.out.print(pBST.getContent() + " ");
        
        
    }
      

    
}
