//
//  main.c
//  Node
//
//  Created by SamoYed on 2023/03/22.
//

#include <stdio.h>
#include <stdlib.h>

typedef struct NODE{
    struct NODE * left;
    char data;
    struct NODE * right;
}NODE;

NODE * CREATE(char data){
    NODE * pNODE = NULL;
    pNODE = (NODE*)malloc(sizeof(NODE));
    if(pNODE == NULL)
        return NULL;
        pNODE->left = NULL;
        pNODE->data = data;
        pNODE->right = NULL;
    
    printf("%c 노트 생성\n", pNODE-> data);
    return pNODE;
}

void printPREORDER(NODE * pNODE){
    if(pNODE == NULL)
        return;
    
    printf("%c ",pNODE -> data);
    printPREORDER(pNODE->left);
    printPREORDER(pNODE->right);
    
}

void printINORDER(NODE * pNODE){
    if(pNODE == NULL)
        return;
    
    printINORDER(pNODE -> left);
    printf("%c ", pNODE -> data);
    printINORDER(pNODE -> right);
}

void printPOSTORDER(NODE * pNODE){
    if(pNODE == NULL)
        return;
    
    printPOSTORDER(pNODE -> left);
    printPOSTORDER(pNODE -> right);
    printf("%c ", pNODE -> data);
}

void printDELETE(NODE * pNDOE){
    if(pNDOE != NULL){
        if(pNDOE -> left != NULL)
            printDELETE(pNDOE->left);
        if(pNDOE -> right != NULL)
            printDELETE(pNDOE->right);
        printf("\n%c 노드 삭제", pNDOE->data);
        free(pNDOE);
    }
}

int main(void) {
    NODE*pRoot = NULL;
    pRoot = CREATE('A');
    pRoot->left = CREATE('B');
    pRoot->right = CREATE('C');
    pRoot->left->left=CREATE('D');
    pRoot->left->right = CREATE('E');
    pRoot->right->left = CREATE('F');
    pRoot->right->right = CREATE('G');
    pRoot->left->right->left = CREATE('H');
    
    printf("전위 순회(Preorder): ");
    printPREORDER(pRoot);
    
    printf("\n중위 순회(Inorder): ");
    printINORDER(pRoot);
    
    printf("\n후위 순회(Postorder): ");
    printPOSTORDER(pRoot);
    
    printDELETE(pRoot);
    
    getchar();
    
}
