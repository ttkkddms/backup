package com.kh.myapp0;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/")


public class HomeController {
  @GetMapping
//  기본()값은 위에 매핑값 =("/")
  public String home() {

    return "index";
  }

  @GetMapping("/x")
  public String home2(
      @RequestParam("name") String name,
      @RequestParam("age") int age) {

    log.info("name:{}", name);
    log.info("age:{}", age);

    log.info("name:{}, age:{}", name, age);

    return "x";
  }

  @GetMapping("/y")
  public String sum(
      @RequestParam("op1") int operand1,
      @RequestParam("op2") int operand2,
      Model model
  ) {
    int sum = operand1 + operand2;
    log.info("{}+{}={}", operand1, operand2, sum);
    model.addAttribute("op1", operand1);
    model.addAttribute("op2", operand2);
    model.addAttribute("sum", sum);

    return "result";
    //payload 전달방식
    // 1. 쿼리 파라미터 : http://localhost:9080/y?op1=10&op2=20
    // 2. url경로에 포함  : http://localhost:9080/y/10/20
    // 3. 요청메세지를 바디에 포함 :
//    서버응답
//    1. html (view+data)
//    2. json (data)
  }

  @GetMapping("/y/{op1}/{op2}")
  public String sum2(
      @PathVariable("op1") int operand1,
      @PathVariable("op2") int operand2,
      Model model
  ) {
    return "result";
  }

  //http://localhost:9080/y/10?op2=20
  @GetMapping("/y/{op1}")
  public String sum3(
      @PathVariable("op1") int operand1,
      @RequestParam("op2") int operand2,
      Model model) {
    int sum = operand1 + operand2;
    log.info("{}+{}={}", operand1, operand2, sum);

    model.addAttribute("op1", operand1);
    model.addAttribute("op2", operand2);
    model.addAttribute("sum", sum);
    return "result";
  }


/*덧셈양식*/
  @GetMapping("/sum")
  public String formOfSum() {

    return "addForm";
  }

  //덧셈 처리
  @PostMapping("/sum")
  public String result(
      @RequestParam("op1") int op1,
      @RequestParam("op2") int op2,
      Model model
  ) {
    int sum = op1 + op2;
    model.addAttribute("op1", op1);
    model.addAttribute("op2", op2);
    model.addAttribute("result",sum);
    return "addForm";
  }
}
