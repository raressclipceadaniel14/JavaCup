package cup.example;
import java.util.ArrayList;
import java.util.List;

public class HtmlEl {
	private String data;
	private List<HtmlEl> children;
	private List<HtmlEl> brotherElements;

	public HtmlEl(String data) {
        this.data = data;
        this.children = new ArrayList<>();
        this.brotherElements = new ArrayList<>(); 
    }
	
	public void addChild(HtmlEl child) {
		if (child != null) {
			children.add(child);
		}
	}
	
	public void addBrother(HtmlEl child) {
		if (child != null) {
			brotherElements.add(child);
		}
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public List<HtmlEl> getChildren() {
		return children;
	}
	
	public List<HtmlEl> getBrotherElements() {
		return brotherElements;
	}
	
	public void setChildren(List<HtmlEl> children) {
		this.children = children;
	}
	
	public static HtmlEl createElement(String elementName, HtmlEl... children) {
		HtmlEl element = new HtmlEl(elementName);

	    for (HtmlEl child : children) {
	        if (child != null) {
	            element.addChild(child);
	        }
	    }

	    return element;
	}
}
