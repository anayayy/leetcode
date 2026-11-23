class BrowserHistory {
    String[] pages=new String[5001];
    int pos=0;
    int last=0;

    public BrowserHistory(String homepage) {
        pages[0]=homepage;
    }

    public void visit(String url) {
        pos++;
        pages[pos]=url;
        last=pos;
    }

    public String back(int steps) {
        pos=Math.max(0,pos-steps);
        return pages[pos];
    }

    public String forward(int steps) {
        pos=Math.min(last,pos+steps);
        return pages[pos];
    }
}
