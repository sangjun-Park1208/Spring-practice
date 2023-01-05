package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();
    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){ // private 생성자를 사용 --> 다른 곳에서 new 로 객체 생성 방지
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
