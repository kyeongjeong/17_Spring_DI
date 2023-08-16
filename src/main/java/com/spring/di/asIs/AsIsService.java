package com.spring.di.asIs;

import org.springframework.stereotype.Service;

@Service // 해당 클래스가 Service클래스임을 Spring bean에 등록
public class AsIsService {

	AsIsDAO asIsDAO = new AsIsDAO();
}