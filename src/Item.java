import java.util.List;

public class Item {

	private String by;
	private Integer descendants;
	private Integer id;
	private List<Integer> kids = null;
	private Integer score;
	private Integer time;
	private String title;
	private String type;
	private String url;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Item() {
	}

	/**
	 * 
	 * @param id
	 * @param title
	 * @param time
	 * @param score
	 * @param descendants
	 * @param by
	 * @param kids
	 * @param type
	 * @param url
	 */
	public Item(String by, Integer descendants, Integer id, List<Integer> kids, Integer score, Integer time,
			String title, String type, String url) {
		super();
		this.by = by;
		this.descendants = descendants;
		this.id = id;
		this.kids = kids;
		this.score = score;
		this.time = time;
		this.title = title;
		this.type = type;
		this.url = url;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public Integer getDescendants() {
		return descendants;
	}

	public void setDescendants(Integer descendants) {
		this.descendants = descendants;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Integer> getKids() {
		return kids;
	}

	public void setKids(List<Integer> kids) {
		this.kids = kids;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Item[by = " + this.by + ", descendants = " + this.descendants + ", id=" + this.id + ", score="
				+ this.score + ", time=" + this.time + ", title=" + this.title + ", type=" + this.type + ", url="
				+ this.url + "]";
	}
}