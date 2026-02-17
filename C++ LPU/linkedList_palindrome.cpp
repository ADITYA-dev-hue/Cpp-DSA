class Solution {
    ListNode* mid(ListNode* head){
        ListNode* fast=head;
        ListNode* slow=head;
        while(fast!=NULL and fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        return slow;
    }

public:
ListNode* reverse(ListNode* head){
        ListNode *next=head;
        ListNode *current=head;
        ListNode *prev=NULL;
        while(current!=NULL){
            next=current->next;
            current->next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    bool isPalindrome(ListNode* head) {
        ListNode* temp=head;
        ListNode* middle=mid(temp);
        ListNode* rev=reverse(middle);
        
        ListNode* cur=head;
        while(rev!=NULL){
            if(cur->val!=rev->val){
                return false;
            }
            cur=cur->next;
            rev=rev->next;
        }
        return true;
    }
};