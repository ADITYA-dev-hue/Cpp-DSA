#include<iostream>
#include<vector>
#include<queue>
using namespace std;

void BFS(vector<int> adj[],int n,int src){
    queue<int>q;
    vector<bool>visited(n,false);
    q.push(src);
    visited[src]=true;
    while(!q.empty()){
        int node=q.front();
        q.pop();
        cout<<node<<" ";
        for(auto it: adj[node]){
            if(visited[it]==false){
                q.push(it);
                visited[it]=true;
            }
        }
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

    cout<<"BFS Traversal starting from node 0: ";
    
    BFS(adj,n,0);
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