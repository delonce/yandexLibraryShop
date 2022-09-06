package main.IssuedPublications;

abstract public class AbstractIssuedPublications {
    private String title;
    private String mainText;

    public AbstractIssuedPublications(String title, String mainText) {
        this.title = title;
        this.mainText = mainText;
    }

    public final void sayDescribe() {
        System.out.println("My name is " + title + " and I'm telling about " + mainText);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }
}
