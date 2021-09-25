//package com.dd.army.service;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.dd.army.model.UplvtdUser;
//import com.dd.army.repository.UplvtdUserRepostory;
//
//@Configuration
//public class ThreadTest {
//
//	@Autowired
//	UplvtdUserRepostory repo;
//
//	@Bean
//	public void testThread() {
//
//		// crate statement
//		for (int i = 0; i < 100; i++) {
//
//			new Thread(() -> {
//				try {
//
//					while (true) {
//						List<UplvtdUser> lists = new ArrayList<>();
//						lists = repo.findAll();
//						System.out.println(lists.toString());
//						
//						for (UplvtdUser uplvtdUser : lists) {
//							Random random = new Random();
//							int value = random.nextInt(100);
//							UplvtdUser up = repo.save(uplvtdUser.setSpeed(value));
//							System.out.println(value);
//						}
//						
//						Thread.sleep(1000);
//					}	
//
//					//
//					// conn.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//
//			}).start();
//			System.out.println(i);
//		}
//
//	}
//}
