
public class grafica {
    JFreeChart grafica;
    XYSeriesCollection datos=new XYSeriesCollection();
    String titulo;
    String etiquetax;
    String etiquetay;
    
    public grafica (String t, String x, String y){
        titulo=t;
        etiquetax=x;
        etiquetay=y;
        grafica=ChartFactory.createXYLineChart(titulo, x, y, datos, PlotOrientation.VERTICAL, true, true, true);
        
    }
    public grafica(){
    this("Sin Titulo","x","y");
    }
    public void agregargrafica(String id,double[] x, double[] y){
    XYSeries s= new XYSeries(id);
    int n=x.length;
        for(int i = 0; i < n; i++){
        s.add(x[i], y[i]);
        }
        datos.addSeries(s);
    }
    public void creargrafica(String id, double[] x, double[] y){
    datos.removeAllSeries();
    agregargrafica(id, x, y);
    }
    public jpanel obtenergrafica(){
    return new ChartPanel(grafica);
    }
}
