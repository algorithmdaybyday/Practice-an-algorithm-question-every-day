## 图
### 树实际上属于图类， 但图不一定是树形结构。可以用一下重新定义树：
* 树为没有形成圈的已连接图（A tree is a connected graph without cycles）

## 图的定义
* 由节点与边构成
* 根据不同边的定义 (单行边与双行边），图可分为有导向和无导向两类 
* 图可能由多个小图组成， 如果一个图每对节点之间都由边相连， 此图为已连接图
* 图中可以形成圈

## 图的表达
### 相邻数列
#### 这是最为常见的图类表达方式。每一个节点会存储一个由相邻节点组成的数列。在无导向图中，一条边（a,b）会被相邻节点（a 和 b）各存储一次。
 
#### 代码定义
```java
class Graph {
	public Node[] Node;
}

class Node {
	public String name;
	public Node[] children;
}
```
####图定义和树类型定义的区别在于，图中无法保证从任意一个节点出发，能到达其他全部节点。

### 相邻矩阵
####另一种表达图的方式是使用边长为节点数N的矩形（尺寸为N*N）。每个矩形元素存储一个boolean值用来判断相对应的两个节点是否相接。 matrix[i][j] 表示一条连接节点 i 与节点 j 的边是否存在。

##图搜索
###深度优先搜索（Depth-First Search or DFS）
取任意一个节点为根节点出发并优先探索每一条节点枝的所有节点， 故称为深度优先。
###广度优先搜索 (Breadth-First Search or BFS)
取任意一个节点为根节点出发并优先探索每一个节点所相邻的所有节点， 故称为广度优先。


## 参考（Reference）
Cracking the Coding Interview 189 Programming Questions & Solutions by  Gayle Laakmann Mcdowell, Chapter 4, "Trees and Graphs", p100

