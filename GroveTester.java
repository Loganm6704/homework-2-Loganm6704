public class GroveTester {
    public static void main(String[] args){
        Grove grove1 = new Grove();
        System.out.println(grove1);
        for (int i = 0; i < 6; i++){
            Tree spruce = new Tree( 0, 37, "Spruce");
            int plantTrees1 = grove1.plant(spruce);
        }
        System.out.println(grove1);
        Tree removeTree1 = grove1.remove(3);
        Tree removeTree2 = grove1.remove(5);
        System.out.println(grove1);
        Tree maple = new Tree(1, 13, "Maple");
        int plantTrees2 = grove1.plant(maple);
        System.out.println(grove1);
    }
}
