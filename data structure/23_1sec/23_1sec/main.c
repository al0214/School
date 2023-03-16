#include <stdio.h>
#include <stdlib.h>

typedef struct TreeNode{
   int data;
   struct TreeNode *left,*right;
} TreeNode;


//       15
//    4      20
// 1     16     25 를 나타냄
TreeNode n1={1,NULL,NULL};
TreeNode n2={4,&n1,NULL};
TreeNode n3={16,NULL,NULL};
TreeNode n4={25,NULL,NULL};
TreeNode n5={20,&n3,&n4};
TreeNode n6={15,&n2,&n5};
TreeNode *root=&n6;


// 전위 순회
void praorder(TreeNode *root){
    if(root!=NULL){
       printf("[%d]",root->data);
       praorder(root->left);
       praorder(root->right);
    }
}

// 중위 순회
void inorder(TreeNode *root){
    if(root!=NULL){
       inorder(root->left);
       printf("[%d]",root->data);
       inorder(root->right);
    }
}

// 후위 순회
void poastorder(TreeNode *root){
    if(root!=NULL){
       poastorder(root->left);
       poastorder(root->right);
       printf("[%d]",root->data);
    }
}

int main(void){
    
   printf("전위 순회=");
   praorder(root);
   printf("\n");

   printf("중위 순회=");
   inorder(root);
   printf("\n");
   
   printf("후위 순회=");
   poastorder(root);
   printf("\n");

   return 0;
}
