package com.stg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.entity.Foo;

import org.apache.commons.lang3.RandomStringUtils;

//@RestController
//@RequestMapping(value = "/foos")
public class FooController {

//	@GetMapping(value = "/{id}")
//	public Foo findOne(@PathVariable Long id) {
//		return new Foo(Long.parseLong(RandomStringUtils.randomNumeric(2)), RandomStringUtils.randomAlphabetic(4));
//	}
//
//	@GetMapping
//	public List<Foo> findAll() {
//		List<Foo> fooList = new ArrayList<Foo>();
//		fooList.add(new Foo(Long.parseLong(RandomStringUtils.randomNumeric(2)), RandomStringUtils.randomAlphabetic(4)));
//		fooList.add(new Foo(Long.parseLong(RandomStringUtils.randomNumeric(2)), RandomStringUtils.randomAlphabetic(4)));
//		fooList.add(new Foo(Long.parseLong(RandomStringUtils.randomNumeric(2)), RandomStringUtils.randomAlphabetic(4)));
//		return fooList;
//	}
//
//	@PostMapping
//	public void create(@RequestBody Foo newFoo) {
//		System.out.println("Foo created");
//	}

}