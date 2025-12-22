#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n,e;
    cin>>n>>e;
    vector<int>adj[n];
    for(int i=0;i<e;i++){
        int u,v;
        cin>>u>>v;
        // Accept 1-based or 0-based indices
        if(u>=1 && u<=n && v>=1 && v<=n){--u;--v;}
        if(u<0 || u>=n || v<0 || v>=n) continue;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    for(int i=0;i<n;i++){
        cout<<i<<"-> ";
        for(int j=0;j<adj[i].size();j++){
            cout<<adj[i][j]<<" ";
        }
        cout<<endl;
    }    
    return 0;
}