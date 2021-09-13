#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

Node* head;

void Insert(int data) {
    Node* temp1 = new Node;
    temp1->data = data;
    temp1->next = head;
    head = temp1;
}

void Print() {
    Node* temp1 = head;
    while (temp1 != NULL) {
        cout << " " << temp1->data;
        temp1 = temp1->next;
    }
    cout << endl;
}

void Delete(int n) {
    Node* temp1 = head;
    if (n == 1) {
        head = temp1->next;
        delete temp1;
        return;
    }
    for (int i = 0; i < n - 2; i++)
        temp1 = temp1->next;
        Node* temp2 = temp1->next;
        temp1->next = temp2->next;
        delete temp2;

}

void insertPos(int pos, int data)
{
  Node* prev = new Node();
  Node* curr = new Node();
  Node* newNode = new Node();
  newNode->data = data;

  int tempPos = 0;   // Traverses through the list

  curr = head;      // Initialize current to head;
  if(head != NULL)
  {
    while(curr->next != NULL && tempPos != pos)
    {
        prev = curr;
        curr = curr->next;
        tempPos++;
    }
    if(pos==0)
    {
       cout << "Nu este posibil de adaugat la inceput <-Head->! " << endl;
    }
    else if(curr->next == NULL && pos == tempPos+1)
    {
      cout << "Nu este posibil de adaugat pe ultimul nod <-Tail->! " << endl;
    }
    else if(pos > tempPos+1)
      cout << " Pozitia este invalida " << endl;

    else
    {
        prev->next = newNode;
        newNode->next = curr;
        cout << "Element a fost adaugat in pozitia : " << pos << endl;
    }
 }
 else
 {
    head = newNode;
    newNode->next=NULL;
    cout << "Sa adaugat la cap, deoarece lista este goalã! " << endl;
 }
}

void swapNodes(Node** head_ref, int x, int y)
{
    if (x == y)
        return;

    Node *prevX = NULL, *currX = *head_ref;
    while (currX && currX->data != x) {
        prevX = currX;
        currX = currX->next;
    }

    Node *prevY = NULL, *currY = *head_ref;
    while (currY && currY->data != y) {
        prevY = currY;
        currY = currY->next;
    }

    if (currX == NULL || currY == NULL)
        return;

    if (prevX != NULL)
        prevX->next = currY;
    else
        *head_ref = currY;

    if (prevY != NULL)
        prevY->next = currX;
    else
        *head_ref = currX;

    Node* temp = currY->next;
    currY->next = currX->next;
    currX->next = temp;
}
int main() {

    head = NULL;
    int num,m,count=0,n,data,pos,x,y,choose;

    while(choose!=0){
        cout<<endl<<endl;
        cout<<"**********************************"<<endl;
        cout<<"*1. Introdu elemente in lista    *"<<endl;
        cout<<"*2. Afiseaza elementele listei   *"<<endl;
        cout<<"*3. Sterge un element din lista  *"<<endl;
        cout<<"*4. Insereaza un nou element     *"<<endl;
        cout<<"*5. Modifica elementele in lista *"<<endl;
        cout<<"**********************************"<<endl;
        cin>>choose;
        system("cls");
    switch(choose){
        case 1:
            cout<<"Introdu numarul de elemente : "<<endl;
            cin>>m;
            while(cout<<"Elemetul ["<<count+1<<"]"<<endl,cin>>num){
                Insert(num);
                count++;
                if (count==m){break;}
            }break;
        case 2:
            cout<<"Elementele listei sunt : "<<endl;
            Print();break;
        case 3:
            cout << "Introduceti pozitia penru care doriti sa stergeti elementrul : " << endl;
            cin >> n;
            Delete(n);break;
        case 4:
            cout<<"Introdu elementul care doriti sa-l inserati : "<<endl;
            cin>>data;
            cout<<"Introduceti pozitia unde doriti sa inserati elementul : "<<endl;
            cin>>pos;
            insertPos(pos, data);break;
        case 5:
            cout<< "Rezultatul :"<<endl;
            cout<<"Intoro pozitia elementelor care doriti sa le schimbati X si Y"<<endl;
            cin>>x;
            cin>>y;
            swapNodes(&head,x,y);break;
        case 0:
            continue;
        default:
            cout<<"**********************************"<<endl;
            cout<<"*1. Introdu elemente in lista    *"<<endl;
            cout<<"*2. Afiseaza elementele listei   *"<<endl;
            cout<<"*3. Sterge un element din lista  *"<<endl;
            cout<<"*4. Insereaza un nou element     *"<<endl;
            cout<<"*5. Modifica elementele in lista *"<<endl;
            cout<<"**********************************"<<endl;
            cin>>choose;
            system("cls");
    }

    }


    return 0;
}
