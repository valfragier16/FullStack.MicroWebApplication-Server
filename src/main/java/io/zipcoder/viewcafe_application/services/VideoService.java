package io.zipcoder.viewcafe_application.services;

import io.zipcoder.viewcafe_application.models.Video;
import io.zipcoder.viewcafe_application.repositories.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    private VideoRepository repository;

    public VideoService(VideoRepository repository){
        this.repository = repository;
    }

    public Iterable<Video> index(){
        return repository.findAll();
    }

    public Video show(Long videoId){
        return repository.findOne(videoId);
    }

    public Video create(Video video){
        return repository.save(video);
    }

    public Video update(Long videoId, Video video){
        Video ogVideo = repository.findOne(videoId);
        ogVideo.setVideoDescription(video.getVideoDescription());
        ogVideo.setVideoName(video.getVideoName());
        return repository.save(video);
    }

    public Boolean delete(Long videoId){
        repository.delete(videoId);
        return true;
    }

}
