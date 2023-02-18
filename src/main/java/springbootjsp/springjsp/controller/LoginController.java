package springbootjsp.springjsp.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@Autowired
	RepositoryUser ru;
	@Autowired
	ProductRepository pr;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String adminPage(Model model, @RequestParam String adminId, @RequestParam String adminPassword) {
		if (adminId.equalsIgnoreCase("admin") && adminPassword.equalsIgnoreCase("admin")) {
			model.addAttribute("Databasebean", ru.findAll());
			model.addAttribute("Productbean", pr.findAll());
			return "adminMain";
		}
		return "login";
	}

	@PostMapping("/AddProduct")
	public String addProduct(Model model, @RequestParam String pname, @RequestParam String psize,
			@RequestParam String pprice) {
		Productbean pdbObj = new Productbean();
		pdbObj.setProductname(pname);
		pdbObj.setProductsize(psize);
		pdbObj.setProductprice(pprice);
		pr.save(pdbObj);
		model.addAttribute("Databasebean", ru.findAll());
		model.addAttribute("Productbean", pr.findAll());
		return "adminMain";
	}

	@GetMapping("addJspMethod")
	public String addJspMethod() {
		return "addproduct";
	}

	@GetMapping("/deleteProduct")
	public String deleteProduct(Model model, @RequestParam String pn, @RequestParam String ps,
			@RequestParam String pp) {
		Productbean pdbObj = new Productbean();
		pdbObj.setProductname(pn);
		pdbObj.setProductsize(ps);
		pdbObj.setProductprice(pp);
		pr.delete(pdbObj);
		model.addAttribute("Databasebean", ru.findAll());
		model.addAttribute("Productbean", pr.findAll());
		return "adminMain";
	}

	@GetMapping("updateProductJsp")
	public String updateProductJsp(Model model, @RequestParam String pn, @RequestParam String ps,
			@RequestParam String pp) {
		Productbean pdbObj = new Productbean();
		pdbObj.setProductname(pn);
		pdbObj.setProductsize(ps);
		pdbObj.setProductprice(pp);
		model.addAttribute("productDetails", pdbObj);
		return "updateproduct";
	}

	@GetMapping("/afterUpdate")
	public String afterUpdateMethod(Model model, @RequestParam String pn, @RequestParam String ps,
			@RequestParam String pp) {
		Productbean pdbObj = new Productbean();
		pdbObj.setProductname(pn);
		pdbObj.setProductsize(ps);
		pdbObj.setProductprice(pp);
		pr.save(pdbObj);
		model.addAttribute("Databasebean", ru.findAll());
		model.addAttribute("Productbean", pr.findAll());
		return "adminMain";
	}

	@GetMapping("/buyMappingMethod")
	public String buyMappingMethod(Model model, @RequestParam String pn, @RequestParam String ps,
			@RequestParam String pp) {
		Productbean pdbObj = new Productbean();
		pdbObj.setProductname(pn);
		pdbObj.setProductsize(ps);
		pdbObj.setProductprice(pp);
		pr.delete(pdbObj);
		model.addAttribute("productList", pr.findAll());
		return "userMain";
	}

	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public String userPage(Model model, @RequestParam("userId") String userId,
			@RequestParam("userPassword") String userPassword) throws userNotFountException {
		List<Databasebean> DBB = ru.findByUsername(userId);

		Iterator<Databasebean> i = DBB.iterator();
		if (i.hasNext()) {
			Databasebean refDbb = i.next();
			if (refDbb.getUserpassword().equals(userPassword)) {
				model.addAttribute("productList", pr.findAll());
				return "userMain";
			}
		} else {
			throw new userNotFountException("user Not Found");
		}
		return "login";
	}
}