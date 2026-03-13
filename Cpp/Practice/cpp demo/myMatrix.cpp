#include<iostream>
using namespace std;

class myMatrix
{
	int **mat;
	int row, col;
	
	
	public:
		myMatrix()
		{
			cout<<"default constructor";
			row = col = 3;
			mat = new int *[row];
			for(int i = 0; i<row;i++)
			{
				mat = new int[col];
			}
		}
		
		myMatrix(int s)
		{
			row = col = s
			cout<<"1 parameterize constructor";
			mat =  new int *[row];
			for(int i=0; i<row; i++)
			{
				mat = new int[col];
			}
		}
		
		myMatrix(int r,int c)
		{
			cout<<"2 parameterize constructor";
			row = r;
			col = c;
			mat = new int *[row];
			for(int i=0;i<row;i++)
			{
				mat = new int[col];
			}
		}
		
		~myMatrix()
		{
			cout<<"Destructor..."
			for(int i =0;i<row;i++)
				delete [] mat[i];
			
			delete []mat;
		}
		
		myMatrix(const myMatrix &m)
		{
			cout<<"\n Copy Constructor";
			row = m.row;
			col = m.col;
			
			mat = new int *[row];
			for(int i=0; i<row; i++)
			{
				mat =  new int[col];	
			}	
			
			for(int i = 0; i<row; i++)
			{
				for(int j = 0; j<col; j++)
				{
					mat[i][j] = m.mat[i][j];
				}
			}
		} 
		
		const myMatrix &operator=(const myMatrix &m)
		{
			for(int i = 0; i<row; i++)
			{
				delete [] mat[i]; 
			}
			delete [] mat;
			
			
			for(
			)
		}
		
		
		
		
		
		
};
