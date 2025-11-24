#include<iostream>
#include<stack>
#include<vector>
#include<string>
using namespace std;

int prec(string &str){
    if(str=="+" || str=="-") return 0;
    return 1;
}

vector<string> Infix_to_Postfix(vector<string> &tokens){
    stack<string> oper_st;
    vector<string> ans;

    int n=tokens.size();

    for(int i=0;i<n;i++){
        if(tokens[i]=="+" || tokens[i]=="-" || tokens[i]=="*" || tokens[i]=="/"){
             while(!oper_st.empty() && prec(oper_st.top()) >= prec(tokens[i])){
                ans.push_back(oper_st.top());
                oper_st.pop();
            }
            oper_st.push(tokens[i]);
        }
        else{
            ans.push_back(tokens[i]);
        }
    }
    while(!oper_st.empty()){
        ans.push_back(oper_st.top());
        oper_st.pop();
    }
    return ans;
}

int main(){
    vector<string> tokens={"2","-","3","*","4","+","5","/","7","+","1","-","6","*","2","*","5","/","6"};
    vector<string> ans=Infix_to_Postfix(tokens);
    int n = ans.size();
    for(int i=0;i<n;i++){
        cout<<ans[i]<<" ";
    }
    return 0;
}
