//package com.example.helloworld;
//
//import com.example.helloworld.service.RankingService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.time.Duration;
//import java.time.Instant;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//@SpringBootTest
//public class SimpleTest {
//
//    @Autowired
//    private RankingService rankingService;
//
//    @Test
//    void insertScore() {
//        for (int i = 0; i < 1000000; i++) {
//            int score = (int) (Math.random() * 1000000);
//            String userId = "user_" + i;
//
//            rankingService.setUserScore(userId, score);
//        }
//    }
//
//    @Test
//    void getRanks() {
//        rankingService.getTopRank(1);
//
//        Instant before = Instant.now();
//        Long userRank = rankingService.getUserRanking("userId_100");
//        Duration elapsed = Duration.between(before, Instant.now());
//
//        System.out.println(String.format("Rank(%d) - Took %d ms", userRank, elapsed.getNano() / 1000000));
//
//        before = Instant.now();
//        List<String> topRankers = rankingService.getTopRank(10);
//        elapsed = Duration.between(before, Instant.now());
//
//        System.out.println(String.format("Range - Took %d ms", elapsed.getNano() / 1000000));
//    }
//    @Test
//    void inMemorySortPerformance() {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            int score = (int) (Math.random() * 1000000);
//            list.add(score);
//        }
//        Instant before = Instant.now();
//        Collections.sort(list); //
//        Duration elapsed = Duration.between(before, Instant.now());
//        System.out.println((elapsed.getNano() / 1000000) + "ms");
//    }
//}
