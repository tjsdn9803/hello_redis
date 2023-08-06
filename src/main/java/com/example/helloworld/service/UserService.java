package com.example.helloworld.service;

import com.example.helloworld.dto.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ExternalApiService externalApiService;
    private final StringRedisTemplate redisTemplate;
    public UserProfile getUserProfile(String userId) {

//        String userName = null;
//        ValueOperations<String, String> ops = redisTemplate.opsForValue();
//        String cachedName = ops.get("nameKey:" + userId);

//        if(cachedName != null) {
//            userName = cachedName;
//        }else {
//            userName = externalApiService.getUserName(userId);
//            ops.set("nameKey:" + userId, userName, 5, TimeUnit.SECONDS);
//        }
        String userName = externalApiService.getUserName(userId);
        int userAge = externalApiService.getUserAge(userId);
        return new UserProfile(userName, userAge);
    }
}
