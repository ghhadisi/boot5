package com.hss.boot5.jpa;

import com.hss.boot5.bean.GoodInfoBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodInfoJPA extends JpaRepository<GoodInfoBean, Long> {
}
