public class Printer {
    private boolean isDuplex;
    private int pages=0;
    private int pagesPrint=0;
    private int toner=100;

    public Printer(boolean isDuplex, int pages, int toner) {
        this.isDuplex = isDuplex;
        if(pages>0)
            this.pages = pages;
        if(toner>0&&toner<101)
            this.toner = toner;
    }

    public void print(String text,int pages){
        if(this.pages>=pages){
            if (this.toner>=pages){
                for(int x=0;x<pages;x++){
                    this.toner--;
                    this.pages--;
                    this.pagesPrint++;
                }
                System.out.println("Se imprimieron "+ pages +" paginas con el texto: "+ text);
                System.out.println("--Paginas disponibles: "+this.pages);
                System.out.println("--Tinta disponible: "+this.toner);
                System.out.println("--Total de paginas impresas: "+this.pagesPrint);
            }else{
                System.out.println("Solo se pueden imprimir "+ this.toner);
                this.pagesPrint+=toner;
                this.pages-=this.toner;
                this.toner=0;
                System.out.println("--Paginas disponibles: "+this.pages);
                System.out.println("--Tinta disponible: "+this.toner);
                System.out.println("--Total de paginas impresas: "+this.pagesPrint);
            }
        }else{
            System.out.println("Solo se pueden imprimir "+ this.pages);
            this.pagesPrint+=this.pages;
            this.toner-=this.pages;
            this.pages=0;
            System.out.println("--Paginas disponibles: "+this.pages);
            System.out.println("--Tinta disponible: "+this.toner);
            System.out.println("--Total de paginas impresas: "+this.pagesPrint);
        }
    }

    public void addPages(int pages) {
        this.pages += pages;
    }

    public void addToner(int toner) {
        if(this.toner+toner<101)
            this.toner += toner;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getPages() {
        return pages;
    }

    public int getPagesPrint() {
        return pagesPrint;
    }

    public int getToner() {
        return toner;
    }
}

