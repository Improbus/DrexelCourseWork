using System;
using System.Collections.Generic;
using System.Text;

namespace NGForms.FormGenerator.Infrastructure.Core
{
    // Prevent us from referencing .NET 3.0
    public delegate void Action<T1> (T1 arg1);
    public delegate void Action<T1, T2> (T1 arg1, T2 arg2);

    public delegate TResult Func<TResult>();
    public delegate TResult Func<T1, TResult>(T1 arg1);
    public delegate TResult Func<T1, T2, TResult>(T1 arg1, T2 arg2);
}
