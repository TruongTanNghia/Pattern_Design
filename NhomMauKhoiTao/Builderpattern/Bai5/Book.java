package NhomMauKhoiTao.Builderpattern.Bai5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private List<String> chapters;

    public Book(String title, int numberOfPages, String author, List<String> chapters) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.chapters = chapters;
    }

    public String toString() {
        String str = "Tiêu đề: " + title + "\n";
        str += "Số Trang: " + numberOfPages + "\n";
        str += "Tác giả: " + author + "\n";
        str += "Danh sách chương: " + chapters.toString();
        return str;
    }
    public static class Builder {
        private String title;
        private int numberOfPages;
        private String author;
        private List<String> chapters = new ArrayList<>();

        public Builder() {}

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder addChapter(String chapter) {
            this.chapters.add(chapter);
            return this;
        }

        public Book build() {
            return new Book(title, numberOfPages, author, chapters);
        }
    }

}

