package com.shopping.repository;

import com.shopping.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> ,
        //3.Querydsl
        QuerydslPredicateExecutor<Item> {

    //1.쿼리메소드
    List<Item> findByItemNm(String itemNm);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    //2.JPQL
    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);
}
