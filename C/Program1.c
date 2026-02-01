#include <stdio.h>

struct Address 
{
    char city[20];
    int pin;
};

struct Student 
{
    int roll;
    char name[20];
    struct Address addr;
};

int main() 
{
    struct Student s;

    printf("Enter roll number: ");
    scanf("%d", &s.roll);

    printf("Enter name: ");
    scanf("%s", s.name);

    printf("Enter city: ");
    scanf("%s", s.addr.city);

    printf("Enter pin code: ");
    scanf("%d", &s.addr.pin);

    printf("\n--- Student Details ---\n");
    printf("Roll No: %d\n", s.roll);
    printf("Name: %s\n", s.name);
    printf("City: %s\n", s.addr.city);
    printf("Pin: %d\n", s.addr.pin);

    return 0;
}