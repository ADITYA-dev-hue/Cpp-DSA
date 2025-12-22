#include <iostream>
using namespace std;

int main() {
    int n, e;
    if (!(cin >> n >> e)) return 0; // input: n e

    // allocate basic 2D array
    int **adj = new int*[n];
    for (int i = 0; i < n; ++i) {
        adj[i] = new int[n];
        for (int j = 0; j < n; ++j) adj[i][j] = 0;
    }

    for (int i = 0; i < e; ++i) {
        int u, v;
        if (!(cin >> u >> v)) break; // edges: u v (0-based)
        // if your input is 1-based, uncomment the next two lines:
        // --u; --v;
        if (u < 0 || u >= n || v < 0 || v >= n) continue;
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) cout << adj[i][j] << ' ';
        cout << '\n';
    }

    for (int i = 0; i < n; ++i) delete[] adj[i];
    delete[] adj;
    return 0;
}