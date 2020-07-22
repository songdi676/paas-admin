package nl.sri.devCloud.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-20
 */
@RestController
@RequestMapping("/devCloud/character-sets")
public class CharacterSetsController {


    @RequestMapping("/test")
    public String test() {
        return "测试";
    }
}
