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

#### [Leetcode 98. 证明二分搜索树合理](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/validBST.java)
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
### 通过递归解决类问题

#### [Leetcode 100 检查相同的二分树](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/isSameTree.java)
#### [Leetcode 101 平衡树](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/symmetricTree.java)
#### [Leetcode 104 二分树的最大深度](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/maxDepth.java)
#### [Leetcode 110 检查平衡的二分树](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/balancedBinaryTree.java)
#### [Leetcode 124 二分树最大路径和](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/bstMaxPathSum.java)
#### [Leetcode 222 完整树节点数 ](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/countNodes.java)
#### [Leetcode 226 旋转二分树 (Invert Binary Tree)](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/invertTree.java)
#### [Leetcode 235 二分搜索树的最低共同节点 (Lowest Common Ancestor of a Binary Tree)](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/lowestCommonAncestor.java)
#### [Leetcode 257 二分树所有路径](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/bstPaths.java)
### 通过修改遍历方法解决类问题
#### [Leetcode 102 二分树层序遍历 (Level Order Traversal)](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/bstLevelOrderTraversal.java)
#### [Leetcode 105 数列前序中序建造二分树](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/orderBuildTree.java)
#### [Leetcode 108 正序数列转化为二分搜索树](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/sortedArrayToBST.java)
#### [Leetcode 173 二分搜索树遍历器设计 (Binary Search Tree Iterator)](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/bstIterator.java)
#### [Leetcode 513 寻找树底层最左值](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/findBottomLeftValue.java)
### 通过动态规划解决类问题
#### [Leetcode 96 唯一二分搜索树 (Unique Binary Search Trees)](https://github.com/algorithmdaybyday/Practice-an-algorithm-question-every-day/blob/master/chapter_Tree/leetcode/uniqueBST.java)

## 参考（Reference）
Cracking the Coding Interview 189 Programming Questions & Solutions by  Gayle Laakmann Mcdowell, Chapter 4, "Trees and Graphs", p100


