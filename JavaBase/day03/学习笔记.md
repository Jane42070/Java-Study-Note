# 集合基础
## 集合和数组的特点对比
- 集合特点：提供一种存储空间可变的存储模型，存储的数据容量可以发生改变
- 集合和数组的区别：
	- 共同点：都是存储数据的容器
	- 不同点：数组的容量是固定的，集合的容量是可变的
## ArrayList 集合
- ArrayList<E>: 
	- 可调整大小的数组实现
	- <E>: 是一种特殊的数据类型, 范型
- 怎么用
	- ArrayList<String>, ArrayList<Student>

## ArrayList 成员方法

| 方法名                             | 说明                                  |
|------------------------------------|---------------------------------------|
| public boolean remove(Object c)    | 删除指定元素,返回是否成功             |
| public E remove(int index)         | 删除指定索引处的元素                  |
| public E set(int index, E element) | 修改指定索引处的元素,返回被修改的元素 |
| public E get(int index)            | 返回指定索引处的元素                  |
| public int size()                  | 返回集合中元素的个数                  |

