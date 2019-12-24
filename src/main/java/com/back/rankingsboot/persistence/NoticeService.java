package com.back.rankingsboot.persistence;

import com.back.rankingsboot.domain.Notice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * NoticeService
 * <pre>
 * Describe here
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 * lia.jung, 1.0, 2019/12/24 초기작성
 * </pre>
 *
 * @author lia.jung
 * @version 1.0,
 */
@Service
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class NoticeService {

    private final NoticeRepository noticeRepository;

    @Transactional
    public List<Notice> getNoticeList() {
        return (List<Notice>) noticeRepository.findAll();
    }

    @Transactional
    public Notice save(Notice notice) {
        log.debug("notice save : {}", notice);
        return noticeRepository.save(notice);
    }

    @Transactional
    public void delete(Long id) {
        noticeRepository.deleteById(id);
        log.info("notice delete : {}", id);
    }
}
