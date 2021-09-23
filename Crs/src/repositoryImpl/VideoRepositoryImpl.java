package repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import model.Video;
import repository.VideoRepository;

public class VideoRepositoryImpl implements VideoRepository{

	private Video video1;
	private Video video2;
	private Video video3;
	
	public VideoRepositoryImpl() {
		
	}

	public VideoRepositoryImpl(Video video1, Video video2, Video video3) {

		this.video1 = video1;
		this.video2 = video2;
		this.video3 = video3;
		
		video1.setId(1L);
		video1.setName("First video");
		video1.setResolution("HIGH");

		video2.setId(2L);
		video2.setName("Second video");
		video2.setResolution("MEDIUM");
		
		video3.setId(3L);
		video3.setName("Third video");
		video3.setResolution("LOW");
	}
	
	@Override
	public List<Video> getAllVideos() {

		List<Video> videos = new ArrayList<Video>();
		
		videos.add(video1);
		videos.add(video2);
		videos.add(video3);
		
		return null;
	}

}
