package com.back.rankingsboot.persistence;

import com.back.rankingsboot.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * NoticeRepository
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
@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {

}
