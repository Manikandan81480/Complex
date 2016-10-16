class Complex
{
public void main(Strings... args)
{
int i=0,j=0,k=0;
Scanner x=new Scanner(System.in);
int a[]=new int[x.nextInt()];
int l=a.length();
for(i=0;i<l;i++)
{
a[i]=x.nextInt();
}
for(i=0;i<l;i++)
{
for(j=i+1;j<l;j++)
{
k=a[i];
a[i]=a[j];
a[j]=k;
}
}
for(i=0;i<l;i++)
{
if(a[i]==a[i+1])
{
System.out.println("output complex"+a[i]);
}
}

}
}

