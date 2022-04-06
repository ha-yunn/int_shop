package com.shopping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ItemController {

    //상품 등록
    @GetMapping(value = "/admin/item/new")
    public String itemForm() {
        return "item/itemForm";
    }
}