// week2 : [BOJ / Tree] 1991 (트리 순회 / 실버 1)

package BOJ_Programmers.Tree;

import java.io.*;
import java.util.*;

public class baek1991 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        // 이진트리 작성
        StringTokenizer st;
        Tree binaryTree = new Tree();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 3; j++) {
                binaryTree.insert(st.nextToken());
            }
        }


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

        Node getLeft() {
            return left;
        }

        void setLeft(Node left) {
            this.left = left;
        }

        Node getRight() {
            return right;
        }

        void setRight(Node right) {
            this.right = right;
        }
    }

    static class Tree {
        Node root;

        Tree () {
            this.root = null;
        }

        void insert(String value) {
            if (root == null) {
                root = new Node(value);
            } else {

            }
        }
    }
}
