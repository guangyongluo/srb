package com.vilin.srb.core.controller.admin;


import com.vilin.common.exception.Assert;
import com.vilin.common.result.ResponseEnum;
import com.vilin.common.result.Result;
import com.vilin.srb.core.pojo.entity.IntegralGrade;
import com.vilin.srb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author Leo
 * @since 2021-06-02
 */
@Api(tags = "积分等级管理")
@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
@Slf4j
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @ApiOperation("积分等级列表")
    @GetMapping("/list")
    public Result listAll() {
        List<IntegralGrade> list = integralGradeService.list();

        log.info("hi i'm helen");
        log.warn("warning!!!");
        log.error("it's a error");


        return Result.ok().message("获取列表成功").data("list", list);
    }

    @ApiOperation(value = "根据id删除数据记录", notes = "逻辑删除数据记录")
    @DeleteMapping("/remove/{id}")
    public Result removeById(@ApiParam(value = "数据id", example = "100", required = true) @PathVariable Long id) {
        boolean result = integralGradeService.removeById(id);
        if (result) {
            return Result.ok().message("删除成功");
        } else {
            return Result.error().message("删除失败");
        }
    }

    @ApiOperation("新增积分等级")
    @PostMapping("/save")
    public Result save(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade) {

        Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.BORROW_AMOUNT_NULL_ERROR);

        boolean result = integralGradeService.save(integralGrade);
        if (result) {
            return Result.ok().message("保存成功");
        } else {
            return Result.error().message("保存失败");
        }
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get/{id}")
    public Result getById(
            @ApiParam(value = "数据id", required = true, example = "1")
            @PathVariable Long id) {

        IntegralGrade integralGrade = integralGradeService.getById(id);
        if (integralGrade != null) {
            return Result.ok().data("record", integralGrade);
        } else {
            return Result.error().message("数据获取失败");
        }
    }

    @ApiOperation("更新积分等级")
    @PutMapping("/update")
    public Result updateById(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade) {

        boolean result = integralGradeService.updateById(integralGrade);
        if (result) {
            return Result.ok().message("更新成功");
        } else {
            return Result.error().message("保存失败");
        }
    }
}

