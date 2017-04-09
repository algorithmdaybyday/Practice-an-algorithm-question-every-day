## 树🌲
### 树类型问题为面试经典题型。由于在树形结构中进行寻找和运算比在链表和数列结构复杂，时间和空间复杂的分析难度也会随树形结构的变化而增加。在分析树形结构时可以和图（Graph）类问题类比， 这里会着重解释树类问题。

## 基本树类型
### 1. 树由节点组成，可以用递归思路去理解树结构。
* 每个树都有一个根节点
* 根节点有零或不为零个子节点
* 每个子节点有零或不为零个子节点， 以此类推

### 节点定义
```java 
class Node {
	public String name;
	public Node[] Children;
}
```
### 树定义
```java 
class Tree {
	public Node root;
}
```

### 2. 树vs二分树
#### 二分树是一种树类型， 它的每个节点最多只能有两个子节点， 以此类推可得三分树， 四分树， 等等。没有子节点的节点被称为叶， 可理解为树的末端。

### 3. 树vs二分搜索树
#### 二分搜索树的定义为（在这里假设没有两个节点拥有相同值）
* 树为二分树结构
*  对任意节点n来说 n左侧所有子节点（descendents）的值小于等于n右侧所有子节点的值

## 树遍历方法
### 1. 中序遍历
```java
void inOrderTraversal(TreeNode node){
	if (node != null){
		inOrderTraversal(node.left);
		visit(node) # do something here
		inOrderTraversal(node.right);
	}
}
```
### 2. 前序遍历
```java
void preOrderTraversal(TreeNode node){
	if (node != null){
		visit(node) # do something here
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
}
```
### 3. 后序遍历
```java
void postOrderTraversal(TreeNode node){
	if (node != null){
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		visit(node) # do something here
	}
}
```
## 树类问题实例
### 1. 
## 参考（Reference）
Cracking the Coding Interview 189 Programming Questions & Solutions by  Gayle Laakmann Mcdowell, Chapter 4, "Trees and Graphs", p100


