package org.example.model;

public class SearchingWord {
    private String text;
    private String keyword;
    private String answer;

    public SearchingWord() {
        this.text = "";
        this.keyword = "";
        this.answer = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void search () {
        int count = 0;
        int viTri = 0;
        while (true) {
            int i = this.text.indexOf(this.keyword, viTri);
            if(i == -1) {
                break;
            } else {
                ++count;
                viTri = i + 1;
            }
        }
        this.answer = "Kết quả: Có " + count + " từ " + this.keyword + " trong văn bản trên";
    }
}
