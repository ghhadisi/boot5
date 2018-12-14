package com.hss.boot5.jpa;

import com.hss.boot5.bean.GoodTypeBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodTypeJPA extends JpaRepository<GoodTypeBean, Long> {
}
