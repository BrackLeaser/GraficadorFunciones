public class funcion {
    String definicion;
    IMathParser parse = MathParserFactory.Create();
    
    public funcion (String def){
    definicion=def;
    parse.setExpression(def);
    }
    public double eval(Double x)throws Exception{
        double r= Double.NaN;
        parse.setX(x);
        r=parse.getValue();
        return r;
    }
    public double []eval(double[] x)throws Exception{
        int n=x.length;
        double [] r= new double[n];
        for(int i = 0; i < n; i++){
        r[i]=eval(x[i]);
        }
        return r;
    }
    public double[]rango(double x0,double xn,double d){
    int n = (int)Math.abs(xn-x0/d);
    double[] r = new double[n];
    for (int i = 0; 1 < n; i++){
    r[i]=x0;
    x0+=d;
    }
    return r;    
    }
}
   
