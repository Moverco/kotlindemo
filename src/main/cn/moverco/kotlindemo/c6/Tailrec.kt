package cn.moverco.kotlindemo.c6

data class ListNode(val value: Int, var next: ListNode?)

/**
 * tailrec关键字提示编译器使用迭代的方法优化尾递归
 *
 * 尾递归
 *  递归的一种特殊形式，调用自身后无其他操作
 */
tailrec fun findListNode(head:ListNode?,value: Int):ListNode?{
    head?:return null
    if (head.value==value)return head
    return findListNode(head.next,value)
}

fun factorial(n:Int):Int{
    return n* factorial(n-1)
}

data class TreeNode(val value: Int){
    var left:TreeNode?=null
    var right:TreeNode?=null
}

fun findTreeNode(root:TreeNode?,value: Int):TreeNode?{
    root?:return null
    if (root.value == value) return root
     return findTreeNode(root.left,value)?: findTreeNode(root.right,value)


}