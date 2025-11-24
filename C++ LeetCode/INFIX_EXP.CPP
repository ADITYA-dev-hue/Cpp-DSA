#include<iostream>
#include<stack>
#include<vector>
#include<string>
using namespace std;

int prec(string &str){
    if(str=="+" || str=="-") return 0;
    return 1;
}

int operation(int a, int b, string &op){
    if(op == "+") return a+b;
    if(op == "-") return a-b;
    if(op == "*") return a*b;
    else return a/b;   
}

int evalResult(vector<string> &tokens){
    stack<string>oper_st;
    stack<int>num_st;

    int n=tokens.size();

    for(int i=0;i<n;i++){
        if(tokens[i]=="+" || tokens[i]=="*" || tokens[i]=="-" || tokens[i]=="/"){

            while(!oper_st.empty() && prec(oper_st.top()) >= prec(tokens[i])){

                string top_oper=oper_st.top();
                oper_st.pop();

                int a=num_st.top();
                num_st.pop();

                int b=num_st.top();
                num_st.pop();

                num_st.push(operation(a,b,top_oper));

            }
            oper_st.push(tokens[i]);

        }
        else{

            num_st.push(stoi(tokens[i]));
        
        }
    }
    while(!oper_st.empty()){
        string top_oper=oper_st.top();
                oper_st.pop();

                int a=num_st.top();
                num_st.pop();

                int b=num_st.top();
                num_st.pop();

                num_st.push(operation(a,b,top_oper));
    }

    return num_st.top();
}


int main(){
    vector<string>tokens={"1","*","2","-","3","*","4","+","8","/","7","+","5","*","4"};
    cout<<evalResult(tokens)<<endl;
    return 0;
}