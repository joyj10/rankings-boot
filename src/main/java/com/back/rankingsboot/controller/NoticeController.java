package com.back.rankingsboot.controller;

import com.back.rankingsboot.domain.Notice;
import com.back.rankingsboot.persistence.NoticeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * NoticeController
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

@Slf4j
@RequestMapping("/notice")
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class NoticeController {

    private NoticeService noticeService;

    @GetMapping
    public List<Notice> getNoticeList() {
        return noticeService.getNoticeList();
    }

    @PostMapping
    public String insert(Notice vo){

        log.info("notice controller insert : {}", vo);
        noticeService.save(vo);

        return "";
    }

    @PutMapping
    public String update(Notice vo) {
        log.info("notice controller update : {}", vo);
        noticeService.save(vo);
        return "";
    }

    @DeleteMapping
    public void delete(int id) {
        log.info("notice controller delete : {}", id);
        noticeService.delete((long) id);
    }

}
