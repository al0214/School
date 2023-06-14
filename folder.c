#include <stdio.h>
#include <stdlib.h>
#include <memory.h>

typedef struct treeNode {
	int size;
	struct treeNode *left, *right;
}NODE;

int folderSize = 0;

NODE* makeRootNode(int size, NODE* leftNode, NODE* rightNode) {
	NODE* root = (NODE*)malloc(sizeof(NODE));
	root->size = size;
	root->left = leftNode;
	root->right = rightNode;
	return root;
}

int postorder_Folder(NODE *root) {
	if (root) {
		postorder_Folder(root->left);
		postorder_Folder(root->right);
		folderSize += root->size;
	}
	return folderSize;
}

int main() {
	NODE* F11 = makeRootNode(120, NULL, NULL);
	NODE* F10 = makeRootNode(55, NULL, NULL);
	NODE* F9 = makeRootNode(100, NULL, NULL);
	NODE* F8 = makeRootNode(200, NULL, NULL);
	NODE* F7 = makeRootNode(68, F10, F11);

	NODE* F6 = makeRootNode(48, NULL, NULL);
	NODE* F5 = makeRootNode(15, NULL, NULL);
	NODE* F4 = makeRootNode(2, F8, F9);
	NODE* F3 = makeRootNode(10, F6, F7);
	NODE* F2 = makeRootNode(0, F4, F5);
	NODE* F1 = makeRootNode(0, F2, F3);

	printf("\n\nC:\\의 용량 : %d M \n", postorder_Folder(F2));

	folderSize = 0;

	printf("\n D:\\의 용량 : %d M \n", postorder_Folder(F3));

	folderSize = 0;

	printf("\n 내 컴퓨터의 전체 용량 : %d M \n", postorder_Folder(F1));

	getchar();

	

}