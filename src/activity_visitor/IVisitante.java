package activity_visitor;

public interface IVisitante {
    void visitar (DocumentoPDF pdf);
    void visitar (DocumentoDOCX docx);
    void visitar (DocumentoTXT txt);
}
