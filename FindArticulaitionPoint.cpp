#include<bits/stdc++.h>
#define int long long
#define mod 1000000007
#define mx 11
using namespace std;

vector<int> graph[mx];
int disc[mx];
int par[mx];
int low[mx];
int vis[mx];
vector<int> artpt;
vector<pair<int,int> > artedg;
int t=0;

void dfs(int v){
    vis[v]=1;
    disc[v]=low[v]=++t;
    int child=0;
    for(auto i:graph[v]){
        if(!vis[i]){
            child++;
            par[i]=v;
            dfs(i);
            low[v]=min(low[v],low[i]);
            if(par[v]==-1 and child>1 ){
                artpt.push_back(v);
            }
            if(par[v]!=-1 and low[i]>=disc[v]){
                artpt.push_back(v);
            }
            if(low[i]>disc[v]){
                artedg.push_back({v,i});
            }
        }else if(par[v]!=i){
            low[v]=min(low[v],disc[i]);
        }
    }
}

signed main(){
    int n,m,a,b;
    cin>>n>>m;
    
    while(m--){
        cin>>a>>b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }
    memset(par,-1,sizeof(par));
    for(int i=0;i<n;i++){
        if(!vis[i]){
            dfs(i);
        }
    }
    cout<<artpt.size()<<endl;
    for(auto i:artpt){
        cout<<i<<" ";
    }
    cout<<endl;

    cout<<artedg.size()<<endl;
    for(auto i:artedg){
        cout<<i.first<<" "<<i.second<<endl;
    }

}

