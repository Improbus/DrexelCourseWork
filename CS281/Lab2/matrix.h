#define CUTOFF 64
#define PRECISION 6

extern float *vector();
extern float **matrix();
extern float **submatrix();
extern void print_vector();
extern void print_matrix();
extern float **zero_matrix();
extern void insert_matrix();
extern float matrix_norm();
extern float **matrix_add();
extern float **matrix_sub();
extern float **matrix_prod();
extern void free_submatrix();
extern void free_matrix();
extern void free_vector();
extern float **block_prod(int m1,int p1,int n1,int m2,int p2,int n2, 
                          float **A,float **B);
