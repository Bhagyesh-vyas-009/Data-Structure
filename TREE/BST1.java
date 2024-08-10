import java.util.*;

class Node
{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
        }
}

class BST
{
    public Node insert(Node root,int data)
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
    

    public boolean search(Node root,int key)
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

    public Node delete(Node root,int key)
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

    public Node inoderSuccessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }

    public void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }
}

class BST1
{
    public static void main(String[] args) 
    {
        Node root=null;
        BST bst=new BST();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        // int values[]={8,5,3,1,4,6,10,11,14};
        // for(int i=0;i<values.length;i++)
        // {
        //     root=bst.insert(root,values[i]);
        // }
        while(flag)
        {
            System.out.println(" 1.Insert a Node \n" +
                            " 2.Delete a Node \n"+
                            " 3.Inorder Traversal \n"+
                            " 4.PreOrder Traversal \n"+
                            " 5.PostOrder Traversal \n"+
                            " 6.Exit \n");

            System.out.print("Enter your choice: ");
                switch (sc.nextInt()) 
                {
                    case 1:
                        System.out.println("Enter Node data to insert into Tree :  ");
                        int data = sc.nextInt();
                        root=bst.insert(root,data);
                        break;
                    case 2:
                        System.out.println("Enter Node data to data from Tree :  ");
                        int data1 = sc.nextInt();
                        bst.delete(root,data1);
                        break;
                    case 3:
                        System.out.println("Inorder Traversal = ");
                        bst.inorder(root);
                        break;
                    case 4:
                        System.out.println("Preorder Traversal = ");
                        bst.preorder(root);
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Postorder Traversal = ");
                        bst.postorder(root);
                        System.out.println();
                        break;
                    case 6:
                        flag = false;
                        System.out.println("Exited Sucessfully................");
                        break;
                
                    default:
                        flag = false;
                        System.out.println("Enter valid choice.");
                        break;
                }
        }   
    }
        
        // System.out.println("InOrder = ");
        // inorder(root);
        // System.out.println("PreOrder = ");
        // preorder(root);
        // System.out.println();
        // postorder(root);

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

        // delete(root,4);
        // inorder(root);
    }

