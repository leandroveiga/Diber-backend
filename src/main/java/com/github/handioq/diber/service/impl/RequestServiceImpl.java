package com.github.handioq.diber.service.impl;

import com.github.handioq.diber.model.entity.Request;
import com.github.handioq.diber.repository.RequestRepository;
import com.github.handioq.diber.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RequestServiceImpl implements RequestService {

    @Autowired
    RequestRepository requestRepository;

    @Override
    public List<Request> findByOrderId(long userId) {
        return requestRepository.findByOrderId(userId);
    }

}