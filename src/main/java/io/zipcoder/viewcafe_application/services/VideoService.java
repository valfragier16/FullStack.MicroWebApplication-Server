package io.zipcoder.viewcafe_application.services;

import io.zipcoder.viewcafe_application.repositories.VideoRepository;

public class VideoService {
    private VideoRepository repository;

    public VideoService(VideoRepository repository){
        this.repository = repository;
    }
}
