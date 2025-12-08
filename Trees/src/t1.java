class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}



public class t1 {
    static int idx=-1;
    public static Node buildTree(int pre[]){
        idx++;
        if(pre[idx]==-1) return null;
        Node root=new Node(pre[idx]);
        root.left=buildTree(pre);
        root.right=buildTree(pre);

        return root;
    }
    public static void main(String[] args) {
        int preOrder[]={1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node rootVal=buildTree(preOrder);
        System.out.println(rootVal.data);
        System.out.println(rootVal.left.data);
        System.out.println(rootVal.right.data);
    }
}
