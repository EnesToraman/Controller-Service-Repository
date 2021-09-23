package model;

public class Video {

	private Long id;
	
	private String name;
	
	private Resolution resolution;

	enum Resolution {HIGH, MEDIUM, LOW}

	public Video(Long id, String name, Resolution resolution) {
		this.id = id;
		this.name = name;
		this.resolution = resolution;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};
	
	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	public void setResolution(String resolution) {
		this.resolution = Resolution.valueOf(resolution);
	}
}
