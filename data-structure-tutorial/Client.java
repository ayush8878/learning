public class TreeNode<T> {
   private T value = null;
   private TreeNode[] childrens = new TreeNode[100];
   private int childCount = 0;

    TreeNode(T value) {
        this.value = value;
    }

    public TreeNode addChild(T value) {
        TreeNode newChild = new TreeNode(value, this);
        childrens[childCount++] = newChild;
        return newChild;
    }

    static void traverse(TreeNode obj) {
        if (obj != null) {
            for (int i = 0; i < obj.childCount; i++) {
                System.out.println(obj.childrens[i].value);
                traverse(obj.childrens[i]);
            }
        }
        return;
    }

    void printTree(TreeNode obj) {
        System.out.println(obj.value);
        traverse(obj);
    }
}
public class Client {
    public static void main(String[] args) {
        TreeNode menu = new TreeNode("Menu");
        TreeNode item = menu.addChild("Starter");
            item = item.addChild("Veg");
                item.addChild("Paneer Tikka");
                item.addChild("Malai Paneer Tikka");
            item = item.addChild("Non-veg");
                item.addChild("Chicken Tikka");
                item.addChild("Malai Chicken Tikka");
        item = menu.addChild("Main Course");
            item = item.addChild("Veg");
                item.addChild("Mili Juli Sabzi");
                item.addChild("Aloo Shimla Mirch");
            item = item.addChild("Non-veg");
                item.addChild("Chicken Do Pyaaza");
                item.addChild("Chicken Chettinad");
        item = menu.addChild("Desserts");
                item = item.addChild("Cakes");
                        item.addChild("Black Forest");
                        item.addChild("Black Current");
                item = item.addChild("Ice Creams");
                        item.addChild("chocolate");
                        item.addChild("Vanilla");
        menu.printTree(menu);
    }
}
