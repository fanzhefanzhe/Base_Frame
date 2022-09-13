package com.helen.delay.service.controller;


import com.github.pagehelper.PageInfo;
import com.helen.delay.service.api.IPeopleService;
import com.helen.delay.service.model.People;
import com.helen.delay.service.model.response.Result;
import com.helen.delay.shared.domain.base.PageResult;
import com.helen.delay.shared.domain.param.PeopleReq;
import com.helen.delay.shared.domain.vo.PeopleListVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author: 樊喆
 */

@Slf4j
@RestController
@RequestMapping(value = "/helen/people")
@AllArgsConstructor
public class PeopleController {

    private final IPeopleService peopleService;

    @PostMapping(value = "")
    public List<People> queryPeopleList(@Valid PeopleReq peopleReq){
        return peopleService.selectAll(peopleReq);
    }

    @GetMapping(value = "/{id}")
    public Result<People> queryPeople(@PathVariable("id") Long id){
        return  Result.ok(peopleService.queryPeopleById(id));
    }

    @PostMapping(value = "pageInfo")
    public Result<PageInfo<PeopleListVo>> queryPeoplePageInfo(@Valid PeopleReq peopleReq){
        return Result.ok(peopleService.selectAllPageInfo(peopleReq));
    }

    @PostMapping(value = "pageInfoOld")
    public Result<PageInfo<PeopleListVo>> queryPeoplePageInfoOld(@Valid PeopleReq peopleReq){
        return Result.ok(peopleService.selectAllPageInfoOld(peopleReq));
    }

}
