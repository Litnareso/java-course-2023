package edu.hw2;

public class Task2 {
    private Task2() {
    }

    public static class Rectangle {
        private final int width;
        private final int height;

        public Rectangle() {
            this.width = 0;
            this.height = 0;
        }

        private Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        final Rectangle setWidth(int width) {
            return new Rectangle(width, this.height);
        }

        final Rectangle setHeight(int height) {
            return new Rectangle(this.width, height);
        }

        final double area() {
            return (double) width * height;
        }
    }

    public static class Square extends Rectangle {
        public Square() {
            super(0, 0);
        }

        private Square(int size) {
            super(size, size);
        }

        final Square setSize(int size) {
            return new Square(size);
        }
    }

}
