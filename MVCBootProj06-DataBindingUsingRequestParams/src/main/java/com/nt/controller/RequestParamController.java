package com.nt.controller;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class RequestParamController {
  @GetMapping("/data")
	/*public String process(@RequestParam("sno") int no, @RequestParam("sname") String name) {
	  System.out.println(no+" "+name);*/
  /*public String proess(@RequestParam() int sno, @RequestParam(required=false) String sname) {
	  System.out.println(sno+" "+sname);*/
  /* public String process(@RequestParam("sno") int no, @RequestParam(defaultValue="rrr") String name) {
	  System.out.println(no+" "+name);*/
  /* public String process(@RequestParam(name="sno",defaultValue="1001") int no,@RequestParam("sname") String name){
	  System.out.println(no+" "+name);*/
  /*  public String process(@RequestParam(name="sno",required=false) Integer no,@RequestParam("sname") String name){
		  System.out.println(no+" "+name);*/
  /* public String process(@RequestParam("sno") int no,
		                                     @RequestParam("sname") String name,
		                                     @RequestParam("sadd") String[] addrs,
		                                     @RequestParam("sadd") Set<String> saddset,
		                                     @RequestParam("sadd") List<String> saddlist){
	  System.out.println(no+" "+name+" "+Arrays.toString(addrs)+" "+saddset+" "+saddlist);*/
  public String process(@RequestParam("sno") int no,
		                                     @RequestParam("sname") String name,
		                                     @RequestParam("sadd") String addrs) {
	  System.out.println(no+" "+name+" "+addrs);
		return "show_result";
	}
}
