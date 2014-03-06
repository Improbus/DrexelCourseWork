import java.io.*;
import java.util.*;
import java.lang.Math;

public class gInt{

	public int real;
	public int imaginary;
	public double i = Math.sqrt(-1);

	public gInt(int r)
	{
		real = r;
	}

	public gInt(int r, int i)
	{
		real = r;
		imaginary = i;
	}

  public int real()
	{
		return real;
	}

	public int imag()
	{
		return imaginary;
	}

	public gInt add( gInt rhs)
	{
		return new gInt(real + rhs.real(), imaginary + rhs.imag());
	}

	public gInt multiply( gInt rhs)
	{
		
		int multReal = real * rhs.real() - imaginary * rhs.imag();
    int multImag = real * rhs.imag() + imaginary * rhs.real();

    return new gInt(multReal, multImag);		
	}

	public double norm()
	{
		return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
	}

}
