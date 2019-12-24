package com.back.rankingsboot.persistence;

import com.back.rankingsboot.domain.Notice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * NoticeRepositoryTest
 * <pre>
 * Describe here
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 * lia.jung, 1.0, 2019/12/23 초기작성
 * </pre>
 *
 * @author lia.jung
 * @version 1.0,
 */
@SpringBootTest
class NoticeRepositoryTest {

    @Autowired
    private NoticeRepository noticeRepository;

    @Test
    public void inspect() {

        Class<?> clz = noticeRepository.getClass();

        System.out.println(clz.getName());

        Class<?>[] interfaces = clz.getInterfaces();

        Stream.of(interfaces).forEach(inter -> System.out.println(inter.getName()));

        Class<?> superClasses = clz.getSuperclass();
        System.out.println(superClasses.getName());
    }

    @Test
    public void testInsert() {
        Notice notice = new Notice();

        notice.setNoticeTitle("title2");
        notice.setNoticeContent("content2");
        notice.setNoticeImage("img2.jpg");

        noticeRepository.save(notice);
    }

}
