import java.util.*;

public class BST
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node insert(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(root.data>data)
        {
            root.left=insert(root.left,data);
        }
        else
        {
            root.right=insert(root.right,data);
        }
        return root;
    }
    

    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data>key)//search in left subtree
        {
            return search(root.left,key);
        }
        else if(root.data==key)
        {
            return true;
        }
        else
        {
            return search(root.left,key);
        }
    }

    public static Node delete(Node root,int key)
    {
        if(root.data>key)
        {
            root.left=delete(root.left,key);
        }
        else  if(root.data < key)
        {
            root.right=delete(root.right,key);
        }

        else //root.data==key
        {
            //case 1
            if(root.left==null && root.right==null)
            {
                return null;
            }
            //case 2
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }

            //case 3

            Node IS=inoderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    public static Node inoderSuccessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }

    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        System.out.print("Postorder = ");
        if(root==null)
        {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }
        System.out.println("InOrder = ");
        inorder(root);
        System.out.println("PreOrder = ");
        preorder(root);
        System.out.println();
        postorder(root);

        // System.out.println("Enter key to find in tree");
        // int key=sc.nextInt();

        // if(search(root,key))
        // {
        //     System.out.println(key+" is Found");
        // }
        // else
        // {
        //     System.out.println(key+" is Not Found");
        // }

      //  delete(root,4);
      //  inorder(root);

    }
}