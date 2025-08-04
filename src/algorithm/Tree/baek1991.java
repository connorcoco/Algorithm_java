// week2 : [BOJ / Tree] 1991 (트리 순회 / 실버 1)

package algorithm.Tree;

import java.io.*;
import java.util.*;

public class baek1991 {
    static StringBuilder sb;

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        // 이진트리 작성
        StringTokenizer st;
        Tree binaryTree = new Tree();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            String parentValue = st.nextToken();
            String leftValue = st.nextToken();
            String rightValue = st.nextToken();
            binaryTree.insert(parentValue, leftValue, rightValue);
        }
        sb = new StringBuilder();
        binaryTree.before(sb, binaryTree.root);
        sb.append("\n");
        binaryTree.middle(sb, binaryTree.root);
        sb.append("\n");
        binaryTree.after(sb, binaryTree.root);
        System.out.println(sb);
    }

    static class Node {
        String value;
        Node left;
        Node right;

        Node(String value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree {
        Node root;

        Tree () {
            this.root = null;
        }

        void insert(String pValue, String lValue, String rValue) {
            if (root == null) {
                root = new Node(pValue);
            }
            insertNode(root, pValue, lValue, rValue);
        }

        void insertNode(Node parent, String pValue, String lValue, String rValue) {
            if (parent == null) return;

            if (parent.value.equals(pValue)) {
                if (!lValue.equals(".")) parent.left = new Node(lValue);
                if (!rValue.equals(".")) parent.right = new Node(rValue);
            } else {
                // root부터 가지로 한층씩 탐색 -> pValue에 해당하는 Node 찾기 위함
                insertNode(parent.left, pValue, lValue, rValue);
                insertNode(parent.right, pValue, lValue, rValue);
            }
        }

        void before(StringBuilder sb, Node node) {
            if (node == null) return;
            sb.append(node.value);
            before(sb, node.left);
            before(sb, node.right);
        }
        void middle(StringBuilder sb, Node node) {
            if (node == null) return;
            middle(sb, node.left);
            sb.append(node.value);
            middle(sb, node.right);
        }
        void after(StringBuilder sb, Node node) {
            if (node == null) return;
            after(sb, node.left);
            after(sb, node.right);
            sb.append(node.value);
        }
    }
}
