#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;

Node* head=NULL;

Node* createNode(int val){
    Node* newNode=new Node;
    newNode->data=val;
    newNode->next=nullptr;
    return newNode;
}
void insertAtEnd(int val){
    Node* newNode=createNode(val);
    if(head==NULL){
        head=newNode;
        return;
    }
    Node* current = head;
    while(current->next!=NULL){
        current=current->next;
    }
    current->next=newNode;
}
void display(){
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
        
    }
}
};
int length(Node* head){
    int len=0;
    Node* temp=head;
    while(temp!=NULL){
        len++;
        temp=temp->next;
    }
    return len;

}
void disp(Node* head){
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}

Node* getIntersection(Node* head1, Node* head2){
    int l1=length(head1);
    int l2=length(head2);
    if(l1>l2){
        int l=l1-l2;
        Node *temp=head1;
        while(l--){
            temp=temp->next;
        }
        Node* ptr1 = temp;
        Node* ptr2 = head2;
        head1=ptr1;
        head2=ptr2;
    }
    else{
        int l=l2-l1;
        Node* temp=head2;
        while(l--){
            temp=temp->next;
        }
        Node* ptr1 = temp;
        Node* ptr2 = head1;
        head1=ptr2;
        head2=ptr1;
    }
    while(head1!=NULL ){
        if(head1==head2){
            return head1;
        }
        head1=head1->next;
        head2=head2->next;                                                                                              
    }
    return nullptr;
}

void remove_k_from_end(Node* &head,int k){
    int l=length(head);
    int i=l-k;
    Node* temp=head;
    if(k>l){
        cout<<"Invalid k value\n";
        return;
    }
    if(k==0){
        cout<<"Invalid k value\n";
        return;
    }
    if(k==l and l==1){
        head=NULL;
        return;
    }
    if(k==l){
        head=head->next;
        return;
    }
    if(k==1){
        Node* prev=NULL;
        while(temp->next->next!=NULL and temp->next!=NULL and temp!=NULL){
           
            temp=temp->next;
        }
         prev=temp;
        prev->next=NULL;
        return;
    }
    while(i!=1 and temp!=NULL){
        temp=temp->next;
        i--;
    }
    temp->next=temp->next->next;
}





int main(){
    Node l1;
    
    l1.insertAtEnd(1);
    l1.insertAtEnd(2);
    l1.insertAtEnd(3);
    l1.insertAtEnd(6);
    l1.insertAtEnd(8);
    cout<<"Linked List 1: ";
    l1.display();
    Node l2;
    l2.insertAtEnd(5);
    l2.insertAtEnd(7);
    // l2.head->next->next=l1.head->next->next->next; // Creating intersection at node with value 4
    // l2.head->next->next=l1.head->next->next->next; // Linking to node with value 6

    cout<<"\nLinked List 2: ";
    l2.display();
    // Node* intersection=getIntersection(l1.head,l2.head);
    // if(intersection!=nullptr){  
    //     cout<<"\nIntersection at node with value: "<<intersection->data<<endl;
    // }
    // else{
    //     cout<<"\nNo intersection point found."<<endl;
    // }

    cout<<endl<<length(l1.head)<<endl;
    remove_k_from_end(l1.head,1);
    cout<<endl;
    
    cout<<"Linked List 1 after removing node from end: ";
    l1.display();
    
    
}