#include<iostream>
#include<vector>
#include<queue>
using namespace std;

void DFS(vector<int> adj[], int n, vector<bool> &visited,int node){
    if(visited[node]==true){
        return;
    }
    visited[node]=true;
    cout<<node<<"--";
    for(auto it:adj[node]){
        DFS(adj,n,visited,it);
    }
}

int main(){
    int n,e;
    cin>>n>>e;
    vector<int>adj[n];
    for(int i=0;i<e;i++){
        int u,v;
        cin>>u>>v;
        // Accept 1-based or 0-based indices
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    vector<bool>visited(n,false);

    cout<<"DFS Traversal starting from node 0: ";
    DFS(adj,n,visited,0);
    cout<<endl;

    for(int i=0;i<n;i++){
        cout<<i<<"-> ";
        for(int j=0;j<adj[i].size();j++){
            cout<<adj[i][j]<<" ";
        }
        cout<<endl;
    }    
    return 0;
}