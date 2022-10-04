class Rectangle_2 {
    private int x, y, width, height;

    public Rectangle_2(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return width*height;
    }

    void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }

    boolean contains(Rectangle_2 r) {
        return (this.x < r.x) && (this.y < r.y) && (this.x + this.width) >
                (r.x + r.width) && (this.y + this.height) > (r.y + r.height);
    }

    public static void main(String[] args) {
        Rectangle_2 r = new Rectangle_2(2, 2, 8, 7);
        Rectangle_2 s = new Rectangle_2(5, 5, 6, 6);
        Rectangle_2 t = new Rectangle_2(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
