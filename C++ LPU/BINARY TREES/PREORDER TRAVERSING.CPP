#include<iostream>
using namespace std;
struct Node{
    int data;
    Node* left;
    Node* right;
    
    Node(int val){
        data=val;
        left=NULL;
        right=NULL;
    }
};
Node* create_tree(int val){
    Node* N=new Node(val);
    return N;
}

void preorder_traversal(Node* root){
    if(root==NULL){
        return;
    }
    cout<<root->data<<" ";
    preorder_traversal(root->left);
    preorder_traversal(root->right);
}
int main(){
   Node* root=create_tree(1);
   tree_left(root,2);
   tree_right(root,3);

    preorder_traversal(root);
    return 0;
}