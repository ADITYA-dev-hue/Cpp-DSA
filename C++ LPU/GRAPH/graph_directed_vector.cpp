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
        adj[u].push_back(v);
    }
    // Print directed graph
    cout << "Directed Graph Adjacency List:\n";
    for(int i=0;i<n;i++){
        cout<<i<<"-> ";
        for(int j=0;j<adj[i].size();j++){
            cout<<adj[i][j]<<" ";
        }
        cout<<endl;
    }    
    return 0;
}