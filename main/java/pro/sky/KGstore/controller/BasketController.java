package pro.sky.KGstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.KGstore.service.BasketService;


import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String add(@RequestParam List<Long> items) {
        basketService.add(items);
        return "Товары добавлены в корзину!";
    }

    @GetMapping("/get")
    public List<Long> get() {
        return basketService.get();
    }
}
