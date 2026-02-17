#include<iostream>
using namespace std;
class Node{
    int data;
    Node* next;
    Node(int val){
        data=val;
        next=NULL;
    } 
    Node* reverse(Node* head){
        Node* curr=head;
        Node* next =NULL;
        Node* prev=NULL;
        while(curr!=NULL){
            next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }
};
int main(){
    
}
