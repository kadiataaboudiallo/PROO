class Node {
    private Node left, right;
    private static char staticLabel = 'a';

    private char label;
    Node (){
        label = staticLabel++;
    }
    Node getleft(){
        return left;
    }
    Node getRight(){
        return Right;
    }
    void stchildren(Node left, Node right){
        this.left = left;
        this.right = right;
    }
    char getID(){
        return label;
    }
    static void clearID(){
        staticLabel = 'a';
    }
}