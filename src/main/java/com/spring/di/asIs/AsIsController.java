package com.spring.di.asIs;

import org.springframework.stereotype.Controller;

@Controller // 해당 클래스가 Controller클래스임을 Spring bean에 등록
public class AsIsController {

	// 객체의 생성 순서 Controller > Service > DAO
	// 객체가 생성됨과 동시에 클래스 내부에서 다른 객체를 생성한다. >>> 결합력(의존성)이 강하다.
	AsIsService asIsService = new AsIsService(); 
}
