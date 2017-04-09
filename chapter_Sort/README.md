## 排序的相关算法

- 常见的八大排序算法
	- 直接插入排序
	- 希尔排序
	- 简单选择排序
	- 堆排序
	- 冒泡排序
	- 快速排序
	- 归并排序
	- 基数排序
- 其他排序算法
	- 烙饼排序
	- 睡眠排序
	- 面条排序
	- 猴子排序 

## 常见的八大排序算法
八大排序，三大查找是《数据结构》当中非常重要的基础知识点，在这里首先总结了一下常见的八种排序算法。

常见的八大排序算法，他们之间关系如下：

![排序算法.png](http://upload-images.jianshu.io/upload_images/1156494-ab4cecff133d87b3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

他们的性能比较：

![性能比较.png](http://upload-images.jianshu.io/upload_images/1156494-62f859c2ac6f95ff.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


### 直接插入排序
- 算法思想
![直接插入排序.gif](http://upload-images.jianshu.io/upload_images/1156494-936d9f02b6aac880.gif?imageMogr2/auto-orient/strip)
直接插入排序的核心思想就是：将数组中的所有元素依次跟前面已经排好的元素相比较，如果选择的元素比已排序的元素小，则交换，直到全部元素都比较过。</br>
因此，从上面的描述中我们可以发现，直接插入排序可以用两个循环完成：
  	1. 第一层循环：遍历待比较的所有数组元素
  	2. 第二层循环：将本轮选择的元素(selected)与已经排好序的元素(ordered)相比较。
	如果：selected > ordered，那么将二者交换
- 代码实现

		void insert_sort(int[] nums) {
			if (nums == null || nums.length == 0) {
				return;
			}
			for (int i = 1; i < nums.length; i++) {
				for (int j = i - 1; j >= 0; j--) {
					if (nums[j + 1] < nums[j]) {
						int temp = nums[j + 1];
						nums[j + 1] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
		
### 希尔排序
- 算法思想
![希尔排序.png](http://upload-images.jianshu.io/upload_images/1156494-80700e24aed3d83e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
希尔排序的算法思想：将待排序数组按照步长gap进行分组，然后将每组的元素利用直接插入排序的方法进行排序；每次将gap折半减小，循环上述操作；当gap=1时，利用直接插入，完成排序。
同样的：从上面的描述中我们可以发现：希尔排序的总体实现应该由三个循环完成：
  1. 第一层循环：将gap依次折半，对序列进行分组，直到gap=1
  2. 第二、三层循环：也即直接插入排序所需要的两次循环。具体描述见上。
- 代码实现

### 简单选择排序
- 算法思想

![简单选择排序.gif](http://upload-images.jianshu.io/upload_images/1156494-25821a7cb5aec881.gif?imageMogr2/auto-orient/strip)
简单选择排序的基本思想：比较+交换。
  1. 从待排序序列中，找到关键字最小的元素；
  2.  如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
  3. 从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束。
因此我们可以发现，简单选择排序也是通过两层循环实现。
第一层循环：依次遍历序列当中的每一个元素
第二层循环：将遍历得到的当前元素依次与余下的元素进行比较，符合最小元素的条件，则交换。

- 代码实现

### 堆排序
* 堆的概念

堆：本质是一种数组对象。特别重要的一点性质：<b>任意的叶子节点小于（或大于）它所有的父节点</b>。对此，又分为大顶堆和小顶堆，大顶堆要求节点的元素都要大于其孩子，小顶堆要求节点元素都小于其左右孩子，两者对左右孩子的大小关系不做任何要求。

利用堆排序，就是基于大顶堆或者小顶堆的一种排序方法。下面，我们通过大顶堆来实现。

* 基本思想：
堆排序可以按照以下步骤来完成：
  1. 首先将序列构建称为大顶堆；
（这样满足了大顶堆那条性质：位于根节点的元素一定是当前序列的最大值）
![构建大顶堆.png](http://upload-images.jianshu.io/upload_images/1156494-596eee6397817ca2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  2. 取出当前大顶堆的根节点，将其与序列末尾元素进行交换；
（此时：序列末尾的元素为已排序的最大值；由于交换了元素，当前位于根节点的堆并不一定满足大顶堆的性质）
  3. 对交换后的n-1个序列元素进行调整，使其满足大顶堆的性质；
![Paste_Image.png](http://upload-images.jianshu.io/upload_images/1156494-7e5c63ce1ed48ebf.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  4. 重复2.3步骤，直至堆中只有1个元素为止

* 代码实现：

### 冒泡排序
- 算法思想

![冒泡排序.gif](http://upload-images.jianshu.io/upload_images/1156494-fef2b2e3edc03289.gif?imageMogr2/auto-orient/strip)
冒泡排序思路比较简单：
  1. 将序列当中的左右元素，依次比较，保证右边的元素始终大于左边的元素；
（ 第一轮结束后，序列最后一个元素一定是当前序列的最大值；）
  2. 对序列当中剩下的n-1个元素再次执行步骤1。
  3. 对于长度为n的序列，一共需要执行n-1轮比较
（利用while循环可以减少执行次数）

- 代码实现

### 快速排序
- 算法思想

![快速排序.gif](http://upload-images.jianshu.io/upload_images/1156494-2d150e5550b700fa.gif?imageMogr2/auto-orient/strip)

快速排序的基本思想：**挖坑填数+分治法**
  1. 从序列当中选择一个基准数(pivot)
在这里我们选择序列当中第一个数最为基准数
  2. 将序列当中的所有数依次遍历，比基准数大的位于其右侧，比基准数小的位于其左侧
  3. 重复步骤1.2，直到所有子集当中只有一个元素为止。

- 代码实现

### 归并排序
- 算法思想

![归并排序.gif](http://upload-images.jianshu.io/upload_images/1156494-0597aa6877e219f0.gif?imageMogr2/auto-orient/strip)

  1. 归并排序是建立在归并操作上的一种有效的排序算法，该算法是采用**分治法**的一个典型的应用。它的基本操作是：将已有的子序列合并，达到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。
  
  2. 归并排序其实要做两件事：
    * 分解----将序列每次**折半拆分**
    * 合并----将划分后的序列段**两两排序合并**
  因此，归并排序实际上就是两个操作，拆分+合并

  3. 如何合并？
L[first...mid]为第一段，L[mid+1...last]为第二段，并且两端已经有序，现在我们要将两端合成达到L[first...last]并且也有序。
    * 首先依次从第一段与第二段中取出元素比较，将较小的元素赋值给temp[]
    * 重复执行上一步，当某一段赋值结束，则将另一段剩下的元素赋值给temp[]
    * 此时将temp[]中的元素复制给L[]，则得到的L[first...last]有序

  4. 如何分解？
在这里，我们采用递归的方法，首先将待排序列分成A,B两组；然后重复对A、B序列
分组；直到分组后组内只有一个元素，此时我们认为组内所有元素有序，则分组结束。

- 代码实现

### 基数排序
- 算法思想

![基数排序.gif](http://upload-images.jianshu.io/upload_images/1156494-70872a75238d1269.gif?imageMogr2/auto-orient/strip)

  1. 基数排序：通过序列中各个元素的值，对排序的N个元素进行若干趟的“分配”与“收集”来实现排序。

	**分配**：我们将L[i]中的元素取出，首先确定其个位上的数字，根据该数字分配到与之序号相同的桶中

	**收集**：当序列中所有的元素都分配到对应的桶中，再按照顺序依次将桶中的元素收集形成新的一个待排序列L[ ]
对新形成的序列L[]重复执行分配和收集元素中的十位、百位...直到分配完该序列中的最高位，则排序结束

  2. 根据上述“基数排序”的展示，我们可以清楚的看到整个实现的过程

- 代码实现


### 参考资料
* LeeLom简书：[数据结构常见的八大排序算法（详细整理）](http://www.jianshu.com/p/7d037c332a9d)
* 数据结构可视化：[visualgo](http://zh.visualgo.net/)
* 希尔排序介绍：[希尔排序](http://www.cnblogs.com/jingmoxukong/p/4303279.html)
* 堆排序：[[《算法导论》读书笔记之第6章 堆排序](http://www.cnblogs.com/Anker/archive/2013/01/23/2873422.html)](http://www.cnblogs.com/Anker/archive/2013/01/23/2873422.html)
* 博客园：[静默虚空](http://home.cnblogs.com/u/jingmoxukong/)
* 博客：[vincent-cws](http://blog.chinaunix.net/uid/21457204.html)