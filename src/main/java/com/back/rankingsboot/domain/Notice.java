package com.back.rankingsboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * NoticeVO
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

@Data
@Entity
@Table(name = "notice")
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(insertable = false, nullable = false, length = 20)
    private Long noticeId;

    @Column(nullable = false)
    private String noticeTitle;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String noticeContent;

    @Column
    private String noticeImage;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime noticeCreatedAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false)
    @UpdateTimestamp
    private LocalDateTime noticeUpdatedAt;



}
