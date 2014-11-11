package kata4;

public class HistogramBuilder<E> {
    
    private E[] items;

    public HistogramBuilder(E[] items) {
        this.items = items;
    }
    
    //con esa <A> indicamos que la A de AttributeExtractor es generica // metodo generico en realidad.
    public <A> Histogram build(AttributeExtractor<E, A> extractor){
        Histogram<A> histogram = new Histogram<>();
        for (E item : items) {
            A attribute = extractor.extract(item);
            histogram.put(attribute, histogram.get(attribute) + 1);
        }
        return histogram;
    }   

}
