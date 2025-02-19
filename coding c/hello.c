#include <stdio.h>

int main ()
{
    char v;
    printf ("Enter letter: ");
    scanf ("%c", &v);

    
        if (v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
        {
        printf ("The letter is a vowel");
        }
        else
        {
            printf ("The letter is a consonant");
        }
return 0;   
}
