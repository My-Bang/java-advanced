package day09.tree.binarySrarchTree;

// 1. Node 생성 => Root
// 2. BST에 데이터 넣는 기능 구현
public class NodeMgmt {
    Node head = null;

    public class Node {
        public Node next;
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        //CASE1 : Node가 하나도 없을때
        if (this.head == null) {
            this.head = new Node(data);
        } else {        //CASE2 : Node가 하나 이상 들어가 있을때
            Node finfNode = this.head;
            while (true) {
                //CASE2-1 : 현재 Node의 왼쪽에 노드가 들어가야 할때
                if (data < finfNode.value) {
                    if (finfNode.left != null) {
                        finfNode = finfNode.left;
                    } else {
                        finfNode.left = new Node(data);
                        break;
                    }
                    //CASE2-2 : 현재 Node의 오른쪽에 Node가 들어가야 할때


                } else {
                    if (finfNode.right != null) {
                        finfNode = finfNode.right;
                    } else {
                        finfNode.right = new Node(data);
                        break;
                    }

                }
            }
        }

        return true;
    }

    public Node search(int data) {
        // CASE 1 : Node가 하나도 없을때
        if (this.head == null) {
            return null;

            // CASE 2 : Node가 하나 이상일 때
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
        }

        return null;
    }
    // 노드 삭제 boolean delete(int data); 추가 팀 과제

    public boolean delete(int data) {
        if (head == null) {
            return false; // 트리가 비어있으면 삭제할 수 없음
        }

        Node current = head;
        Node parent = null;

        // 노드를 찾기 위한 탐색
        while (current != null && current.value != data) {
            parent = current;
            if (data < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            return false; // 찾는 노드가 없으면 false 반환
        }

        // 자식이 없는 경우
        if (current.left == null && current.right == null) {
            if (parent == null) {
                head = null; // 루트 노드일 경우 트리가 비게 됨
            } else if (parent.left == current) {
                parent.left = null; // 왼쪽 자식 노드 삭제
            } else {
                parent.right = null; // 오른쪽 자식 노드 삭제
            }
        }
        // 자식이 하나만 있는 경우
        else if (current.left == null) {
            if (parent == null) {
                head = current.right; // 루트 노드 삭제 후 오른쪽 자식이 루트가 됨
            } else if (parent.left == current) {
                parent.left = current.right; // 왼쪽 자식 노드를 오른쪽 자식으로 대체
            } else {
                parent.right = current.right; // 오른쪽 자식 노드를 대체
            }
        }
        else if (current.right == null) {
            if (parent == null) {
                head = current.left; // 루트 노드 삭제 후 왼쪽 자식이 루트가 됨
            } else if (parent.left == current) {
                parent.left = current.left; // 왼쪽 자식으로 대체
            } else {
                parent.right = current.left; // 오른쪽 자식으로 대체
            }
        }
        // 자식이 둘 다 있는 경우
        else {
            Node successor = findMin(current.right); // 오른쪽 서브트리에서 최소값 찾기
            delete(successor.value); // 그 값을 삭제하여 대체
            current.value = successor.value; // 최소값을 삭제할 노드에 복사
        }

        return true;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }





}




