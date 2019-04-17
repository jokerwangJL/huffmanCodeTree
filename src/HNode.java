/**
 * @author wangjialong
 * @date 2019年04月17日 18:47
 * @description 请输入描述
 */
public class HNode {

    public String code = "";// 节点的哈夫曼编码
    public String data = "";// 节点的数据
    public int count;// 节点的权值
    public HNode lChild;
    public HNode rChild;

    public HNode() {
    }

    public HNode(String data, int count) {
        this.data = data;
        this.count = count;
    }

    public HNode(int count, HNode lChild, HNode rChild) {
        this.count = count;
        this.lChild = lChild;
        this.rChild = rChild;
    }

    public HNode(String data, int count, HNode lChild, HNode rChild) {
        this.data = data;
        this.count = count;
        this.lChild = lChild;
        this.rChild = rChild;
    }


    @Override
    public String toString() {
        return "HNode{" +
                "code='" + code + '\'' +
                ", data='" + data + '\'' +
                ", count=" + count +
                ", lChild=" + lChild +
                ", rChild=" + rChild +
                '}';
    }
}
