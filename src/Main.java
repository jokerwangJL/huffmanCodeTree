/**
 * @author wangjialong
 * @date 2019年04月17日 18:48
 * @description 请输入描述
 */
public class Main {

    public static void main(String[] args) {
        Huffman huff = new Huffman();// 创建哈弗曼对象

        String data = "代码解决方案：在java里有一个东西叫做优先队列（PriorityQueue），优先队列可以理解为一个可以排序的队列，优先级队列的元素按照其自然顺序进行排序，或者根据构造队列时提供的 Comparator 进行排序，具体取决于所使用的构造方法。详见api文档搜索PriorityQueue" ;
        huff.creatHfmTree(data);// 构造树

        huff.output(); // 显示字符的哈夫曼编码

        // 将目标字符串利用生成好的哈夫曼编码生成对应的二进制编码
        String hufmCode = huff.toHufmCode(data);
        System.out.println("编码:" + hufmCode);

        // 将上述二进制编码再翻译成字符串
        System.out.println("解码：" + huff.CodeToString(hufmCode));

    }
}
